package deck_of_cards;

import java.util.ArrayList;
import java.util.Random;

class Deck {
    private ArrayList<Card> cardList = new ArrayList<>();
    private static Random random = new Random();

    Deck() {
        for (int i = 0; i < 13; i++) {
            cardList.add(new Card("spades", i));
            cardList.add(new Card("hearts", i));
            cardList.add(new Card("diamonds", i));
            cardList.add(new Card("clubs", i));
        }
    }

    public ArrayList<Card> getCards() {
        return this.cardList;
    }

    public Card getACard() {
        return this.cardList.get(Deck.random.nextInt(48));
    }
}
