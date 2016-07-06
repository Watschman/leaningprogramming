package gameprogramming.beginner.aufgabeA1;

import ch.aplu.jgamegrid.GameGrid;
import gameprogramming.reference.Reference;

import java.awt.*;

public class Aufgabe1 extends GameGrid{
    public Aufgabe1(){
        super(10, 10 , 60, Color.red, Reference.SPRITE_LOCATION + "road.gif");
    }

    public static void main(String[] args){
        new Aufgabe1();
    }
}
