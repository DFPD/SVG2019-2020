import java.util.Scanner;
public class Main
{
public static void main (String[] args)
{
    Deck ayy = new Deck(); // your personal deck
    ayy.shuffle();
    ayy.getCards(); // prints out the cards, will be in GUI form
    JohnnyGUI myGUI = new JohnnyGUI();
    myGUI.setVisible(true);
    System.out.println("Wassup doug welcome to the 24 game! Please enter your name: ");
    Scanner johnny = new Scanner(System.in); // takes the user's name and we put it into
    // the top left corner for the GUI


    /* 7/7/19 what to do:
    Figure out how to deal cards to you and the opponent
    make sure no duplicates
    remove cards that were selected by you and opponent from the deck
    make a solid rules page
     */
}
// 7/13 need to make sure player does not duplicate cards in operation

}


