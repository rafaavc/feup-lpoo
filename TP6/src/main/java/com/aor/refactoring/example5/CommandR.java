package com.aor.refactoring.example5;

public class CommandR implements Command {
    public void execute(DirectionState dir) {
        dir.turnRight();
    }
}
