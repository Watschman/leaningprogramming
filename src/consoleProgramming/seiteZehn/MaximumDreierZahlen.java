package consoleProgramming.seiteZehn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaximumDreierZahlen {

    private static double ZAHL_1;
    private static double ZAHL_2;
    private static double ZAHL_3;

    private Scanner SCANNER = new Scanner(System.in);

    private MaximumDreierZahlen(){
        ZAHL_1 = getDouble("Wie lautet Zahl 1?");
        ZAHL_2 = getDouble("Wie lautet Zahl 2?");
        ZAHL_3 = getDouble("Wie lautet Zahl 3?");
        writeToConsoleLn("Die Zahl " + getMax(ZAHL_1, ZAHL_2, ZAHL_3) + " ist die größte");
        redo();
    }
    private double getMax(double zahl1, double zahl2, double zahl3){
        if (zahl1 >= zahl2 && zahl1 >= zahl3)
            return zahl1;
        if (zahl2 >= zahl1 && zahl2 >= zahl3)
            return zahl2;
        else
            return zahl3;
    }
    private double getDouble(String string){
        try {
            writeToConsoleLn(string);
            return SCANNER.nextDouble();
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe starte Programm erneut!");
            new MaximumDreierZahlen();
        }
        return 0;
    }
    private void redo(){
        writeToConsoleLn("Möchten Sie eine neue Berechnung mit anderen Zahlen durchführen? (Antworten mit true/false)");
        try {
            if (SCANNER.nextBoolean())
                new MaximumDreierZahlen();
            else
                writeToConsoleLn("Stoppe Programm...");
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe stoppe Programm...");
        }
    }
    private void writeToConsoleLn(Object object){
        System.out.println(object);
    }
    public static void main(String[] args){new MaximumDreierZahlen();}
}
