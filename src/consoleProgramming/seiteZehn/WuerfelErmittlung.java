package consoleProgramming.seiteZehn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WuerfelErmittlung {

    private static int ANZAHL;

    private Scanner SCANNER = new Scanner(System.in);

    private WuerfelErmittlung(){
        ANZAHL = getInt("Wie oft wollen Sie würfeln?");
        int SOL = wuerfeln(ANZAHL);
        writeToConsoleLn("Bei " + ANZAHL + " Versuchen wurde " + SOL + " mal die 6 gewürfelt!");
        redo();
    }
    private int wuerfeln(int anzahl){
        int amount = 0;
        for (int i = 0; i < anzahl; i++){
            int k = (int)(Math.random()*6+1);
            if (k == 6)
                amount++;
        }
        return amount;
    }
    private int getInt(String string){
        try {
            writeToConsoleLn(string);
            return SCANNER.nextInt();
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe starte Programm erneut!");
            new WuerfelErmittlung();
        }
        return 0;
    }
    private void redo(){
        writeToConsoleLn("Möchten Sie  nochmal Würfeln? (Antworten mit true/false)");
        try {
            if (SCANNER.nextBoolean())
                new WuerfelErmittlung();
            else
                writeToConsoleLn("Stoppe Programm...");
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe stoppe Programm...");
        }
    }
    private void writeToConsoleLn(Object object){
        System.out.println(object);
    }
    public static void main(String[] args){new WuerfelErmittlung();}
}
