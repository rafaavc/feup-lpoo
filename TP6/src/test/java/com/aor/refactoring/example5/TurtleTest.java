package com.aor.refactoring.example5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurtleTest {

    @Test
    public void testRotateLeft() {
        Turtle turtle = new Turtle(5, 5, new DirectionN());
        turtle.execute(new CommandL()); assertEquals('W', turtle.getDirection());
        turtle.execute(new CommandL()); assertEquals('S', turtle.getDirection());
        turtle.execute(new CommandL()); assertEquals('E', turtle.getDirection());
        turtle.execute(new CommandL()); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testRotateRight() {
        Turtle turtle = new Turtle(5, 5, new DirectionN());
        turtle.execute(new CommandR()); assertEquals('E', turtle.getDirection());
        turtle.execute(new CommandR()); assertEquals('S', turtle.getDirection());
        turtle.execute(new CommandR()); assertEquals('W', turtle.getDirection());
        turtle.execute(new CommandR()); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testForward() {
        Turtle turtleN = new Turtle(5, 5, new DirectionN());

        turtleN.execute(new CommandF());
        assertEquals(4, turtleN.getRow());
        assertEquals(5, turtleN.getColumn());

        Turtle turtleW = new Turtle(5, 5, new DirectionW());

        turtleW.execute(new CommandF());
        assertEquals(5, turtleW.getRow());
        assertEquals(4, turtleW.getColumn());

        Turtle turtleS = new Turtle(5, 5, new DirectionS());

        turtleS.execute(new CommandF());
        assertEquals(6, turtleS.getRow());
        assertEquals(5, turtleS.getColumn());

        Turtle turtleE = new Turtle(5, 5, new DirectionE());

        turtleE.execute(new CommandF());
        assertEquals(5, turtleE.getRow());
        assertEquals(6, turtleE.getColumn());
    }

}