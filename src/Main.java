import java.util.*;

public class Main {
    public static void main(String[] args) {
        Card myCard1 = new Card("Spade", 14);
        Deck theDeck = new Deck();
        Scanner input = new Scanner(System.in);

//        System.out.println(myCard1.getSuit());
//        System.out.println(myCard1.getSpecial());
//        System.out.println(myCard1.getValue());

        theDeck.initialize();
        theDeck.shuffle();
        System.out.println(theDeck.duplicateChecker());
        System.out.print("Enter the number of cards you want to deal from the deck: ");
        int deal = input.nextInt();
        for(int i = 0; i < deal; i++) {
            theDeck.dealCards();
        }

        for(int i = deal; i < 52; i++) {
            if(i == deal) {
                System.out.println("The next card index is: " + theDeck.nextCardIndex);
            }
            theDeck.dealCards();
        }
    }
}