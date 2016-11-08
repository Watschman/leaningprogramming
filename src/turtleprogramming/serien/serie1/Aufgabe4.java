package turtleProgramming.serien.serie1;

import ch.aplu.turtle.Turtle;

public class Aufgabe4 {
    Aufgabe4() {
        final int legth = 80;
        final int arc = 90;
        Turtle turtle = new Turtle();
        turtle.setPos(-80, -40);
        for (int i = 0; i < 5; i++) {
            turtle.fd(legth);
            if (i < 2)
                turtle.right(arc);
            else
                turtle.left(arc);
        }
    }
    public static void main(String[] args) {
        new Aufgabe4();
    }
}
