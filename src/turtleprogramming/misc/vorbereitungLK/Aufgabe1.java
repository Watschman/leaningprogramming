package turtleprogramming.misc.vorbereitungLK;

import ch.aplu.turtle.Turtle;

import java.awt.*;

public class Aufgabe1{
    final double arc = 20;
    Aufgabe1(){
        final double length = 10;
        final int repeats = 12;
        Turtle turtle = new Turtle();
        Color color = Color.black;
        turtle.hideTurtle().setColor(color).setPenColor(color).setFillColor(color);
        paint(turtle, repeats, length);
    }
    private void paint(Turtle turtle, int repitions, double length){
        if(repitions != 0){
            Quadrat(turtle, length);
            length = (length/100)*120;
            turtle.lt(arc);
            repitions = repitions - 1;
            paint(turtle, repitions, length);
        }
        else{
            System.out.println("<<<DONE>>>");
        }
    }
    private static void Quadrat(Turtle turtle, double length){
        for(int i = 0; i < 4; i++){
            turtle.fd(length).rt(90);
        }
    }
    public static void main (String[] args){
        new Aufgabe1();
    }
}
