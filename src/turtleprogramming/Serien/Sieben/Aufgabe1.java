package turtleprogramming.Serien.Sieben;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

import java.awt.*;

public class Aufgabe1 {
    Aufgabe1() {
        final double length = 40;
        double x = -140;
        Turtle turtle = new Turtle();
        Color color = Color.red;
        turtle.hideTurtle().setPos(x, 0).lt(30);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                FigurHelper.Dreieck(length, color, true, turtle, true);
                turtle.rt(90);
            }
            x = x + 90;
            turtle.setPos(x, 0);
        }
    }
    public static void main(String[] args) {
        new Aufgabe1();
    }
}
