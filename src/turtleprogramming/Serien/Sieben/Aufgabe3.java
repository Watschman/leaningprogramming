package turtleprogramming.Serien.Sieben;

import ch.aplu.turtle.Turtle;

public class Aufgabe3 {
    Aufgabe3() {
        final double origin_position_X = 160;
        final double origin_position_Y = 150;
        double position_X = origin_position_X;
        double position_Y = origin_position_Y;
        Turtle turtle = new Turtle();
        turtle.hideTurtle().setPos(origin_position_X, origin_position_Y);
        for (int l = 0; l < 7; l++) {
            position_X = origin_position_X;
            for (int k = 0; k < 6; k++) {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 90; j++) {
                        turtle.fd(0.8).lt(1);
                    }
                    turtle.lt(110);
                }
                position_X = position_X - 60;
                turtle.home().setPos(position_X, position_Y);
            }
            position_Y = position_Y -55;
            turtle.home().setPos(origin_position_X, position_Y);
        }
    }
    public static void main(String[] args) {
        new Aufgabe3();
    }
}
