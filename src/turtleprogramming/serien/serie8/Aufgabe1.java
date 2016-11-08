package turtleProgramming.serien.serie8;

import ch.aplu.turtle.Turtle;

import java.awt.*;

class Aufgabe1 {
    Turtle t1 = new Turtle();
    Turtle t2 = new Turtle(t1);
    Aufgabe1(){
        t1.hideTurtle().setPenColor(Color.red).setPos(-100, 100).rt(90);
        t2.hideTurtle().setPenColor(Color.blue).setPos(-100, -100);
        for (int i = 0; i < 10; i++) {
            forward(t1);
            forward(t2);
        }
    }
    void forward(Turtle turtle) {
        turtle.fd(20).rt(90).fd(20).lt(90);
    }
    public static void main(String[] args){new Aufgabe1();}
}
