package turtleProgramming.serien.serie6;

import ch.aplu.turtle.Turtle;

public class Aufgabe5 {
    Aufgabe5() {
        double length = 30;
        Turtle turtle = new Turtle();
        turtle.hideTurtle().setPos(-190, -30);
        while(length < 120){
            for (int i = 0; i < 5; i++) {
                turtle.fd(length).rt(144);
            }
            double x = turtle.getX();
            double y = turtle.getY();
            turtle.setPos(x + 80, y);
            length = length + 20;
        }
    }
    public static void main(String[] args) {
        new Aufgabe5();
    }
}
