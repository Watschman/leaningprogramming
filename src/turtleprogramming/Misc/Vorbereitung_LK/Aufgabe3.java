package turtleprogramming.Misc.Vorbereitung_LK;

import ch.aplu.turtle.Turtle;

import java.awt.*;

public class Aufgabe3 {
    private static final double changemultiplier = 3;
    private static final double change = 1 / changemultiplier;
    Color color = Color.black;
    Aufgabe3() {
        final double length = 150;
        final double x = -75;
        final double y = -75;
        final int repeats = 4;
        Turtle turtle = new Turtle();
        turtle.hideTurtle();
        paint(turtle, length, repeats, x, y, turtle.heading());
    }
    private void paint(Turtle turtle, double length, int repitions, double x, double y, double heading){
        turtle.setColor(color).setPenColor(color).setFillColor(color);
        if (repitions != 0){
            turtle.setPos(x, y).fd(length*change);
            double x1 = turtle.getX();
            double y1 = turtle.getY();
            turtle.fd(length*(change*2)).rt(90).fd(length*change);
            double x2 = turtle.getX();
            double y2 = turtle.getY();
            turtle.fd(length*(change*2)).rt(90).fd(length*change);
            double x3 = turtle.getX();
            double y3 = turtle.getY();
            turtle.fd(length*(change*2)).rt(90).fd(length).rt(90);
            repitions--;
            length = length/changemultiplier;
            heading = turtle.heading();
            turtle.home().setHeading(heading -90);
            paint(turtle, length, repitions, x1, y1, heading);
            turtle.home().setHeading(heading);
            paint(turtle, length, repitions, x2, y2, heading);
            turtle.home().setHeading(heading + 90);
            paint(turtle, length, repitions, x3, y3, heading);
        }
        else{
            turtle.setPos(x, y);
            for (int k = 0; k < 4; k++) {
                turtle.fd(length).rt(90);
            }
        }
    }
    public static void main(String[] args) {
        new Aufgabe3();
    }
}
