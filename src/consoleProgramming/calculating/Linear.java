package consoleProgramming.calculating;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Linear{
    static double M;
    static double N;
    static double X;

    static boolean RICHTIG;

    Scanner SCANNER = new Scanner(System.in);

    Linear() {
        input();
        confirm(M, N);
    }
    void confirm(double m, double n){
        writeToConsole("Ist " + m + "*x+" + n + "=0 die richtige Gleichung? (Anworte mit true/false)");
        try {
            RICHTIG = SCANNER.nextBoolean();
        }catch (InputMismatchException e){
            writeToConsole("Ungültige Eingabe, starte Eingabe erneut.");
            new Linear();
        }
        if (RICHTIG){
            writeToConsole("berechne...");
            calculate(m, n);
        }else {
            writeToConsole("Fordere erneute Eingabe an!");
            new Linear();
        }
    }
    void input(){
        writeToConsole("Wert fuer Parameter m");
        try {
            M = SCANNER.nextDouble();
        }catch (InputMismatchException e){
            writeToConsole("Ungültige Eingabe, starte Eingabe erneut.");
            new Linear();
        }
        writeToConsole("Wert fuer Parameter n");
        try {
            N = SCANNER.nextDouble();
        }catch (InputMismatchException e){
            writeToConsole("Ungültige Eingabe, starte Eingabe erneut.");
            new Linear();
        }
    }
    void calculate(double m, double n){
        if (m != 0) {
            X = -n / m;
            writeToConsole("x= " + X);
        }
        else if (n != 0) {
            writeToConsole("Keine moegliche Loesung für folgende Gleichung gefunden: " + m +"*x+" + n + "=0");
        }
        else {
            Random RNG = new Random();
            X = 100*RNG.nextDouble();
            writeToConsole("Keine eindeutige Loesung für folgende Gleichung gefunden: " + m + "*x+" + n + "=0");
            writeToConsole("Eine moegliche Loesung: x=" + X);
        }
        writeToConsole("Möchten Sie das Programm beenden? (Antworten mit true/false)");
        try {
            if (!SCANNER.nextBoolean()) {
                writeToConsole("Neustart des Programms...");
                new Linear();
            }
        }catch (InputMismatchException e){
            writeToConsole("Ungültige Eingabe, starte Eingabe erneut.");
            new Linear();
        }
    }
    void writeToConsole(Object object){
        System.out.println(object);
    }
    public static void main(String[] args){new Linear();}
}
