package turtleProgramming.serien.serie10;

import ch.aplu.turtle.Turtle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Aufgabe5 {
    Aufgabe5() {
        final Turtle turtle = new Turtle();
        final Turtle turtle_A = new Turtle(turtle);
        final Turtle turtle_B = new Turtle(turtle);
        final Color color_turtle_A = Color.red;
        final Color color_turtle_B = Color.blue;
        turtle.hideTurtle().setPos(-195, 180).rt(90).fd(390);
        turtle_A.setPos(-50, -200).setColor(color_turtle_A).setPenColor(color_turtle_A);
        turtle_B.setPos(50, -200).setColor(color_turtle_B).setPenColor(color_turtle_B).addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (SwingUtilities.isLeftMouseButton(e)){
                    vorwaerts(turtle_A);
                }
                if (SwingUtilities.isRightMouseButton(e)){
                    vorwaerts(turtle_B);
                }
            }
        });
    }
    private void vorwaerts(Turtle turtle){
        Random random = new Random();
        int randommultiplier = random.nextInt((6 -1) + 1) +1;
        double go = 10 * randommultiplier;
        turtle.fd(go);
        if (turtle.getY() >= 180){
            turtle.beep();
        }
    }
    public static void main(String[] args) {
        new Aufgabe5();
    }
}
