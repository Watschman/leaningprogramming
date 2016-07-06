package turtleprogramming.misc.vererbung;

class Magdalena extends GreenTurtle{
    Magdalena(){
        setPos(getX() + 25, getY() + 50).label("Magdalena");
    }
    public static void main(String[] args){new Magdalena();}
}