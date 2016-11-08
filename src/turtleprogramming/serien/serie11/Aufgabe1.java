package turtleProgramming.serien.serie11;
import ch.aplu.turtle.Turtle;

import java.awt.*;

public class Aufgabe1 {
    final int rep = 15;
    final Turtle or_turtle = new Turtle();
    Aufgabe1(){
        or_turtle.hideTurtle();
        new Thread(){
            public void run(){
                Turtle turtle = new Turtle(or_turtle);
                turtle.setPos(-200, -200).setColor(Color.GREEN).setPenColor(Color.GREEN);
                Quadrat(10, turtle, rep);
            }
        }.start();
        new Thread(){
            public void run(){
                Turtle turtle = new Turtle(or_turtle);
                turtle.setPos(200, -200).setColor(Color.RED).setPenColor(Color.RED).lt(90);
                Quadrat(15, turtle, rep);
            }
        }.start();
    }

    private void Quadrat(double length, Turtle turtle, int repetition){
        if (repetition > 0) {
            for (int i = 0; i < 4; i++) {
                turtle.fd(length).rt(90);
            }
            length = length * 1.2;
            repetition--;
            Quadrat(length, turtle, repetition);
        }
    }
    public static void main(String[] args){new Aufgabe1();}
}
