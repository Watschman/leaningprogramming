package turtleProgramming.serien.serie10;

import ch.aplu.turtle.Turtle;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aufgabe3 {
    Turtle turtle = new Turtle();
    Aufgabe3() {
        turtle.hideTurtle();
        turtle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int mousex = e.getX();
                int mousey = -(e.getY());
                int endx = mousex - 200;
                int endy = mousey + 200;
                paint(new Turtle(turtle), endx, endy);
            }
        });
    }
    private void paint(final Turtle newturtle, final int x, final int y){
        new Thread(){
            public void run(){
                newturtle.setPos(x, y).rt(90).fd(200 - x);
                while (true){
                    newturtle.lt(180).fd(400).rt(180).fd(400);
                }
            }
        }.start();
    }
    public static void main(String[] args) {
        new Aufgabe3();
    }
}