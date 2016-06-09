package turtleprogramming.Serien.Elf;

import ch.aplu.turtle.Turtle;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aufgabe3 {
    final double length = 20;
    final Turtle origin_turtle = new Turtle();
    Aufgabe3(){
        origin_turtle.hideTurtle();
        origin_turtle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int mousex = e.getX();
                int mousey = -(e.getY());
                int endX = mousex - 200;
                int endY = mousey + 200;
                Blume(endX, endY);
            }
        });
    }

    private void Blume(final double posX, final double posY){
        new Thread(){
            public void run(){
                Turtle turtle = new Turtle(origin_turtle);
                turtle.setPos(posX, posY).setPenColor(Color.MAGENTA).setFillColor(Color.MAGENTA).fillToPoint(posX, posY);
                draw(turtle);
				turtle.hideTurtle();
            }
        }.start();
    }
    private void draw(Turtle turtle){
        turtle.lt(30);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                turtle.fd(length).rt(60).fd(length).rt(120);
            }
            turtle.rt(90);
        }
    }
    public static void main(String[] args){new Aufgabe3();}
}

