package consoleProgramming.searchAlgorithms;

import java.util.Scanner;

/**
 * Created by Steve on 16.11.2016.
 */
public class LineareSuche {
    Scanner SCANNER = new Scanner(System.in);
    int INTERVAL_MIN, INTERVAL_MAX, AMOUNT, CHECK_INT;
    private LineareSuche(){
        INTERVAL_MIN = getInt("Geben Sie das Minimum des Intervals an.");
        INTERVAL_MAX = getInt("Geben Sie das Maximum des Intervals an.");
        if (INTERVAL_MAX < INTERVAL_MIN) {
            writeToConsoleLn("Maximum kleiner als Minimum, tausche Werte...");
            int BACKUP = INTERVAL_MAX;
            INTERVAL_MAX = INTERVAL_MIN;
            INTERVAL_MIN = BACKUP;
        }
        AMOUNT = getInt("Geben Sie die Menge der Zufallszahlen an, die erzeugt werden sollen.");
        int[] MY_ARRAY = createArray(INTERVAL_MIN, INTERVAL_MAX, AMOUNT);
        CHECK_INT = getInt("Geben Sie die Zahl ein, welche Sie auf Vorhandensein im int-Feld überprüfen möchten.");
        if (CHECK_INT > INTERVAL_MAX || CHECK_INT < INTERVAL_MIN) {
            writeToConsoleLn("Eingegebene Zahl ist außerhalb des Intervals... setze Zahl auf Minimum.");
            CHECK_INT = INTERVAL_MIN;
        }
        if (checkArray(CHECK_INT, MY_ARRAY)){
            int vorhandenesInt = amountInArray(CHECK_INT, MY_ARRAY);
            writeToConsoleLn(CHECK_INT + " ist im Feld " + vorhandenesInt + " mal vorhanden.");
        }
        else
            writeToConsoleLn(CHECK_INT + " ist nicht im Feld vorhanden.");
        result(MY_ARRAY);
        writeToConsoleLn(" | Ende des Arrays");
        if (getBoolean("Möchten Sie das Programm erneut ausführen (Antworten mit true / false)"))
            new LineareSuche();
    }
    private boolean getBoolean(Object object){
        writeToConsoleLn(object);
        try {
            return SCANNER.nextBoolean();
        }catch (Exception ex){
            writeToConsoleLn("Exception caught during Input: " + ex.getMessage());
            writeToConsoleLn("returning false...");
            return false;
        }
    }
    private boolean checkArray(int checkInt, int[] intArray){
        for (int oneInt : intArray){
            if (checkInt == oneInt)
                return true;
        }
        return false;
    }
    private int[] createArray(int min, int max, int amount){
        int[] RETURN_ARRAY = new int[amount];
        for (int i = 0; i < amount; i++){
            RETURN_ARRAY[i] = (int)(((max - min) * Math.random()) + min);
        }
        return RETURN_ARRAY;
    }
    private int amountInArray(int checkInt, int[] intArray){
        int returnInt = 0;
        for (int oneInt : intArray){
            if (checkInt == oneInt)
                returnInt++;
        }
        return returnInt;
    }
    private int getInt(Object obj){
        try {
            writeToConsoleLn(obj);
            return SCANNER.nextInt();
        }catch (Exception ex){
            writeToConsoleLn(">>> Exception caught during operation: " + ex.getMessage());
            writeToConsoleLn(">>> returning 0");
            return 0;
        }
    }
    private void result(int[] intArray){
        writeToConsole("Die erstellten Zahlen im Feld hießen: ");
        for(int oneInt : intArray){
            writeToConsole(oneInt + "  ");
        }
    }
    private void writeToConsoleLn(Object object){System.out.println(object);}
    private void writeToConsole(Object object){System.out.print(object);}
    public static void main(String[] args){new LineareSuche();}
}