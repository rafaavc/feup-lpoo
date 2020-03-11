import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena {
    private int width;
    private int height;
    Hero hero;
    private List<Wall> walls;
    private List<Coin> coins;
    private List<Monster> monsters;
    private int gameState = 1;

    public int getGameState() {
        return gameState;
    }

    public Arena(int width, int height) {
        this.width = width;
        this.height = height;
        hero = new Hero(3, 3);
        walls = createWalls();
        monsters = createMonsters();
        coins = createCoins();
    }

    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c, 0));
            walls.add(new Wall(c, height - 1));
        }

        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(0, r));
            walls.add(new Wall(width - 1, r));
        }

        return walls;
    }

    private List<Coin> createCoins() {
        Random random = new Random();
        ArrayList<Coin> coins = new ArrayList<>();
        int x, y;
        for (int i = 0; i < 5; i++) {
            while (true) {
                x = random.nextInt(width - 2) + 1;
                y = random.nextInt(height - 2) + 1;

                Position position = new Position(x, y);
                if (!position.equals(hero.getPosition())) {
                    boolean safe = true;
                    for (int j = 0; i < coins.size(); j++) {
                        if (position.equals(coins.get(j).getPosition())) {
                            safe = false;
                            break;
                        }
                    }
                    for (int j = 0; j < monsters.size(); j++) {
                        if (position.equals(monsters.get(j).getPosition())) {
                            safe = false;
                            break;
                        }
                    }
                    if (safe) break;
                }
            }
            coins.add(new Coin(x, y));
        }
        return coins;
    }

    private List<Monster> createMonsters() {
        Random random = new Random();
        List<Monster> monsters = new ArrayList<>();
        int x, y;
        for (int i = 0; i < 3; i++) {
            while (true) {
                x = random.nextInt(width - 2) + 1;
                y = random.nextInt(height - 2) + 1;

                Position position = new Position(x, y);
                if (!position.equals(hero.getPosition())) {
                    break;
                }
            }
            monsters.add(new Monster(x, y));
        }
        return monsters;
    }

    private void retrieveCoins(Position position) {
        for (int i = 0; i < coins.size(); i++) {
            if (coins.get(i).getPosition().equals(position)) {
                coins.remove(coins.get(i));
                break;
            }
        }
    }

    private boolean canHeroMove(Position position) {
        // Implemented .equals method for position but I'm not doing verification that way
        return position.getX() < width-1 && position.getY() < height-1 && position.getX() >= 1 && position.getY() >= 1;
    }

    private void moveHero(Position position) {
        if (canHeroMove(position)) {
            hero.setPosition(position);
            retrieveCoins(position);
        }
        moveMonsters();
        for (Monster monster : monsters) {
            if (hero.getPosition().equals(monster.getPosition())) {
                this.gameState = 0;
            }
        }
    }

    private boolean canMonsterMove(Position position) {
        if (position.getX() < width-1 && position.getY() < height-1 && position.getX() >= 1 && position.getY() >= 1) {
            for (Coin coin : coins) {
                if (position.equals(coin.getPosition())) return false;
            } return true;
        } return false;
    }

    private void moveMonsters() {
        Random random = new Random();
        for (Monster monster : monsters) {
            while (true) {
                int x, y = 0;
                x = random.nextInt(3) - 1;
                if (x == 0) {
                    y = random.nextInt(2);
                    if (y == 0) y = -1;
                }
                Position position = new Position(monster.getPosition().getX() + x, monster.getPosition().getY() + y);
                if (canMonsterMove(position)) {
                    monster.setPosition(position);
                    break;
                }
            }
        }
    }

    public void processKey(KeyStroke key) {
        switch(key.getKeyType()) {
            case ArrowUp:
                moveHero(hero.moveUp());
                break;
            case ArrowDown:
                moveHero(hero.moveDown());
                break;
            case ArrowRight:
                moveHero(hero.moveRight());
                break;
            case ArrowLeft:
                moveHero(hero.moveLeft());
                break;
            default:
                break;
        }
    }

    public void draw(TextGraphics graphics) {
        // drawing arena
        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');
        // drawing walls
        for (Wall wall : walls)
            wall.draw(graphics);

        for (Monster monster : monsters) {
            monster.draw(graphics);
        }

        for (Coin coin : coins)
            coin.draw(graphics);

        // drawing hero
        hero.draw(graphics);
    }

}
