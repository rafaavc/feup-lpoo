package com.aor.refactoring.example5;

public class Turtle {
    int row, column;
    DirectionState direction;

    public Turtle(int row, int column, DirectionState direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
        direction.setTurtle(this);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void incrementRow() {
        row++;
    }
    public void incrementColumn() {
        column++;
    }
    public void decrementRow() {
        row--;
    }
    public void decrementColumn() {
        column--;
    }
    public void setDirection(DirectionState dir) {
        this.direction = dir;
    }

    public char getDirection() {
        return direction.getDirection();
    }

    public void execute(Command cmd) {
        cmd.execute(direction);
    }
}
