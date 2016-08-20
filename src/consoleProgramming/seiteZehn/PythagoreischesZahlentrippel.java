package consoleProgramming.seiteZehn;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PythagoreischesZahlentrippel {

    private static int INPUT;
    private static List<Integer> CALCULATION = new ArrayList<Integer>();

    private Scanner SCANNER = new Scanner(System.in);

    private PythagoreischesZahlentrippel(){
        INPUT = getInput();
        writeToConsoleLn("Berechne...");
        calculation(INPUT);
        wrap(CALCULATION);
        redo();
    }
    private void redo(){
        writeToConsoleLn("Möchten Sie eine neue Berechnung mit einer anderen Zahl durchführen? (Antworten mit true/false)");
        try {
            if (SCANNER.nextBoolean())
                new PythagoreischesZahlentrippel();
            else
                writeToConsoleLn("Stoppe Programm...");
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe stoppe Programm...");
        }
    }
    private void wrap(List list){
        int LISTLENGTH = list.size() / 3;
        int k = 0;
        for (int i = 0; i < LISTLENGTH; i++) {
            writeToConsole(list.get(k) + "²+");
            k++;
            writeToConsole(list.get(k) + "²=");
            k++;
            writeToConsole(list.get(k) + "²");
            k++;
            writeToConsoleLn("");
        }
    }
    private void calculation(int zahl){
        zahl = zahl + 1;
        for (int i = 1; i < zahl; i++) {
            for (int j = 1; j < zahl; j++) {
                for (int k = 1; k < zahl; k++) {
                    if ((i*i) + (j*j) == k*k) {
                        int[] INTARRAY = new int[]{i, j, k};
                        for (int u : INTARRAY) {
                            CALCULATION.add(u);
                        }
                    }
                }
            }
        }
    }
    private int getInput(){
        writeToConsoleLn("Bis zu welcher Zahl wollen Sie die Gleichungen berechnen lassen?");
        try {
            return SCANNER.nextInt();
        }catch (InputMismatchException e){
            writeToConsoleLn("Fehler bei der Eingabe starte erneut!");
            new PythagoreischesZahlentrippel();
        }
        return 0;
    }
    private void writeToConsoleLn(Object object){
        System.out.println(object);
    }
    private void writeToConsole(Object object){
        System.out.print(object);
    }
    public static void main(String[] args){new PythagoreischesZahlentrippel();}
}
