package consoleProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PaskalschesDreieck {
    Scanner SCANNER = new Scanner(System.in);
    PaskalschesDreieck(){
        int AMOUNT = getInt("Wie viele Zeilen vom Paskalschen Dreieck sollen dargestellt werden?");
        onDreickCreate(AMOUNT+1);
        redo();
    }

    private void onDreickCreate(int amount){
        for (int i = 0; i < amount; i++) {
            StringBuilder STRINGBUILDER = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                STRINGBUILDER.append((int)(calculateInt(i, j)));
                STRINGBUILDER.append(" ");
            }
            writeToConsole(STRINGBUILDER.toString());
        }

    }
    private double calculateInt(int zahl_1, int zahl_2){
        return (getFak(zahl_1)/((getFak(zahl_1-zahl_2))*getFak(zahl_2)));
    }
    private double getFak(int zahl){
        double SOLUTION = 1;
        for (int i = zahl; i > 0; i--) {
            SOLUTION = SOLUTION * i;
        }
        return SOLUTION;

    }
    private int getInt(String string){
        writeToConsole(string);
        try {
            return SCANNER.nextInt();
        }catch (InputMismatchException e){
            writeToConsole("Fehler bei der Eingabe starte erneut!");
            new PaskalschesDreieck();
        }
        return 0;
    }
    private void redo(){
        writeToConsole("Möchten Sie eine neue Berechnung mit neuen Zahlen durchführen? (Antworten mit true/false)");
        try {
            if (SCANNER.nextBoolean())
                new PaskalschesDreieck();
            else
                writeToConsole("Stoppe Programm...");
        }catch (InputMismatchException e){
            writeToConsole("Ungültige Eingabe stoppe Programm...");
        }
    }
    private void writeToConsole(Object object){
        System.out.println(object);
    }
    public static void main(String[] args){new PaskalschesDreieck();}
}
