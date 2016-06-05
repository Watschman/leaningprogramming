package turtleprogramming.Serien.Vier;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

import java.awt.*;

public class Aufgabe5 {
    Aufgabe5() {
        final double size = 160;
        Turtle turtle = new Turtle();
        Color color = Color.green;
        turtle.setColor(Color.red).setPos(200, 0);
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0)
                FigurHelper.HalbKreis(size, color, true, turtle, false);
            else
                FigurHelper.HalbKreis(size, color, true, turtle, true);
        }
    }
    public static void main(String[] args) {
        new Aufgabe5();
    }
}
