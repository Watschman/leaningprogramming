package consoleProgramming.rekursion;

import java.util.Scanner;

public class Funktion {
    Funktion(){
        Scanner SCANNER = new Scanner(System.in);
        System.out.print("Input: ");
        System.out.println(calculate(SCANNER.nextInt()));
    }
    int calculate(int n){
        switch (n){
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return (2 * calculate(n - 1) + 3 * calculate(n -2));
        }
    }
    public static void main(String[] args){new Funktion();}
}
