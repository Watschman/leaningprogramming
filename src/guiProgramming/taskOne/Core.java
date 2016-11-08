package guiProgramming.taskOne;

/*
created by Steve on
29.10.2016
10:18
*/
public class Core
{
    RECHTECK FOUNDATION = new RECHTECK();
    RECHTECK DOOR = new RECHTECK();
    DREIECK ROOF = new DREIECK();
    KREIS SUN = new KREIS();
    Core(){
//        create(Object, String, boolean, int, int, int, int)
        createSquare(FOUNDATION, "hellgruen", true, 80, 100, 230, 200);
        createSquare(DOOR, "gruen", true, 20, 60, 260, 240);
        createTriangle(ROOF, "rot", true, 100, 60, 270, 140);
        createCyrcle(SUN, "gelb", true, 50, 100, 100);
    }
    private void createSquare(RECHTECK square, String colour, boolean visible, int size_x, int size_y, int pos_x, int pos_y){
        square.FarbeSetzen(colour);
        square.GroesseSetzen(size_x, size_y);
        square.PositionSetzen(pos_x, pos_y);
        square.SichtbarSetzen(visible);
        square.Zeichnen();
    }
    private void createTriangle(DREIECK triangle, String colour, boolean visible, int size_x, int size_y, int pos_x, int pos_y){
        triangle.FarbeSetzen(colour);
        triangle.GroesseSetzen(size_x, size_y);
        triangle.PositionSetzen(pos_x, pos_y);
        triangle.SichtbarSetzen(visible);
        triangle.Zeichnen();
    }
    private void createCyrcle(KREIS cyrcle, String colour, boolean visible, int size, int pos_x, int pos_y){
        cyrcle.FarbeSetzen(colour);
        cyrcle.RadiusSetzen(size);
        cyrcle.MittelpunktSetzen(pos_x, pos_y);
        cyrcle.SichtbarSetzen(visible);
        cyrcle.Zeichnen();
    }
    public static void main(String[] args){
        new Core();
    }
}
