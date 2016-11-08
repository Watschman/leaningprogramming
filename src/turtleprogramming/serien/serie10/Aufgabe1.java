package turtleProgramming.serien.serie10;

import ch.aplu.turtle.Turtle;
import turtleProgramming.util.FigurHelper;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Aufgabe1 {
    final double radius = 20;
    final double orginx = -200;
    final  double originy = 0;
    Turtle turtle = new Turtle();
    Aufgabe1() {
        turtle.hideTurtle().setPos(orginx, originy).addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                Random rand = new Random();
                int randomnumber = rand.nextInt((6 - 1) + 1) + 1;
                punkt(randomnumber);
            }
        });
        turtle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                turtle.clean();
            }
        });
    }
    private void punkt(int amount){
        turtle.setPos(orginx, originy);
        for (int i = 0; i < amount; i++) {
            double x = turtle.getX();
            double y = turtle.getY();
            FigurHelper.Kreis(radius, Color.red, true, turtle, true);
            turtle.setPos(x + radius * 2, y);
        }
    }
    public static void main(String[] args) {
        new Aufgabe1();
    }
}