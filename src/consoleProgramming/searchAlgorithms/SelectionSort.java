package consoleProgramming.searchAlgorithms;
import java.util.Scanner;

/**
 * Created by Steve on 01.12.2016.
 */
public class SelectionSort {

    private Scanner SCANNER = new Scanner(System.in);

    private SelectionSort(){
        int MINIMUM, MAXIMUM, ARRAY_LENGTH;
        MINIMUM = getInt("Geben Sie das Minimum des Intervals an.");
        MAXIMUM = getInt("Geben Sie das Maximum des Intervals an.");
        if (MAXIMUM < MINIMUM) {
            writeToConsoleLn("Maximum kleiner als Minimum, tausche Werte...");
            int backup = MAXIMUM;
            MAXIMUM = MINIMUM;
            MINIMUM = backup;
        }
        ARRAY_LENGTH = getInt("Geben Sie die Anzahl der Zahlen im Feld an.");
        int[] UNSORTED_ARRAY = createIntArray(MINIMUM, MAXIMUM, ARRAY_LENGTH);
        writeToConsoleLn("Das erstellte Array lautet: " + printArray(UNSORTED_ARRAY));
        boolean WANTED_CHANGES = getBooleanThroughString("Wollen Sie alle Zwischenschritte des Such Algorithmus sehen? (Antworten mit Ja/true/1 bzw. Nein/false/0)");
        int[] SORTED_ARRAY = createSortedIntArray(UNSORTED_ARRAY, WANTED_CHANGES);
        writeToConsoleLn("Das sortierte Array lautet: " + printArray(SORTED_ARRAY));
        if (getBooleanThroughString("Möchten Sie das Programm erneut ausführen? (Antworten mit Ja/true/1 bzw. Nein/false/0)"))
            new SelectionSort();
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
    private String printArray(int[] arrayToPrint){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : arrayToPrint){
            stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString();
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
    private int[] createSortedIntArray(int[] oldArray, boolean documentation){
        int backup, change, intSave;
        for (int i = 0; i < oldArray.length; i++) {
            backup = oldArray[i];
            change = oldArray[i];
            intSave = i;
            for (int j = i; j < oldArray.length; j++) {
                if (oldArray[j] < oldArray[intSave]) {
                    change = oldArray[j];
                    intSave = j;
                }
            }
            if (documentation)
                writeToConsoleLn("Verschiebe " + oldArray[i] + " auf " + change + "-ter Stelle des Array mit " + oldArray[change] + " auf " + i + "-ter Stelle des Arrays.");
            oldArray[i] = change;
            oldArray[intSave] = backup;
        }
        return oldArray;
    }
    private int[] createIntArray(int minimum, int maximum, int arrayLength){
        int[] creationArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            creationArray[i] = (int)((Math.random() * (maximum - minimum)) + minimum);
        }
        return creationArray;
    }
    private void writeToConsoleLn(Object object){System.out.println(object);}
    public static void main(String[] args){new SelectionSort();}
}
