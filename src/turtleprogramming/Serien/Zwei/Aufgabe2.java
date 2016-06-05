package turtleprogramming.Serien.Zwei;

import ch.aplu.turtle.Turtle;

public class Aufgabe2 {
    Aufgabe2() {
        final int length = 80;
        final int arc = 45;
        Turtle turtle = new Turtle();
        turtle.setPos(-100, -40);
        for (int i = 0; i < 8; i++) {
            turtle.fd(length).rt(arc);
        }
    }
    public static void main(String[] args) {
        new Aufgabe2();
    }
}
