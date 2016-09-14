package consoleProgramming.calculating;

import java.util.Scanner;

public class NumberCalculation {
    
    private Scanner SCANNER = new Scanner(System.in);
    
    private NumberCalculation(){
        int NUMBER = getInt("Geben Sie die zur Berechnung zu verwendente Zahl ein!");
        calculate(NUMBER);
        redo();
    }
    private void calculate(int integer){
        int k = integer;
        for (int i = 1; i <= integer; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(i + " ");
            }
            System.out.print("= "+ k*i);
            System.out.println();
            k--;
        }
    }
    private int getInt(Object object){
        System.out.println(object);
        try {
            return SCANNER.nextInt();
        }catch (Exception ex){
            System.out.println("Da ist was falsch gelaufen ( "+ ex.getMessage()+ " )");
        }
        return 0;
    }
    private void redo(){
        System.out.println("Möchten Sie eine neue Berechnung mit neuer Zahl durchführen? (Antworten mit true/false)");
        try {
            if (SCANNER.nextBoolean())
                new NumberCalculation();
            else
                System.out.println("Stoppe Programm...");
        }catch (Exception e){
            System.out.println("Ungültige Eingabe stoppe Programm... (" + e.getMessage() + ")");
        }
    }
    public static void main(String[] args){new NumberCalculation();}
}
