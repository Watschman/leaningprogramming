package turtleProgramming.serien.serie3;

import ch.aplu.turtle.Turtle;

public class Aufgabe3 {
    Aufgabe3() {
        double position_X = -200;
        double position_Y = -50;
        Turtle turtle = new Turtle();
        turtle.hideTurtle().setPos(position_X, position_Y);
        for (int l = 0; l < 5; l++) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 90; j++) {
                    turtle.fd(1).rt(1);
                }
                turtle.lt(90);
            }
            position_X = position_X + 70;
            turtle.setPos(position_X, position_Y);
        }
    }
    public static void main(String[] args) {
        new Aufgabe3();
    }
}
