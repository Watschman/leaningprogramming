package turtleprogramming.Misc.Vererbung;

import java.awt.*;

class YellowMagdalena extends Magdalena{
    YellowMagdalena(){
        setFillColor(Color.yellow).fill(getX()-2, getY());
    }
    public static void main(String[] args){new YellowMagdalena();}
}