package turtleprogramming.Misc.Vererbung;

import ch.aplu.turtle.Turtle;

import java.awt.*;

class GreenTurtle extends Turtle {
    Color color = Color.green;
    Color pencolor = Color.green;
    GreenTurtle(){
        setColor(color);
        setPenColor(pencolor);
        Sechseck();
    }
    private void Sechseck(){
        setPos(-75, -50);
        for (int i = 0; i < 6; i++) {
            forward(100).rt(60);
        }
    }
    public static void main(String[] args){new GreenTurtle();}
}
class Magdalena extends GreenTurtle{
    Magdalena(){
        setPos(getX() + 25, getY() + 50).label("Magdalena");
    }
    public static void main(String[] args){new Magdalena();}
}
class YellowMagdalena extends Magdalena{
    YellowMagdalena(){
        setFillColor(Color.yellow).fill(getX()-2, getY());
    }
    public static void main(String[] args){new YellowMagdalena();}
}
