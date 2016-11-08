package turtleProgramming.serien.serie9;

import ch.aplu.turtle.Turtle;

public class Aufgabe3 {
    Aufgabe3() {
        final double initlength = 120;
        final int repeats = 3;
        final int sum = repeats + 1;
        Turtle turtle = new Turtle();
        turtle.hideTurtle();
        figur(initlength, turtle, sum);
    }
    private static void figur(double seite, Turtle turtle, int repitition){
        repitition = repitition - 1;
        if ( repitition != 0) {
            for (int i = 0; i < 6; i++) {
                turtle.fd(seite);
                figur(seite / 3, turtle, repitition);
                turtle.bk(seite).rt(60);
            }
        }
        else{
            System.out.println("<<<DONE!>>>");
        }
    }
    public static void main(String[] args) {
        new Aufgabe3();
    }
}