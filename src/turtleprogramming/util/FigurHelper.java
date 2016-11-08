package turtleProgramming.util;

import ch.aplu.turtle.Turtle;

import java.awt.*;

public class FigurHelper {

    public static void Dreieck(double size, Color color, boolean filled, Turtle turtle, boolean turnRight) {
        Color fillColor = turtle.getFillColor();
        Color penColor = turtle.getPenColor();
        if (filled) {
            turtle.setPenColor(color).setFillColor(color).fillToPoint(turtle.getX(), turtle.getY());
            if (turnRight) {
                for (int i = 0; i < 3; i++) {
                    turtle.fd(size).rt(120);
                }
            }
            else {
                for (int i = 0; i < 3; i++) {
                    turtle.fd(size).lt(120);
                }
            }
            turtle.fillOff();
        }
        else {
            turtle.setPenColor(color);
            if (turnRight) {
                for (int i = 0; i < 3; i++) {
                    turtle.fd(size).rt(120);
                }
            }
            else {
                for (int i = 0; i < 3; i++) {
                    turtle.fd(size).lt(120);
                }
            }
        }
        turtle.setFillColor(fillColor).setPenColor(penColor);
    }

    public static void Quadrad(double size, Color color, boolean filled, Turtle turtle, boolean turnRight) {
        Color fillColor = turtle.getFillColor();
        Color penColor = turtle.getPenColor();
        if (filled) {
            turtle.setPenColor(color).setFillColor(color).fillToPoint(turtle.getX(), turtle.getY());
            if (turnRight) {
                for (int i = 0; i < 4; i++) {
                    turtle.fd(size).rt(90);
                }
            }
            else {
                for (int i = 0; i < 4; i++) {
                    turtle.fd(size).lt(90);
                }
            }
            turtle.fillOff();
        }
        else {
            turtle.setPenColor(color);
            if (turnRight) {
                for (int i = 0; i < 4; i++) {
                    turtle.fd(size).rt(90);
                }
            }
            else {
                for (int i = 0; i < 4; i++) {
                    turtle.fd(size).lt(90);
                }
            }
        }
        turtle.setFillColor(fillColor).setPenColor(penColor);
    }

    public static void Rechteck(double sizeA, double sizeB, Color color, boolean filled, Turtle turtle, boolean turnRight) {
        Color fillColor = turtle.getFillColor();
        Color penColor = turtle.getPenColor();
        if (filled) {
            turtle.setPenColor(color).setFillColor(color).fillToPoint(turtle.getX(), turtle.getY());
            if (turnRight) {
                for (int i = 0; i < 2; i++) {
                    turtle.fd(sizeA).rt(90).fd(sizeB).rt(90);
                }
            }
            else {
                for (int i = 0; i < 2; i++) {
                    turtle.fd(sizeA).lt(90).fd(sizeB).lt(90);
                }
            }
            turtle.fillOff();
        }
        else {
            turtle.setPenColor(color);
            if (turnRight) {
                for (int i = 0; i < 2; i++) {
                    turtle.fd(sizeA).rt(90).fd(sizeB).rt(90);
                }
            }
            else {
                for (int i = 0; i < 2; i++) {
                    turtle.fd(sizeA).lt(90).fd(sizeB).lt(90);
                }
            }
        }
        turtle.setFillColor(fillColor).setPenColor(penColor);
    }

    public static void Kreis(double radius, Color color, boolean filled, Turtle turtle, boolean turnRight) {
        Color fillColor = turtle.getFillColor();
        Color penColor = turtle.getPenColor();
        if (filled) {
            turtle.setPenColor(color).setFillColor(color).fillToPoint(turtle.getX(), turtle.getY());
            if (turnRight) {
                turtle.rightCircle(radius);
            }
            else {
                turtle.leftCircle(radius);
            }
            turtle.fillOff();
        }
        else {
            turtle.setPenColor(color);
            if (turnRight) {
                turtle.rightCircle(radius);
            }
            else {
                turtle.leftCircle(radius);
            }
        }
        turtle.setFillColor(fillColor).setPenColor(penColor);

    }

    //TODO : fix it
    public static void HalbKreis(double durchmesser, Color color, boolean filled, Turtle turtle, boolean turnRight) {
        turtle.hideTurtle();
        Color fillColor = turtle.getFillColor();
        Color penColor = turtle.getPenColor();
        if (filled) {
            turtle.setPenColor(color).setFillColor(color).fillToPoint(turtle.getX(), turtle.getY());
            if (turnRight) {
                for (int i = 0; i < 180; i++) {
                    turtle.fd(durchmesser / 180).rt(1);
                }
            }
            else {
                for (int i = 0; i < 180; i++) {
                    turtle.fd(durchmesser / 180).lt(1);
                }
            }
            turtle.fillOff();
        }
        else {
            turtle.setPenColor(color);
            if (turnRight) {
                for (int i = 0; i < 180; i++) {
                    turtle.fd(durchmesser / 180).rt(1);
                }
            }
            else {
                for (int i = 0; i < 180; i++) {
                    turtle.fd(durchmesser / 180).lt(1);
                }
            }
        }
        turtle.showTurtle();
        turtle.setFillColor(fillColor).setPenColor(penColor);
    }
}