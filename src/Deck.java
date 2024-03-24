public class Deck {
    public Card[] cards;
    public int nextCardIndex;

    //initializes cards array and nextCardIndex
    public Deck() {
        cards = new Card[52];
        nextCardIndex = 0;
    }

    //fills array cards with 4 suits of 13 cards
    public void initialize() {
        String suit = "";
        int index = 0;
        for(int type = 0; type < 4; type++) {
            if(type == 0)
                suit = "Spade";
            if(type == 1)
                suit = "Heart";
            if(type == 2)
                suit = "Diamond";
            if(type == 3)
                suit = "Clubs";
            for(int val = 2; val <= 14; val++) {
                cards[index] = new Card(suit, val);
                index++;
            }
        }
    }

    //shifts around the Card values in cards list
    public void shuffle() {
        Card placeholder = new Card();
        int randIndex = 0;
        for(int i = 0; i < 52; i++) {
            //generates a random index that is different from the current index
            randIndex = (int) (Math.random() * 52);
            while(randIndex == i) {
                randIndex = (int) (Math.random() * 52);
            }

            placeholder = new Card(cards[i].getSuit(), cards[i].getValue());
            cards[i].setSuit(cards[randIndex].getSuit());
            cards[i].setValue(cards[randIndex].getValue());
            cards[randIndex].setSuit(placeholder.getSuit());
            cards[randIndex].setValue(placeholder.getValue());
        }
    }

    //Deals prints the instance variables of a card variable in array cards, then moves onto the card in the next index
    public void dealCards() {
        if(!(cards[nextCardIndex].getSpecial() == null)) {
            System.out.println("Special: " + cards[nextCardIndex].getSpecial());
        }
        System.out.println("Suit: " + cards[nextCardIndex].getSuit());
        System.out.println("Value: " + cards[nextCardIndex].getValue());
        nextCardIndex++;
    }

    //checks the deck for duplicate card values
    public boolean duplicateChecker() {
        for(int i = 1; i < 52; i++) {
            if(cards[i].getValue() == cards[i-1].getValue() && cards[i].getSuit() == cards[i-1].getSuit()) {
                return true;
            }
        }
        return false;
    }
}
