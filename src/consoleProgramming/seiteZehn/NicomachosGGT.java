package consoleProgramming.seiteZehn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NicomachosGGT {

    private static int NUMBER_1;
    private static int NUMBER_2;

    private Scanner SCANNER = new Scanner(System.in);

    private NicomachosGGT(){
        input();
        writeToConsoleLn("Berechne...");
        writeToConsoleLn("Der ggT von " + NUMBER_1 + " und " + NUMBER_2 + " lautet " + calculate(NUMBER_1, NUMBER_2));
        redo();
    }
    private void redo(){
        writeToConsoleLn("Möchten Sie eine neue Berechnung mit einem anderen Zahlenpaar durchführen? (Antworten mit true/false)");
        try {
            if (SCANNER.nextBoolean())
                new NicomachosGGT();
            else
                writeToConsoleLn("Stoppe Programm...");
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe stoppe Programm...");
        }
    }
    private int calculate(int a, int b){
        while (a < b || a > b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        return a;
    }
    private void input(){
        try {
            writeToConsoleLn("Erste Zahl zum bestimmen des ggT?");
            NUMBER_1 = SCANNER.nextInt();
            writeToConsoleLn("Zweite Zahl zum bestimmen des ggT?");
            NUMBER_2 = SCANNER.nextInt();
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe, starte Programm erneut...");
            new NicomachosGGT();
        }
    }
    private void writeToConsoleLn(Object object){
        System.out.println(object);
    }
    public static void main(String[] args){new NicomachosGGT();}
}
