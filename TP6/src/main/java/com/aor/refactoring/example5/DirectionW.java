package com.aor.refactoring.example5;

public class DirectionW extends DirectionState {
    DirectionW() {
        super('W');
    }
    DirectionW(Turtle turtle) {
        super('W', turtle);
    }
    void moveForward() {
        turtle.decrementColumn();
    }
    void turnLeft() {
        turtle.setDirection(new DirectionS(turtle));
    }
    void turnRight() {
        turtle.setDirection(new DirectionN(turtle));
    }
}
