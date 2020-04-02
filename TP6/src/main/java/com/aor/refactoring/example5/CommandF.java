package com.aor.refactoring.example5;

public class CommandF implements Command {
    public void execute(DirectionState dir) {
        dir.moveForward();
    }
}
