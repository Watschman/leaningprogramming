package turtleprogramming.Serien.Sechs;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

public class Aufgabe3 {
    Aufgabe3() {
        final double finish_length = 120;
        double lengrh = 20;
        Turtle turtle = new Turtle();
        turtle.setPos(-200, 0);
        while (lengrh < finish_length){
            FigurHelper.Kreis(lengrh, turtle.getPenColor(), false, turtle, true);
            lengrh = (lengrh / 100) * 110;
        }
    }
    public static void main(String[] args) {
        new Aufgabe3();
    }
}
