public class Card {
    private String suit;
    private int value;
    private String special;

    //Intializes card instance variables
    public Card() {
        suit = "";
        value = 0;
    }

    //Initializes instance variables with parameter values, sets a special value if conditions met
    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
        if(value == 11)
            special = "Jack";
        if(value == 12)
            special = "Queen";
        if(value == 13)
            special = "King";
        if(value == 14)
            special = "Ace";
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getSpecial() {
        return special;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
        if(value < 11)
            special = null;
        if(value == 11)
            special = "Jack";
        if(value == 12)
            special = "Queen";
        if(value == 13)
            special = "King";
        if(value == 14)
            special = "Ace";

    }

    public void setSpecial(String special) {
        this.special = special;
    }
}
