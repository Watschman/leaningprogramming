package turtleprogramming.Serien.Eins;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

import java.awt.*;

public class Aufgabe1 {
    Aufgabe1() {
        Turtle turtle = new Turtle();
        FigurHelper.Dreieck(100, Color.blue, false,turtle, true);
    }
    public static void main(String[] args) {
        new Aufgabe1();
    }
}
