import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {
    private Screen screen;
    Arena arena;

    public Game() {
        try {
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            screen = new TerminalScreen(terminal);

            screen.setCursorPosition(null);
            screen.startScreen();
            screen.doResizeIfNecessary();

            arena = new Arena(60, 15);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processKey(KeyStroke key) throws IOException {
        if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q') {
            screen.close();
            return;
        }
        arena.processKey(key);
    }

    private void gameOver() {
        try {
            screen.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void draw() throws IOException {
        screen.clear();

        arena.draw(screen.newTextGraphics());
        screen.refresh();
    }

    public void run() {
        try {
            while(true) {
                draw();
                KeyStroke key = screen.readInput();
                if (key.getKeyType() == KeyType.EOF) {
                    break;
                }
                processKey(key);
                if (arena.getGameState() == 0) gameOver();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
