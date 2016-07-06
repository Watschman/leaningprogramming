package turtleprogramming.serien.serie6;

import ch.aplu.turtle.Turtle;

public class Aufgabe4 {
    Aufgabe4() {
        double length = 5;
        Turtle turtle = new Turtle();
        turtle.hideTurtle();
        while (length < 200){
            turtle.fd(length).rt(90);
            length = length + 3;
        }
    }
    public static void main(String[] args) {
        new Aufgabe4();
    }
}
