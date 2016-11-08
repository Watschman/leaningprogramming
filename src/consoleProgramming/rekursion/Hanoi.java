package consoleProgramming.rekursion;

public class Hanoi {
    private  static void move(char a, char b, char c, int n){
        if (n == 1)
            System.out.println(">>> Lege die oberste Scheibe von Turm " + a + " auf Turm " + c + ".");
        else {
            move(a, c, b, n-1);
            move(a, b, c, 1);
            move(b, a, c, n-1);
        }
    }
    public static void main(String[] args){
        move('a', 'b', 'c', 10);
    }
}
