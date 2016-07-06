package turtleprogramming.serien.serie1;

import ch.aplu.turtle.Turtle;

public class Aufgabe2 {
    Aufgabe2() {
        final int length = 80;
        final int arc = 60;
        Turtle turtle = new Turtle();
        turtle.setPos(-60, -30);
        for (int i = 0; i < 6; i++) {
            turtle.fd(length).rt(arc);
        }
    }
    public static void main(String[] args) {
        new Aufgabe2();
    }
}
