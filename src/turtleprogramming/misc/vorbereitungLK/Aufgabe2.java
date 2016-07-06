package turtleprogramming.misc.vorbereitungLK;

import ch.aplu.turtle.Turtle;

import java.awt.*;

public class Aufgabe2
{
    final double arc = 45;
    Aufgabe2(){
        final double length = 100;
        final double x = -180 + length;
        final double y = -180;
        final int repeats = 10;
        Turtle turtle = new Turtle();
        Color color = Color.black;
        turtle.hideTurtle().setColor(color).setPenColor(color).setFillColor(color).lt(90);
        paint(turtle, length, repeats,x, y);
    }
    private void paint(Turtle turtle, double length, int repitions, double x, double y){
        if (repitions != 0){
            turtle.setPos(x, y);
            for (int i = 0; i < 4; i++) {
                if (i == 3){
                    x = turtle.getX();
                    y =turtle.getY();
                }
                turtle.fd(length).rt(90);
            }
            repitions--;
            length = length  * 0.8;
            turtle.rt(arc);
            paint(turtle, length, repitions, x, y);
        }
    }
    public static void main(String[] args){
        new Aufgabe2();
    }
}