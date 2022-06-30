package class6;

public class Card {

    // 1. Data members
    private int rank;
    private String suit;

    // 2. Constructors
    Card (int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // 3. Methods
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
