package turtleprogramming.serien.serie6;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

public class Aufgabe2 {
    Aufgabe2() {
        double length = 200;
        Turtle turtle = new Turtle();
        turtle.hideTurtle().rt(150);
        while (length > 1){
            FigurHelper.Dreieck(length, turtle.getPenColor(), false, turtle, true);
            turtle.rt(15);
            length = (length / 100) * 90;
        }
    }
    public static void main(String[] args) {
        new Aufgabe2();
    }
}
