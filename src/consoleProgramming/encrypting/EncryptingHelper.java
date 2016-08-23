package consoleProgramming.encrypting;

public class EncryptingHelper {
    public static String encryptString(String string){
        char[] INPUT = string.toLowerCase().toCharArray();
        StringBuilder STRINGBUILDER = new StringBuilder(INPUT.length);
        for (char ONECHAR : INPUT){
            switch (ONECHAR){
                case 'a':
                    STRINGBUILDER.append('c');
                    break;
                case 'b':
                    STRINGBUILDER.append('d');
                    break;
                case 'c':
                    STRINGBUILDER.append('e');
                    break;
                case 'd':
                    STRINGBUILDER.append('f');
                    break;
                case 'e':
                    STRINGBUILDER.append('g');
                    break;
                case 'f':
                    STRINGBUILDER.append('h');
                    break;
                case 'g':
                    STRINGBUILDER.append('i');
                    break;
                case 'h':
                    STRINGBUILDER.append('j');
                    break;
                case 'i':
                    STRINGBUILDER.append('k');
                    break;
                case 'j':
                    STRINGBUILDER.append('l');
                    break;
                case 'k':
                    STRINGBUILDER.append('m');
                    break;
                case 'l':
                    STRINGBUILDER.append('n');
                    break;
                case 'm':
                    STRINGBUILDER.append('o');
                    break;
                case 'n':
                    STRINGBUILDER.append('p');
                    break;
                case 'o':
                    STRINGBUILDER.append('q');
                    break;
                case 'p':
                    STRINGBUILDER.append('r');
                    break;
                case 'q':
                    STRINGBUILDER.append('s');
                    break;
                case 'r':
                    STRINGBUILDER.append('t');
                    break;
                case 's':
                    STRINGBUILDER.append('u');
                    break;
                case 't':
                    STRINGBUILDER.append('v');
                    break;
                case 'u':
                    STRINGBUILDER.append('w');
                    break;
                case 'v':
                    STRINGBUILDER.append('x');
                    break;
                case 'w':
                    STRINGBUILDER.append('y');
                    break;
                case 'x':
                    STRINGBUILDER.append('z');
                    break;
                case 'y':
                    STRINGBUILDER.append('a');
                    break;
                case 'z':
                    STRINGBUILDER.append('b');
                    break;
                default:
                    STRINGBUILDER.append(ONECHAR);
            }
        }
        return STRINGBUILDER.toString();
    }
}
