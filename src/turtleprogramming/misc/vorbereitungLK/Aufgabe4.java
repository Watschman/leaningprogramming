package turtleProgramming.misc.vorbereitungLK;

import ch.aplu.turtle.Turtle;

import java.awt.*;

public class Aufgabe4 {
    Aufgabe4() {
        final double length = 300;
        final double x = -(length / 3);
        final double y = -(length / 2);
        final int repeats = 6;
        Turtle turtle = new Turtle();
        Color color = Color.black;
        turtle.setColor(color).setPenColor(color).setFillColor(color).hideTurtle();
        paint(turtle, length, x, y, repeats);
    }
    private void paint(Turtle turtle, double length, double x, double y, int repitiion){
        if (repitiion != 0){
            turtle.home().setPos(x, y);
            double x1 = turtle.getX();
            double y1 = turtle.getY();
            turtle.fd(length / 2);
            double x2 = turtle.getX();
            double y2 = turtle.getY();
            turtle.fd(length / 2).rt(120).fd(length).rt(120).fd(length / 2);
            double x3 = turtle.getX();
            double y3 = turtle.getY();
            turtle.fd(length/2);
            length = length / 2;
            repitiion--;
            paint(turtle, length, x1, y1, repitiion);
            paint(turtle, length, x2, y2, repitiion);
            paint(turtle, length, x3, y3, repitiion);
        }
    }
    public static void main(String[] args) {
        new Aufgabe4();
    }
}
