package turtleprogramming.serien.serie11;

import ch.aplu.turtle.Turtle;

import java.awt.*;

public class Aufgabe2 {
    final double length = 20;
    final Turtle origin_turtle = new Turtle();
    Aufgabe2(){
        origin_turtle.hideTurtle();
        Treppe(0, 0, true, false, Color.blue);
        Treppe(0, 0, true, true, Color.green);
        Treppe(-(length), 0, false, false, Color.red);
        Treppe(length, 0, false, true, Color.magenta);
    }

    private void Treppe(final double posX, final double posY, final boolean rechts, final boolean unten, final Color color){
        new Thread(){
            public void run(){
                Turtle turtle = new Turtle(origin_turtle);
                turtle.setPos(posX, posY).setColor(color).setFillColor(color).setPenColor(color).fillToHorizontal(posY);
                if (unten)
                    turtle.rt(180);
                if(rechts) {
                    for (int i = 0; i < 10; i++) {
                        turtle.fd(length).rt(90).fd(length).lt(90);
                    }
                }
                else{
                    for (int i = 0; i < 10; i++) {
                        turtle.fd(length).lt(90).fd(length).rt(90);
                    }
                }
            }
        }.start();
    }
    public static void main(String[] args){new Aufgabe2();}
}