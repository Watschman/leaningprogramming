package turtleprogramming.Serien.Zwei;

import ch.aplu.turtle.Turtle;

public class Aufgabe6 {
    Aufgabe6() {
        Turtle turtle = new Turtle();
        turtle.hideTurtle().setPos(-120, -120);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 90; j++) {
                turtle.fd(2).rt(1);
            }
            turtle.lt(90);
        }
    }
    public static void main(String[] args) {
        new Aufgabe6();
    }
}
