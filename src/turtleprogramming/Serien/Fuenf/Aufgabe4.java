package turtleprogramming.Serien.Fuenf;

import ch.aplu.turtle.Turtle;

import java.awt.*;

public class Aufgabe4
{
    Turtle t = new Turtle();
    Aufgabe4()
    {
        t.hideTurtle();
        t.setPos(-360 / Math.PI, -90 / Math.PI);
        double x1 = t.getX();
        double y1 = t.getY();

        for(int i = 0; i <= 180 ; i++)
        {
            if(i == 180)
            {
                double x2 = t.getX();
                double y2 = t.getY();
                t.setPenColor(Color.yellow);
                t.rt(90);
                t.fd(Math.sqrt((((x2 + (-x1)) * (x2 + (-x1))) + ((y2 + (-y1)) * (y2 + (-y1))))));
                t.bk(Math.sqrt((((x2 + (-x1)) * (x2 + (-x1))) + ((y2 + (-y1)) * (y2 + (-y1))))));
                t.lt(90);
            }
            if(i <= 180)
            {
                t.setPenColor(Color.yellow);
            }
            if(i == 150)
            {
                double x3 = t.getX();
                double y3 = t.getY();
                t.setPenColor(Color.green);
                t.rt(105.4242);
                t.fd(Math.sqrt((((x3 + (-x1)) * (x3 + (-x1))) + ((y3 + (-y1)) * (y3 + (-y1))))));
                t.bk(Math.sqrt((((x3 + (-x1)) * (x3 + (-x1))) + ((y3 + (-y1)) * (y3 + (-y1))))));
                t.lt(105.4242);
            }
            if(i <= 150)
            {
                t.setPenColor(Color.green);
            }
            if(i == 120)
            {
                double x4 = t.getX();
                double y4 = t.getY();
                t.setPenColor(Color.red);
                t.rt(120.321);
                t.fd(Math.sqrt((((x4 + (-x1)) * (x4 + (-x1))) + ((y4 + (-y1)) * (y4 + (-y1))))));
                t.bk(Math.sqrt((((x4 + (-x1)) * (x4 + (-x1))) + ((y4 + (-y1)) * (y4 + (-y1))))));
                t.lt(120.321);
            }
            if(i <= 120)
            {
                t.setPenColor(Color.red);
            }
            t.fd(2);
            t.rt(1);
        }
        t.setPos(80, 0);
        for(int z = 0; z <= 3; z++ )
        {
            double curX = t.getX();
            if(curX <= 80)
            {
                t.setFillColor(Color.yellow);
            }
            if(curX <= 0)
            {
                t.setFillColor(Color.green);
            }
            if(curX <= -50)
            {
                t.setFillColor(Color.red);
            }
            t.fill();
            t.setPos(curX-50, 0);
        }
        t.setPos(360/Math.PI, -90/Math.PI);
        t.showTurtle();
    }
    public static void main(String[] args)
    {
        new Aufgabe4();
    }
}