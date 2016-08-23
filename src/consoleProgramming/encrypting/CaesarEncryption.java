package consoleProgramming.encrypting;

import java.util.Scanner;

public class CaesarEncryption{

    private Scanner SCANNER = new Scanner(System.in);

    private CaesarEncryption(){
        String ENCRYPTED_STRING = EncryptingHelper.encryptString(getInput());
        writeToConsoleLn(ENCRYPTED_STRING);
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
    private void writeToConsoleLn(Object object){
        System.out.println(object);
    }
    public static void main(String[] args){new CaesarEncryption();}
}
