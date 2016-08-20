package consoleProgramming.seiteZehn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Schaltjahr {

    private  static int JAHR;

    private Scanner SCANNER = new Scanner(System.in);

    private Schaltjahr(){
        JAHR = getInt("Welches Jahr wollen Sie überprüfen?");
        writeToConsoleLn(JAHR + istSchaltjahr(JAHR));
        redo();
    }
    private String istSchaltjahr(int jahr){
        if (jahr % 4 == 0){
            if (jahr % 100 == 0){
                if (jahr % 400 == 0)
                    return " ist Schaltjahr";
                else
                    return " ist kein Schaltjahr!";
            }else {
                return " ist Schaltjahr!";
            }
        }else {
            return " ist kein Schaltjahr!";
        }
    }
    private int getInt(String string){
        try {
            writeToConsoleLn(string);
            return SCANNER.nextInt();
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe starte Programm erneut!");
            new Schaltjahr();
        }
        return 0;
    }
    private void redo(){
        writeToConsoleLn("Möchten Sie ein anderes Jahr überprüfen? (Antworten mit true/false)");
        try {
            if (SCANNER.nextBoolean())
                new Schaltjahr();
            else
                writeToConsoleLn("Stoppe Programm...");
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe stoppe Programm...");
        }
    }
    private void writeToConsoleLn(Object object){
        System.out.println(object);
    }
    public static void main(String[] args){new Schaltjahr();}
}
