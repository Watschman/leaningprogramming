package turtleprogramming.serien.serie4;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

import java.awt.*;

public class Aufgabe3 {
    Aufgabe3() {
        final double radius = 90;
        Turtle turtle = new Turtle();
        Color color = Color.green;
        turtle.setColor(Color.red);
        FigurHelper.Kreis(radius, color, true, turtle, true);
        FigurHelper.Kreis(radius, color, true, turtle, false);
    }
    public static void main(String[] args) {
        new Aufgabe3();
    }
}
