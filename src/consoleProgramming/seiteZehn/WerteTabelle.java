package consoleProgramming.seiteZehn;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WerteTabelle {

    private static double MINIMUM;
    private static double MAXIMUM;
    private static double SCHRITTWEITE;
    private static List<Float> SOLUTIONS= new ArrayList<Float>();

    private Scanner SCANNER = new Scanner(System.in);

    private WerteTabelle(){
        MINIMUM = getInput("Geben das Minimum der Berechnung an.");
        MAXIMUM = getInput("Geben das Maximum der Berechnung an.");
        SCHRITTWEITE = getInput("Geben die Schritterweite der Berechnung an. ( z.B. 0,5 )");
        calculation(MINIMUM, MAXIMUM, SCHRITTWEITE);
        wrap(SOLUTIONS);
        redo();
    }
    private void wrap(List list){
        int LISTLENGTH = list.size()/2;
        for(int p = 0; p < 2; p++) {
            int k = p;
            if (p == 0)
                writeToConsole("y-Werte: ");
            else
                writeToConsole("x-Werte: ");
            for (int i = 0; i < LISTLENGTH; i++) {
                writeToConsole((list.get(k)) + "; ");
                k= k + 2;
            }
            writeToConsoleLn("");
        }
    }
    private void calculation(double min, double max, double s){
        if (max < min) {
            writeToConsoleLn("Ungültige Eingabe Maximum ist kleiner als Minimum");
        }
        else {
            for (double i = min; i <= max; i = i + s) {
                double Y = ((i * i) - (6 * i) - 8) / ((i * i) - (6 * i) + 5);
                SOLUTIONS.add((float)Y);
                SOLUTIONS.add((float)i);
            }
        }
    }
    private double getInput(String string){
        writeToConsoleLn(string);
        try {
            return SCANNER.nextDouble();
        }catch (InputMismatchException e){
            writeToConsoleLn("Fehler bei der Eingabe starte erneut!");
            new WerteTabelle();
        }
        return 0;
    }
    private void redo(){
        writeToConsoleLn("Möchten Sie eine neue Berechnung mit anderen Zahlen durchführen? (Antworten mit true/false)");
        try {
            if (SCANNER.nextBoolean())
                new WerteTabelle();
            else
                writeToConsoleLn("Stoppe Programm...");
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe stoppe Programm...");
        }
    }
    private void writeToConsoleLn(Object object){
        System.out.println(object);
    }
    private void writeToConsole(Object object){
        System.out.print(object);
    }
    public static void main(String[] args){new WerteTabelle();}
}
