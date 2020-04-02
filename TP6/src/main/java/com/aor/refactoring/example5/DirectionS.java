package com.aor.refactoring.example5;

public class DirectionS extends DirectionState {
    DirectionS() {
        super('S');
    }
    DirectionS(Turtle turtle) {
        super('S', turtle);
    }
    void moveForward() {
        turtle.incrementRow();
    }
    void turnLeft() {
        turtle.setDirection(new DirectionE(turtle));
    }
    void turnRight() {
        turtle.setDirection(new DirectionW(turtle));
    }
}
