package consoleProgramming.searchAlgorithms;

import java.util.Scanner;

/**
 * Created by Steve on 23.11.2016.
 */
public class BinaereSucheOhneFeldIterativ {
    private Scanner SCANNER = new Scanner(System.in);
    private int INTERVAL_LINKS, INTERVAL_RECHTS, MITTE;
    private boolean MY_BOOLEAN;
    private BinaereSucheOhneFeldIterativ(){
        INTERVAL_LINKS = getInt("Geben Sie das Minimum des Intervals an.");
        INTERVAL_RECHTS = getInt("Geben Sie das Maximum des Intervals an.");
        if (INTERVAL_RECHTS < INTERVAL_LINKS) {
            writeToConsoleLn("Maximum kleiner als Minimum, tausche Werte...");
            int BACKUP = INTERVAL_RECHTS;
            INTERVAL_RECHTS = INTERVAL_LINKS;
            INTERVAL_LINKS = BACKUP;
        }
        calculate();
        if (getBooleanThroughString("Möchten Sie das Programm erneut ausführen?"))
            new BinaereSucheOhneFeldIterativ();
    }
    private boolean getBooleanThroughString(Object object){
        String INPUT = getString(object).toLowerCase();
        return INPUT.equals("true") || INPUT.equals("ja") || INPUT.equals("1");
    }
    private String getString (Object object){
        try {
            writeToConsoleLn(object);
            return SCANNER.next();
        }catch (Exception ex){
            writeToConsoleLn("Exception caught during Input: " + ex.getMessage());
            writeToConsoleLn("returning false...");
            return "false";
        }
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
    private void calculate(){
        MITTE = ((INTERVAL_LINKS + INTERVAL_RECHTS) / 2);
        while (INTERVAL_LINKS != INTERVAL_RECHTS) {
            MITTE = ((INTERVAL_LINKS + INTERVAL_RECHTS) / 2);
            MY_BOOLEAN = getBooleanThroughString("Ist deine Zahl kleiner oder gleich " + MITTE + " ? (Antworten mit true/ja/1 bzw. false/nein/0 (Groß- und Kleinschreibung spielt keine Rolle))");
            if (MY_BOOLEAN)
                INTERVAL_RECHTS = MITTE;
            else
                INTERVAL_LINKS = MITTE + 1;
        }
        writeToConsoleLn("Deine Zahl lautet: " + INTERVAL_LINKS);
    }
    private void writeToConsoleLn(Object object){System.out.println(object);}
    public static void main(String[] args){new BinaereSucheOhneFeldIterativ();}
}