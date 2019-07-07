public class Card {
    private int suit;//1.Hearts,2.diamonds3.spades4.clubs
    private int value;
    private String name;

    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
        name = setName();
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String setName(){
        String s = "";
        String v = "";
        if (suit == 1){
             s = "Hearts";
        }
        else if(suit == 2){
             s = "Diamonds";
        }
        else if(suit == 3){
             s = "Spades";
        }
        else{
             s = "Clubs";
        }

        if(value == 11){
             v = "Jack";
        }
        else if(value == 12){
             v = "Queen";
        }
        else if(value == 13){
             v = "King";
        }
        else if(value == 1){
             v = "Ace";
        }
        else{
            v = "" + getValue();
        }
        return (v +  " of " + s);
    }
}
