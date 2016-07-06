package turtleprogramming.serien.serie9;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

import java.awt.*;

public class Aufgabe1 {
    Aufgabe1() {
        final int repeats = 6;
        final double startsize = 100;
        final double x = 0;
        final double y = -100;
        Turtle turtle = new Turtle();
        Color color = Color.blue;
        turtle.hideTurtle().lt(210);
        go(startsize, color, repeats, turtle, x, y);
    }
    private static void go(double length, Color color, int repeatation, Turtle turtle, double x, double y){
        if (repeatation != 0){
            turtle.setPos(x, y);
            FigurHelper.Dreieck(length, color, false, turtle, true);
            y = y + length;
            double x0 = x + length;
            double x1 = x - length;
            length = length / 2;
            repeatation = repeatation - 1;
            go(length, color, repeatation, turtle, x0, y);
            go(length, color, repeatation, turtle, x1, y);
        }
    }
    public static void main(String[] args) {
        new Aufgabe1();
    }
}
