package turtleprogramming.Serien.Fuenf;

import ch.aplu.turtle.Turtle;

import java.awt.*;

public class Aufgabe2 {
    Aufgabe2() {
        final double length_fd = 20;
        final double length_up = length_fd / 2;
        Turtle turtle = new Turtle();
        Color color;
        turtle.setPos(-200, -200);
        for (int i = 0; i < 20; i++) {
            if (i < 7){
                color = Color.red;
            }
            else if (i < 14){
                color = Color.yellow;
            }
            else{
                color = Color.green;
            }
            turtle.setPenColor(color).setFillColor(color).fillToHorizontal(-200).fd(length_up).rt(90).fd(length_fd).lt(90);
        }
    }
    public static void main(String[] args) {
        new Aufgabe2();
    }
}
