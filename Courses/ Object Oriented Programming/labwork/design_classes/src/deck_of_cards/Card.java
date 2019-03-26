package deck_of_cards;

class Card {
    private String rank;
    private int suit;

    Card(String rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

    @Override
    public int hashCode() {
        return suit;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Card) {
            if (((Card)obj).getRank().equals(this.rank) && ((Card)obj).suit == this.suit) {
                return true;
            }else {
                return false;
            }
        } else {
            return false;
         }
    }

    public String toString() {
        return "The card rank is: " + this.rank + "; The card suit is: " + this.suit + 1 + ";";
    }

    public static void main(String[] args) {

    }
}