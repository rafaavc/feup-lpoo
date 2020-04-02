package com.aor.refactoring.example5;

public class Turtle {
    private int row, column;
    private char direction;

    public Turtle(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getDirection() {
        return direction;
    }

    private void rotateLeft() {
        if (direction == 'N') direction = 'W';
        else if (direction == 'W') direction = 'S';
        else if (direction == 'S') direction = 'E';
        else if (direction == 'E') direction = 'N';
    }

    private void rotateRight() {
        if (direction == 'N') direction = 'E';
        else if (direction == 'E') direction = 'S';
        else if (direction == 'S') direction = 'W';
        else if (direction == 'W') direction = 'N';
    }

    private void moveForward() {
        if (direction == 'N') row--;
        else if (direction == 'S') row++;
        else if (direction == 'W') column--;
        else if (direction == 'E') column++;
    }

    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            rotateLeft();
        } else if (command == 'R') { // ROTATE RIGHT
            rotateRight();
        } else if (command == 'F'){ // MOVE FORWARD
            moveForward();
        }
    }
}
