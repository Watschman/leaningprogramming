package turtleprogramming.serien.serie1;

import ch.aplu.turtle.Turtle;

public class Aufgabe5 {
    Aufgabe5() {
        // Reference
        final double base_length = 150;
        final double interior_length = Math.sqrt(( base_length * base_length ) + ( base_length * base_length ));
        final double outerior_length = interior_length / 2;
        final double Position_x = base_length / 2;
        final double Position_y = Position_x + Position_x / 2;
        final int base_arc = 90;
        final int side_arc_a = 45;
        final int side_arc_b = 135;
        Turtle turtle = new Turtle();
        turtle.setPos(- (Position_x), - (Position_y));
        turtle.rt(base_arc).fd(base_length).lt(side_arc_b).fd(interior_length).rt(side_arc_b).fd(base_length).lt(side_arc_b).fd(outerior_length).lt(base_arc).fd(outerior_length).lt(side_arc_a).fd(base_length).lt(side_arc_b).fd(interior_length).rt(side_arc_b).fd(base_length);

    }

    //wrapping
    public static void main(String[] args) {
        new Aufgabe5();
    }
}
