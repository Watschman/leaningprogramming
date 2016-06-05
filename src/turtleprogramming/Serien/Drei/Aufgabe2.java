package turtleprogramming.Serien.Drei;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

import java.awt.*;

public class Aufgabe2 {
    Aufgabe2() {
        final double length = 100;
        final double arc = 60;
        Turtle turtle = new Turtle();
        turtle.hideTurtle();
        for (int i = 0; i < 6; i++) {
            FigurHelper.Dreieck(length, Color.blue, false, turtle, true);
            turtle.rt(arc);
        }
    }
    public static void main(String[] args) {
        new Aufgabe2();
    }
}
