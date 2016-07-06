package turtleprogramming.serien.serie4;

import ch.aplu.turtle.Turtle;

import java.awt.*;

public class Aufgabe1 {
    Aufgabe1() {
        final double length = 100;
        final double arc_A = 80;
        final double arc_B = 140;
        final int penWidth = 3;
        Turtle turtle = new Turtle();
        Color penColor = Color.red;
        Color fillColor = Color.yellow;
        Color backgroundColor = Color.blue;
        turtle.setPos(-length, -length).setPenColor(penColor).setPenWidth(penWidth).setFillColor(backgroundColor).fill().setFillColor(fillColor).rt(20);
        for (int i = 0; i < 12; i++) {
            turtle.fd(length);
            if (i % 2 == 0)
                turtle.lt(arc_A);
            else
                turtle.rt(arc_B);
        }
        turtle.fill(0,0);
    }
    public static void main(String[] args) {
        new Aufgabe1();
    }
}
