package q5;

public class OneTimePadDecipher {
    public static String decipher(String encipheredText, String onetimepad) {
        String upperEncipheredText = encipheredText.toUpperCase();
        String original = "";
        for (int i = 0; i < upperEncipheredText.length(); i++) {
            char nextChar = upperEncipheredText.charAt(i);
            if (OneTimePadEncipher.isAlpha(upperEncipheredText.charAt(i))) {
                int intChar = OneTimePadEncipher.charToInt(upperEncipheredText.charAt(i))
                        - OneTimePadEncipher.charToInt(onetimepad.charAt(i));
                if (intChar < 0) {
                    intChar += 26;
                }
                nextChar = OneTimePadEncipher.intToChar(intChar);
            }
            original += nextChar;
        }
        return original.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(decipher("sw itmn, jcxyic", "KEEPMEVERYVERYSAFE"));
    }
}