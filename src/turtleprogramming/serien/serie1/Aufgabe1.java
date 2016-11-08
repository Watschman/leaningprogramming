package turtleProgramming.serien.serie1;

import ch.aplu.turtle.Turtle;
import turtleProgramming.util.FigurHelper;

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
