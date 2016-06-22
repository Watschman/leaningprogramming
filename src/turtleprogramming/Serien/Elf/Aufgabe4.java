package turtleprogramming.Serien.Elf;

import ch.aplu.turtle.Turtle;
import turtleprogramming.util.SoundHelper;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

class Aufgabe4 {

    final static Color colorTurtle0 = Color.black;
    final static Color colorTurtle1 = Color.red;
    private static int TurtleScore;

    Aufgabe4() {
        TurtleScore = 0;
        playMusic();
        Turtle turtle0 = new Turtle();
        Turtle turtle1 = new Turtle(turtle0);
        start(turtle0, colorTurtle0, 100, 0);
        start(turtle1, colorTurtle1, -100, 0);
        draw(turtle0, turtle0, turtle1);
        draw(turtle1, turtle0, turtle1);
    }
    private void draw(final Turtle turtle, final Turtle turtlea, final Turtle turtleb){
        final Point2D.Double positionTurtleA = new Point2D.Double(turtlea.getX(), turtlea.getY());
        final Point2D.Double positionTurtleB = new Point2D.Double(turtleb.getX(), turtleb.getY());
        new Thread(){
            public void run(){
                while (true) {
                    if (check(turtlea, turtleb, 20)){
//                        System.out.println("TurtleScore: " + ">>>>>>" + TurtleScore);
                        switch (TurtleScore){
                            case 0:
                                SoundHelper.playWavFile("FirstBlood");
                                break;
                            case 1:
                                SoundHelper.playWavFile("DoubleKill");
                                break;
                            default:
                                SoundHelper.playWavFile(sound());
                        }
                        turtle.clean();
                        reset(turtlea, turtlea.getColor(), positionTurtleA);
                        reset(turtleb, turtleb.getColor(), positionTurtleB);
                        TurtleScore++;
                    }
                    go(turtle);
                }
            }
        }.start();
    }
    private void go(Turtle turtle)
    {
        turtle.fd(50 * Math.random()).setRandomHeading();
    }
    private boolean check(Turtle turtlea, Turtle turtleb, double checksize){
        return turtlea.distance(turtleb.getPos()) <= checksize;
    }
    private void playMusic(){
        SoundHelper.playWavFileLoop("music");
    }
    private void start(Turtle turtle, Color color, double x, double y){
        turtle.setColor(color).setPenColor(color).wrap().setPos(x, y);
    }
    private void reset(Turtle turtle, Color color, Point2D.Double Position){
        turtle.setColor(color).setPenColor(color).wrap().setPos(Position);
    }
    private String sound(){
        Random rand = new Random();
        int number = rand.nextInt(4);
//        System.out.println("Number: " + ">>>>>>" + number);
        switch (number){
            case 0:
                return "Bullseye";
            case 1:
                return "Rampage";
            case 2:
                return "BloodBath";
            case 3:
                return "Payback";
            default:
                return null;
        }
    }
    public static void main(String[] args){new Aufgabe4();}
}
