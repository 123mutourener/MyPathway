package q5;

public class OneTimePadEncipher {

    public static int charToInt(char l) {
        // ADD CODE HERE
        // Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
        l = Character.toUpperCase(l);
        int intChar = (int) l - 65;
        return intChar;
    }

    public static char intToChar(int i) {
        // ADD CODE HERE
        // Should convert an integer to a character, for example 0 -> 'a', b -> '1'
        // it should always return lower case chae
        char charInt = (char) (i + 97);
        return charInt;
    }

    public static boolean isAlpha(char c) {
        // You do not need to implement this method, but you may find it useful.
        int t = charToInt(c);
        if (t >= 0 && t <= 25) {
            return true;
        } else {
            return false;
        }
    }

    public static String encipher(String original, String onetimepad) {
        // ADD CODE HERE
        String upperPlainText = original.toUpperCase();
        String upperKey = onetimepad.toUpperCase();
        String ciphertext = "";

        for (int i = 0; i < original.length(); i++) {
            char nextChar = upperPlainText.charAt(i);
            if (isAlpha(upperPlainText.charAt(i))) {
                nextChar = intToChar((charToInt(upperPlainText.charAt(i)) + charToInt(upperKey.charAt(i))) % 26);
            }
            ciphertext += nextChar;
        }
        return ciphertext;
    }

    public static void main(String[] args) {
        String ciphertext = encipher("IS THIS, SECURE", "KEEPMEVERYVERYSAFE");
        System.out.print(ciphertext);
    }

}