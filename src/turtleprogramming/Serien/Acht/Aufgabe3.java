package turtleprogramming.Serien.Acht;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

import java.awt.*;

class Aufgabe3 {
    Turtle t0 = new Turtle();
    Turtle t1 = new Turtle(t0);
    Aufgabe3() {
        t0.setPos(-200, 0);
        t1.setPos(-150, 0);
        for (int i = 0; i < 4; i++) {
            double x0 = t0.getX();
            double x1 = t1.getX();
            FigurHelper.Quadrad(50, Color.blue, false, t0, true);
            FigurHelper.Quadrad(50, Color.red, false, t1, true);
            t0.setPos(x0+100, 0);
            t1.setPos(x1+100, 0);
        }
    }
    public static void main(String[] args){new Aufgabe3();}
}