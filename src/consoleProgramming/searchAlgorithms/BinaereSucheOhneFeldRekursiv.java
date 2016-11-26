package consoleProgramming.searchAlgorithms;

import java.util.Scanner;

/**
 * Created by Steve on 24.11.2016.
 */
public class BinaereSucheOhneFeldRekursiv {

    private Scanner SCANNER = new Scanner(System.in);

    private BinaereSucheOhneFeldRekursiv(){
        int INTERVAL_LINKS, INTERVAL_RECHTS;
        INTERVAL_LINKS = getInt("Geben Sie das Minimum des Intervals an.");
        INTERVAL_RECHTS = getInt("Geben Sie das Maximum des Intervals an.");
        if (INTERVAL_RECHTS < INTERVAL_LINKS) {
            writeToConsoleLn("Maximum kleiner als Minimum, tausche Werte...");
            int BACKUP = INTERVAL_RECHTS;
            INTERVAL_RECHTS = INTERVAL_LINKS;
            INTERVAL_LINKS = BACKUP;
        }
        writeToConsoleLn("Deine Zahl lautet: " + getIntSolution(INTERVAL_LINKS, INTERVAL_RECHTS));
        if (getBooleanThroughString("Möchten Sie das Programm erneut ausführen?"))
            new BinaereSucheOhneFeldRekursiv();
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
    private int getIntSolution(int links, int rechts){
        int MITTE = ((links + rechts) / 2);
        if (links == rechts)
            return rechts;
        boolean MY_BOOLEAN = getBooleanThroughString("Ist deine Zahl kleiner oder gleich " + MITTE + " ? (Antworten mit true/ja/1 bzw. false/nein/0 (Groß- und Kleinschreibung spielt keine Rolle))");
        if (MY_BOOLEAN)
            return getIntSolution(links, MITTE);
        else
            return getIntSolution(MITTE + 1, rechts);
    }
    private void writeToConsoleLn(Object object){System.out.println(object);}
    public static void main(String[] args){new BinaereSucheOhneFeldRekursiv();}
}