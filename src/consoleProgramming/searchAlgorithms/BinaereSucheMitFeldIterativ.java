package consoleProgramming.searchAlgorithms;

import java.util.Scanner;

/**
 * Created by Steve on 26.11.2016.
 */
public class BinaereSucheMitFeldIterativ {

    private Scanner SCANNER = new Scanner(System.in);

    private BinaereSucheMitFeldIterativ(){
        int intervalLinks, intervalRechts;
        intervalLinks = getInt("Geben Sie das Minimum des Intervals an.");
        intervalRechts = getInt("Geben Sie das Maximum des Intervals an.");
        if (intervalRechts < intervalLinks) {
            writeToConsoleLn("Maximum kleiner als Minimum, tausche Werte...");
            int backup = intervalRechts;
            intervalRechts = intervalLinks;
            intervalLinks = backup;
        }
        writeToConsoleLn("Deine Zahl lautet: " + getIntSolution(createIntArray(intervalLinks, intervalRechts)));
        if (getBooleanThroughString("Möchten Sie das Programm erneut ausführen?"))
            new BinaereSucheMitFeldIterativ();
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
        int mitte;
        int i = 1;
        while(links != rechts) {
            mitte = interval[((interval.length / 2 * i) - 1)];
            boolean myBoolean = getBooleanThroughString("Ist deine Zahl kleiner oder gleich " + mitte + " ? (Antworten mit true/ja/1 bzw. false/nein/0 (Groß- und Kleinschreibung spielt keine Rolle))");
            if (myBoolean) {
                rechts = mitte;
                interval = createIntArray(links, rechts);
            } else {
                links = mitte + 1;
                interval = createIntArray(links, rechts);
            }
        }
        return rechts;
    }
    private int[] createIntArray(int startNumber, int endNumber){
        int[] myArray = new int[endNumber - startNumber + 1];
        for (int i = 0; i <= endNumber- startNumber; i++) {
            myArray[i] = startNumber + i;
        }
        return myArray;
    }
    private void writeToConsoleLn(Object object){System.out.println(object);}
    public static void main(String[] args){new BinaereSucheMitFeldIterativ();}
}