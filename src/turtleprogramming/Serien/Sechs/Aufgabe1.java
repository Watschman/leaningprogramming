package turtleprogramming.Serien.Sechs;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

public class Aufgabe1 {
    Aufgabe1() {
        double length = 5;
        Turtle turtle = new Turtle();
        turtle.hideTurtle().setPos(-100, -100);
        while(length < 200){
            FigurHelper.Quadrad(length, turtle.getPenColor(), false, turtle, true);
            length = (length / 100) * 120;
        }
    }
    public static void main(String[] args) {new Aufgabe1();}
}