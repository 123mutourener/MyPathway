package q6;

import stdlib.*;

public class Tokenizer {
    private String[] tokens;

    public Tokenizer() {
        tokens = new String[0];
    }

    public Tokenizer(String fname) {
        this.tokensFromFile(fname);
    }

    public void tokensFromFile(String fname) {
        In file = new In(fname);
        String token = file.readAll();
        tokenize(token);
    }

    public void tokenize(String str) {
        this.tokens = str.split("\\W+", 0);
    }

    public String[] getTokens() {
        return this.tokens;
    }

    public int getNumberTokens() {
        return this.tokens.length;
    }

    public static void main(String[] args) {

    }
}