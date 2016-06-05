package turtleprogramming.Serien.Eins;

import ch.aplu.turtle.Turtle;

public class Aufgabe3 {
    Aufgabe3() {
        final int legth = 80;
        final int arc = 90;
        Turtle turtle = new Turtle();
        turtle.setPos(-110, -30).rt(45);
        for (int i = 0; i < 4; i++) {
            turtle.fd(legth);
            if (i % 2 == 0)
                turtle.right(arc);
            else
                turtle.left(arc);
        }
    }

    //wrapping
    public static void main(String[] args) {
        new Aufgabe3();
    }
}
