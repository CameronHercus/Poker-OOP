package Main;

public class Card {
    private int rank;
    private Suit suit;
    private CardValue value;

    public Card() {
    }

    public Card(int tempRank, Suit tempSuit, CardValue tempCardValue) {
        rank = tempRank;
        suit = tempSuit;
        value = tempCardValue;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }

    public String toString() {
        return value + " of " + suit;
    }
}
