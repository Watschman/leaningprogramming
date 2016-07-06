package turtleprogramming.serien.serie10;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.FigurHelper;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aufgabe2 {
    final double length = 10;
    Turtle turtle = new Turtle();
    Color color = Color.red;
    Aufgabe2() {
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
        newturtle.hideTurtle();
        new Thread(){
            public void run(){
                newturtle.setPos(x, y);
                FigurHelper.Quadrad(length, color, true, newturtle, true);
            }
        }.start();
    }
    public static void main(String[] args) {
        new Aufgabe2();
    }
}