package turtleprogramming.misc.ownIdeas;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;
import turtleprogramming.util.FigurHelper;

import java.awt.*;

class Task1{
    private Task1(){
        Turtle TURTLE = new Turtle(Color.red);
        double size = 15;
        for (int i = 1; i < 11; i++) {
            double SIZE = size * i;
            drawRectancle(SIZE, TURTLE.getColor(), false, TURTLE, true);
            TURTLE.rt(10*i);
            i++;
        }
    }
    private void drawRectancle(double size, Color color, boolean filled, Turtle turtle, boolean turnRight){
        FigurHelper.Quadrad(size, color, filled, turtle, turnRight);
    }

    public static void main(String[]args){new Task1();}
}
