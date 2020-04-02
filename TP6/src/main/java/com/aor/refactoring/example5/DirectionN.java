package com.aor.refactoring.example5;

public class DirectionN extends DirectionState {
    DirectionN() {
        super('N');
    }
    DirectionN(Turtle turtle) {
        super('N', turtle);
    }
    void moveForward() {
        turtle.decrementRow();
    }
    void turnLeft() {
        turtle.setDirection(new DirectionW(turtle));
    }
    void turnRight() {
        turtle.setDirection(new DirectionE(turtle));
    }
}
