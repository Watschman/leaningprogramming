package consoleProgramming.encrypting;

public class EncryptingHelper {
    public static String encrypt(String string){
        StringBuilder STRINGBUILDER = new StringBuilder();
        int TO_ADD = 0;
        for (char ONECHAR : string.toLowerCase().toCharArray()){
            if ((int)ONECHAR >= 121)
                TO_ADD = (int)ONECHAR - 24;
            else
                TO_ADD = (int)ONECHAR + 2;
            STRINGBUILDER.append((char)TO_ADD);
        }
        return STRINGBUILDER.toString();
    }
}
