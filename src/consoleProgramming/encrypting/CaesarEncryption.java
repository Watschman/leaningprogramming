package consoleProgramming.encrypting;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CaesarEncryption{

    private Scanner SCANNER = new Scanner(System.in);

    private CaesarEncryption(){
        writeToConsoleLn("Geben Sie das Wort ein das verschlüsselt werden soll");
        String ENCRYPTED_STRING = EncryptingHelper.encrypt(getInput());
        writeToConsoleLn("Verschlüssele....");
        writeToConsoleLn(ENCRYPTED_STRING);
        redo();
    }
    private String getInput(){
        try {
            return SCANNER.next();
        }catch (Exception e){
            writeToConsoleLn("Exception during Input, going to print Stacktrace...");
            e.printStackTrace();
        }
        return null;
    }
    private void redo(){
        writeToConsoleLn("Möchten Sie ein neues Wort verschlüsseln? (Antworten mit true/false)");
        try {
            if (SCANNER.nextBoolean())
                new CaesarEncryption();
            else
                writeToConsoleLn("Stoppe Programm...");
        }catch (InputMismatchException e){
            writeToConsoleLn("Ungültige Eingabe stoppe Programm...");
        }
    }
    private void writeToConsoleLn(Object object){
        System.out.println(object);
    }
    public static void main(String[] args){new CaesarEncryption();}
}
