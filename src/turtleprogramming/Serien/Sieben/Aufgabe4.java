package turtleprogramming.Serien.Sieben;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

import java.awt.*;

public class Aufgabe4 {
    Aufgabe4() {
        double length_little = 10;
        double length_medium = length_little * 2;
        double length_huge = length_medium * 2;
        Turtle turtle = new Turtle();
        turtle.hideTurtle().setPenWidth(1).setPos(-150, -160);
        for (int i = 0; i < 3; i++) {
            double x0 = turtle.getX();
            double y0 = turtle.getY();
            for (int j = 0; j < 4; j++) {
                double x1 = turtle.getX();
                double y1 = turtle.getY();
                turtle.home().setPos(x1, y1);
                switch (i){
                    case 0:
                        kleeblatt(Color.blue, turtle, length_little);
                        break;
                    case 1:
                        kleeblatt(Color.green, turtle, length_medium);
                        break;
                    case 2:
                        kleeblatt(Color.red, turtle, length_huge);
                }
                turtle.setPos(x1 + 100, y1);
            }
            turtle.setPos(x0, y0 + 100);
        }
    }
    private void kleeblatt(Color color, Turtle turtle, double length){
        turtle.lt(30);
        for (int i = 0; i < 4; i++) {
            FigurHelper.Dreieck(length, color, true, turtle, true);
            turtle.rt(90);
        }
    }
    public static void main(String[] args) {
        new Aufgabe4();
    }
}