package turtleProgramming.serien.serie4;

import ch.aplu.turtle.Turtle;
import turtleProgramming.util.FigurHelper;

import java.awt.*;

public class Aufgabe4 {
    Aufgabe4() {
        final double radius = 70;
        final double arc = 120;
        Turtle turtle = new Turtle();
        Color color = Color.green;
        turtle.setColor(Color.red);
        for (int i = 0; i < 3; i++) {
            FigurHelper.Kreis(radius, color, true, turtle, true);
            turtle.right(arc);
        }
    }
    public static void main(String[] args) {
        new Aufgabe4();
    }
}
