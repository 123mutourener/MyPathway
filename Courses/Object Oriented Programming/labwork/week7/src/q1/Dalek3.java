package q1;

import java.util.ArrayList;
import java.util.Random;

public class Dalek3 {
    private ArrayList<String> sentences = new ArrayList<String>();

    private Random random = new Random();

    void addSaying(String s) {
        this.sentences.add(s);
    }

    public void setSayings(String[] u1) {
        for (int i = 0; i < u1.length; i++) {
            this.sentences.add(u1[i]);
        }
    }

    public void speak() {
        if(this.sentences.size() == 0) {
            System.out.println("No utterances installed!");
        } else {
            int index = random.nextInt(this.sentences.size());
            System.out.println(this.sentences.get(index));
        }
    }

    public static void main(String[] args) {
        Dalek3 d1 = new Dalek3();
        String[] u1 = { "Exterminate, Exterminate!", "I obey!", "Exterminate, annihilate, DESTROY!",
                "You cannot escape.", "Daleks do not feel fear.", "The Daleks must survive!" };
        d1.setSayings(u1);

        System.out.println("\nDalek d1 says: ");
        for (int i = 0; i < 10; i++) {
            d1.speak();
        }

        System.out.println("\nDalek d2 says: ");
        Dalek3 d2 = new Dalek3();
        String[] u2 = { "I obey!" };
        d2.setSayings(u2);

        for (int i = 0; i < 10; i++) {
            d2.speak();
        }
    }
}