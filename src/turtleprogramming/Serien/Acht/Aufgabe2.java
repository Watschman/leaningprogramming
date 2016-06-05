package turtleprogramming.Serien.Acht;

import ch.aplu.turtle.Turtle;

import java.awt.*;

class Aufgabe2 {
    Turtle t0 = new Turtle();
    Turtle t1 = new Turtle(t0);
    Turtle t2 = new Turtle(t0);
    Aufgabe2() {
        ausgangsposition(40);
        for (int i = 0; i < 5 ; i++) {
            grundfigurrechts(133, 40, t0);
            grundfigurrechts(0, 40, t1);
            grundfigurrechts(-133, 40, t2);
            grundfigurlinks(133, 40, t0);
            grundfigurlinks(0, 40, t1);
            grundfigurlinks(-133, 40, t2);
        }
    }

    void grundfigurrechts(double ystate, double groesse, Turtle turtle){
        turtle.fillToHorizontal(ystate).fd(groesse).rt(120).fd(groesse);
    }
    void grundfigurlinks(double ystate, double groesse, Turtle turtle){
        turtle.fillToHorizontal(ystate).fd(groesse).lt(120).fd(groesse);
    }
    void ausgangsposition(double groesse){
        t0.setColor(Color.green).setPenColor(Color.green).setFillColor(Color.green).wrap().setPos(-200+(groesse/2), 133).rt(90).fd(groesse*10).bk(groesse*10).lt(90).rt(30);
        t1.setColor(Color.red).setPenColor(Color.red).setFillColor(Color.red).wrap().setPos(-200+(groesse/2), 0).rt(90).fd(groesse*10).bk(groesse*10).lt(90).rt(30);
        t2.setColor(Color.blue).setPenColor(Color.blue).setFillColor(Color.blue).wrap().setPos(-200+(groesse/2), -133).rt(90).fd(groesse*10).bk(groesse*10).lt(90).rt(30);
    }
    public static void main(String[] args){new Aufgabe2();}
}