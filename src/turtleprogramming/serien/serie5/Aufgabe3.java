package turtleProgramming.serien.serie5;

import ch.aplu.turtle.Turtle;
import turtleProgramming.util.FigurHelper;

import java.awt.*;

public class Aufgabe3 {
    Aufgabe3() {
        final double length = 120;
        Turtle turtle = new Turtle();
        Color color;
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0)
                color = Color.red;
            else
                color = Color.green;
            FigurHelper.Dreieck(length, color, true, turtle, true);
            turtle.rt(60);
        }
    }
    public static void main(String[] args) {
        new Aufgabe3();
    }
}
