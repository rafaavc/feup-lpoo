package com.aor.refactoring.example5;

public class DirectionE extends DirectionState {
    DirectionE() {
        super('E');
    }
    DirectionE(Turtle turtle) {
        super('E', turtle);
    }
    void moveForward() {
        turtle.incrementColumn();
    }
    void turnLeft() {
        turtle.setDirection(new DirectionN(turtle));
    }
    void turnRight() {
        turtle.setDirection(new DirectionS(turtle));
    }
}
