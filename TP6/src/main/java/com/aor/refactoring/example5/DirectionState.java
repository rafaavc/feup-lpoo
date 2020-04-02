package com.aor.refactoring.example5;

abstract class DirectionState {
    Turtle turtle;
    char direction;

    DirectionState(char direction) {
        this.direction = direction;
    }
    DirectionState(char direction, Turtle turtle) {
        this.direction = direction;
        this.turtle = turtle;
    }

    abstract void turnRight();
    abstract void turnLeft();
    abstract void moveForward();

    void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }
    char getDirection() {
        return direction;
    }
}

