package consoleProgramming.seiteZehn;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BabylonischesWurzelziehen {

    private static int GENAUIGKEIT;
    private static List<Double> SOLUTIONS = new ArrayList<Double>();

    private Scanner SCANNER = new Scanner(System.in);

    private BabylonischesWurzelziehen(){
        GENAUIGKEIT = getInt("Wie genau möchten sie Wurzel 2 bestimmt haben?");
        for (double d : calculate(GENAUIGKEIT)) {
            SOLUTIONS.add(d);
        }
        wrap(SOLUTIONS);
        redo();
    }
    private void wrap(List<Double> list){
        double a = list.get(1);
        double b = list.get(2);
        if (a < 0)
            a = a - a - a;
        if (b < 0)
            b = b - b - b;
        writeToConsoleLn("A= "+ list.get(0));
        writeToConsoleLn("a= "+ a);
        writeToConsoleLn("b= "+ b);
        list.clear();
    }
    private double[] calculate(int precision){
        double FLAECHE = 2;
        double SEITE_1 = 1;
        double SEITE_2 = 2;
        for (int i = 0; i < precision; i++) {
            if (i % 2 == 0){
                SEITE_2 = (SEITE_1 + SEITE_2) / 2;
            }else {
                SEITE_1 = FLAECHE / SEITE_2;
            }
        }
        return new double[]{FLAECHE, SEITE_1, SEITE_2};
    }
    private int getInt(String string){
        try {
            writeToConsoleLn(string);
            return SCANNER.nextInt();
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe starte Programm erneut!");
            new BabylonischesWurzelziehen();
        }
        return 0;
    }
    private void redo(){
        writeToConsoleLn("Möchten Sie eine neue Berechnung mit anderer Genauigkeit durchführen? (Antworten mit true/false)");
        try {
            if (SCANNER.nextBoolean())
                new BabylonischesWurzelziehen();
            else
                writeToConsoleLn("Stoppe Programm...");
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe stoppe Programm...");
        }
    }
    private void writeToConsoleLn(Object object){
        System.out.println(object);
    }
    public static void main(String[] args){
        new BabylonischesWurzelziehen();
    }
}
