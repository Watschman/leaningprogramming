package turtleprogramming.serien.serie4;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

import java.awt.*;

public class Aufgabe2 {
    Aufgabe2() {
        final double length = 200;
        Turtle turtle = new Turtle();
        Color color = Color.red;
        turtle.lt(30);
        for (int i = 0; i < 4; i++) {
            FigurHelper.Dreieck(length, color, true, turtle, true);
            turtle.rt(90);
        }
    }
    public static void main(String[] args) {
        new Aufgabe2();
    }
}
