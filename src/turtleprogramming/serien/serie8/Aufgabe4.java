package turtleProgramming.serien.serie8;

import ch.aplu.turtle.Turtle;
import turtleProgramming.util.FigurHelper;

import java.awt.*;

class Aufgabe4 {
    Turtle t0 = new Turtle();
    Turtle t1 = new Turtle(t0);
    Aufgabe4() {
        t0.setPos(-200, 0);
        t1.setPos(-150, 0);
        for (int i = 0; i < 4; i++) {
            double x0 = t0.getX();
            double x1 = t1.getX();
            FigurHelper.Quadrad(50, Color.blue, true, t0, true);
            FigurHelper.Quadrad(50, Color.red, true, t1, true);
            t0.setPos(x0+100, 0);
            t1.setPos(x1+100, 0);
        }
    }
    public static void main(String[] args){new Aufgabe4();}
}