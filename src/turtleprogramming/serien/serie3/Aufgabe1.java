package turtleProgramming.serien.serie3;

import ch.aplu.turtle.Turtle;

public class Aufgabe1 {
    Aufgabe1() {
        final double length = 100;
        final double arc_a = 60;
        final double arc_b = 20;
        Turtle turtle = new Turtle();
        turtle.hideTurtle();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 6; j++) {
                turtle.fd(length).rt(arc_a);
            }
            turtle.rt(arc_b);
        }
    }
    public static void main(String[] args) {
        new Aufgabe1();
    }
}