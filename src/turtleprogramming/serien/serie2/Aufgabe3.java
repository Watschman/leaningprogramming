package turtleProgramming.serien.serie2;

import ch.aplu.turtle.Turtle;

public class Aufgabe3 {
    Aufgabe3() {
        final double x = -30;
        final double y = -30;
        final double length = 120;
        final double arc = 144;
        Turtle turtle = new Turtle();
        turtle.setPos(x, y);
        for (int i = 0; i < 5; i++) {
            turtle.fd(length).rt(arc);
        }
    }
    public static void main(String[] args) {
        new Aufgabe3();
    }
}
