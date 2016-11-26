package consoleProgramming.searchAlgorithms;

import java.util.Scanner;

/**
 * Created by Steve on 26.11.2016.
 */
public class BinaereSucheMitFeldRekursiv {

    private Scanner SCANNER = new Scanner(System.in);

    private BinaereSucheMitFeldRekursiv(){
        int INTERVAL_LINKS, INTERVAL_RECHTS;
        INTERVAL_LINKS = getInt("Geben Sie das Minimum des Intervals an.");
        INTERVAL_RECHTS = getInt("Geben Sie das Maximum des Intervals an.");
        if (INTERVAL_RECHTS < INTERVAL_LINKS) {
            writeToConsoleLn("Maximum kleiner als Minimum, tausche Werte...");
            int backup = INTERVAL_RECHTS;
            INTERVAL_RECHTS = INTERVAL_LINKS;
            INTERVAL_LINKS = backup;
        }
        writeToConsoleLn("Deine Zahl lautet: " + getIntSolution(createIntArray(INTERVAL_LINKS, INTERVAL_RECHTS)));
        if (getBooleanThroughString("Möchten Sie das Programm erneut ausführen?"))
            new BinaereSucheMitFeldRekursiv();
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
    private int getIntSolution(int[] interval){
        int links = interval[0];
        int rechts = interval[interval.length - 1];
        if (links == rechts)
            return rechts;
        int mitte = interval[((interval.length / 2) - 1)];
        boolean myBoolean = getBooleanThroughString("Ist deine Zahl kleiner oder gleich " + mitte + " ? (Antworten mit true/ja/1 bzw. false/nein/0 (Groß- und Kleinschreibung spielt keine Rolle))");
        if (myBoolean)
            return getIntSolution(createIntArray(links, mitte));
        else
            return getIntSolution(createIntArray(mitte + 1, rechts));
    }
    private int[] createIntArray(int startNumber, int endNumber){
        int[] myArray = new int[endNumber - startNumber + 1];
        for (int i = 0; i <= endNumber- startNumber; i++) {
            myArray[i] = startNumber + i;
        }
        return myArray;
    }
    private void writeToConsoleLn(Object object){System.out.println(object);}
    public static void main(String[] args){new BinaereSucheMitFeldRekursiv();}
}