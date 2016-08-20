package consoleProgramming.calculating;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quadratisch{
    static double P;
    static double Q;
    static double X;
    static double D;

    private static boolean RICHTIG;

    Scanner SCANNER = new Scanner(System.in);

    Quadratisch() {
        input();
        confirm(P, Q);
    }
    void confirm(double p, double q){
        writeToConsole("Ist x^2+" + p + "*x+" + q + "=0 die richtige Gleichung? (Anworte mit true/false)");
        try {
            RICHTIG = SCANNER.nextBoolean();
        }catch (InputMismatchException e){
            writeToConsole("Ungültige Eingabe, starte Eingabe erneut.");
            new Quadratisch();
        }
        if (RICHTIG){
            writeToConsole("berechne...");
            calculate(p, q);
        }else {
            writeToConsole("Fordere erneute Eingabe an!");
            new Quadratisch();
        }
    }
    void input(){
        writeToConsole("Wert fuer Parameter p");
        try {
            P = SCANNER.nextDouble();
        }catch (InputMismatchException e){
            writeToConsole("Ungültige Eingabe, starte Eingabe erneut.");
            new Quadratisch();
        }
        writeToConsole("Wert fuer Parameter q");
        try {
            Q = SCANNER.nextDouble();
        }catch (InputMismatchException e){
            writeToConsole("Ungültige Eingabe, starte Eingabe erneut.");
            new Quadratisch();
        }
    }
    void calculate(double p, double q){
        D= ((p*p)/4)-q;
        if (D == 0) {
            X = -p/2;
            writeToConsole("x= " + X);
        }
        else if (D < 0) {
            writeToConsole("Keine moegliche Loesung für folgende Gleichung gefunden: x^2+" + p +"*x+" + q + "=0");
        }
        else {
            double X1 = -p/2+(Math.sqrt(D));
            double X2 = -p/2-(Math.sqrt(D));
            writeToConsole("Zwei moegliche Loesungen entdeckt: x1= " + X1 + " und x2= " + X2);
        }
        writeToConsole("Möchten Sie das Programm beenden? (Antworten mit true/false)");
        try {
            if (!SCANNER.nextBoolean()) {
                writeToConsole("Neustart des Programms...");
                new Quadratisch();
            }
        }catch (InputMismatchException e){
            writeToConsole("Ungültige Eingabe, starte Eingabe erneut.");
            new Quadratisch();
        }
    }
    void writeToConsole(Object object){
        System.out.println(object);
    }
    public static void main(String[] args){new Quadratisch();}
}
