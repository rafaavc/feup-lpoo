package com.aor.refactoring.example5;

public class CommandL implements Command {
    public void execute(DirectionState dir) {
        dir.turnLeft();
    }
}
