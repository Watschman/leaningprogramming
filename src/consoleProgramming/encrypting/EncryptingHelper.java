package consoleProgramming.encrypting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncryptingHelper {
    public static String encryptString(String string){
        List<Character> OUTPUT= new ArrayList<Character>();
        OUTPUT.clear();
        char[] INPUT = string.toCharArray();
        for (char ONECHAR : INPUT){
            switch (ONECHAR){
                case 'a':
                    OUTPUT.add('c');
                    break;
                case 'b':
                    OUTPUT.add('d');
                    break;
                case 'c':
                    OUTPUT.add('e');
                    break;
                case 'd':
                    OUTPUT.add('f');
                    break;
                case 'e':
                    OUTPUT.add('g');
                    break;
                case 'f':
                    OUTPUT.add('h');
                    break;
                case 'g':
                    OUTPUT.add('i');
                    break;
                case 'h':
                    OUTPUT.add('j');
                    break;
                case 'i':
                    OUTPUT.add('k');
                    break;
                case 'j':
                    OUTPUT.add('l');
                    break;
                case 'k':
                    OUTPUT.add('m');
                    break;
                case 'l':
                    OUTPUT.add('n');
                    break;
                case 'm':
                    OUTPUT.add('o');
                    break;
                case 'n':
                    OUTPUT.add('p');
                    break;
                case 'o':
                    OUTPUT.add('q');
                    break;
                case 'p':
                    OUTPUT.add('r');
                    break;
                case 'q':
                    OUTPUT.add('s');
                    break;
                case 'r':
                    OUTPUT.add('t');
                    break;
                case 's':
                    OUTPUT.add('u');
                    break;
                case 't':
                    OUTPUT.add('v');
                    break;
                case 'u':
                    OUTPUT.add('w');
                    break;
                case 'v':
                    OUTPUT.add('x');
                    break;
                case 'w':
                    OUTPUT.add('y');
                    break;
                case 'x':
                    OUTPUT.add('z');
                    break;
                case 'y':
                    OUTPUT.add('a');
                    break;
                case 'z':
                    OUTPUT.add('b');
                    break;
                default:
                    OUTPUT.add(ONECHAR);
            }
        }
        return Arrays.deepToString(OUTPUT.toArray()).replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
    }
}
