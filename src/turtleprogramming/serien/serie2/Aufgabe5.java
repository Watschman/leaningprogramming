package turtleprogramming.serien.serie2;

import ch.aplu.turtle.Turtle;

public class Aufgabe5 {
    Aufgabe5() {
        final double length = 20;
        final double k = 10;
        final double full = k * length;
        final double calc = full / 4;
        final double arc = 90;
        final double x = - calc;
        final double y = - calc;
        Turtle turtle = new Turtle();
        turtle.setPos(x, -y).rt(90);
        for (int i = 0; i < k; i++) {
            turtle.fd(length);
            if (i % 2 == 0)
                turtle.rt(arc);
            else
                turtle.lt(arc);
        }
    }
    public static void main(String[] args) {
        new Aufgabe5();
    }
}