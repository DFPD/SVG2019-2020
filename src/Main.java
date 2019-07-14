import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck ayy = new Deck(); // your personal deck
        ArrayList<Card> playerHand = new ArrayList<Card>(0);
        ArrayList<Card> enemyHand = new ArrayList<Card>(0);
        ayy.shuffle();
        ayy.getCards(); // prints out the cards, will be in GUI form
        JohnnyGUI myGUI = new JohnnyGUI();
        myGUI.setVisible(true);
        draw(playerHand, ayy);
        draw(enemyHand, ayy);
        System.out.println("Your hand:");
        getHand(playerHand);

        System.out.println("Computers' hand: ");
        getHand(enemyHand);
        System.out.println("The rest of the deck: ");
        ayy.getCards();
        System.out.println("Wassup doug welcome to the 24 game! Please enter your name: ");
        Scanner johnny = new Scanner(System.in); // takes the user's name and we put it into
        // the top left corner for the GUI

    }

    // 7/13 need to make sure player does not duplicate cards in operation
    public static void draw(ArrayList<Card> hand, Deck ay)
    {
        for (int i = 0; i < 4; i++) {
            hand.add(ay.deal());
        }
    }

    //
    public static void getHand(ArrayList<Card> hand) // prints out the hand you put in there
    {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(hand.get(i).getName()); // get the card and then get the name of the card
        }
    }
}


