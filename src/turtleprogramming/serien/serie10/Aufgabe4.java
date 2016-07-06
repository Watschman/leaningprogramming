package turtleprogramming.serien.serie10;

import ch.aplu.turtle.Turtle;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aufgabe4 {
    final double length = 40;
    final double arc = 160;
    final Turtle turtle = new Turtle();
    final Color color = Color.magenta;
    Aufgabe4() {
        turtle.hideTurtle().setPenColor(color);
        turtle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int mousex = e.getX();
                int mousey = -(e.getY());
                int endx = mousex - 200;
                int endy = mousey + 200;
                stern(endx, endy);
            }
        });
    }
    private void stern(final int x, final int y){
        turtle.setPos(x, y);
        for (int i = 0; i < 9; i++) {
            turtle.fd(length).rt(arc);
        }
    }
    public static void main(String[] args) {
        new Aufgabe4();
    }
}
