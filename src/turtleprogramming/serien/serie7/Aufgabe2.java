package turtleprogramming.serien.serie7;

import ch.aplu.turtle.Turtle;

import java.awt.*;

public class Aufgabe2 {
    Aufgabe2() {
        final double cycle_length = 1.8;
        final double star_length = 10;
        Turtle turtle = new Turtle();
        Color starcolor = Color.yellow;
        Color backgroundcolor = Color.blue;
        turtle.hideTurtle().setFillColor(backgroundcolor).fill().setPenColor(starcolor).setPenWidth(1).setPos(-100, 0);
        for (int i = 0; i < 12; i++) {
            stern(turtle, star_length, starcolor);
            turtle.penUp();
            for (int j = 0; j < 30; j++) {
                turtle.fd(cycle_length).rt(1);
            }
            turtle.penDown();
        }
    }
    private static void stern(Turtle turtle, double size, Color color){
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0)
                turtle.forward(size).lt(80);
            else
                turtle.forward(size).rt(140);
        }
        turtle.penUp().fd(size + 1).setFillColor(color).fill().bk(size + 1).penDown();
    }
    public static void main(String[] args) {
        new Aufgabe2();
    }
}
