package class6;

public class CardDeck {

    // 1. Data members
    private Card cards[];

    // 2. Constructors
    CardDeck() {
        cards = new Card[52];

        // Diamonds
        for (int i = 0; i < 13; i++) {
            cards[i] = new Card(i+1,"Diamond");
        }

        for (int i = 13; i < 26; i++) {
            cards[i] = new Card(i-13,"Club");
        }

        for (int i = 26; i < 39; i++) {
            cards[i] = new Card(i-26,"Heart");
        }

        for (int i = 39; i < 52; i++) {
            cards[i] = new Card(i-39,"Spade");
        }

    }

    // 3.

}
