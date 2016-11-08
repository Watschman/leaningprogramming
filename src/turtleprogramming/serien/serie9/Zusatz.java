package turtleProgramming.serien.serie9;

import ch.aplu.turtle.Turtle;

public class Zusatz {
    Zusatz() {
        final double initlength = 100;
        final int repeats = 4;
        final double x = 0;
        final double y = 0;
        double headingchange = 0;
        Turtle turtle = new Turtle();
        turtle.hideTurtle();
        for (int i = 0; i < 6; i++) {
            line(turtle, initlength, repeats, headingchange, x ,y);
            headingchange = headingchange + 60;
            turtle.home().rt(headingchange);
        }
    }
    private static void line(Turtle turtle, double length, int repetition, double headingchange, double x, double y){
        final double change = 60;
        if (repetition != 0){
            turtle.home().setPos(x, y).rt(headingchange).fd(length);
            x = turtle.getX();
            y = turtle.getY();
            length = length / 2;
            repetition = repetition - 1;
            double safedvariable = headingchange;
            line(turtle, length, repetition, headingchange, x, y);
            headingchange = safedvariable + change;
            line(turtle, length, repetition, headingchange, x, y);
            headingchange = safedvariable - change;
            line(turtle, length, repetition, headingchange, x, y);
        }
        else{
            turtle.home().setPos(x, y).rt(headingchange).fd(length);
        }
    }
    public static void main(String[] args) {
        new Zusatz();
    }
}
