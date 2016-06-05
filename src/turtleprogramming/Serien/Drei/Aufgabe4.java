package turtleprogramming.Serien.Drei;

import ch.aplu.turtle.Turtle;

public class Aufgabe4 {
    Aufgabe4() {
        double position_X = 160;
        double position_Y = -50;
        Turtle turtle = new Turtle();
        turtle.hideTurtle().setPos(position_X, position_Y);
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 90; j++) {
                    turtle.fd(1).lt(1);
                }
                turtle.lt(110);
            }
            turtle.home();
            position_X = position_X - 70;
            turtle.setPos(position_X, position_Y);
        }
    }
    public static void main(String[] args) {
        new Aufgabe4();
    }
}
