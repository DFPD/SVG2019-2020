import java.util.Scanner;
public class Main
{
public static void main (String[] args)
{
    Deck ayy = new Deck();
    ayy.shuffle();
    ayy.getCards();
    JohnnyGUI myGUI = new JohnnyGUI();
    myGUI.setVisible(true);
    System.out.println("Wassup doug welcome to the 24 game! Please enter your name: ");
    Scanner johnny = new Scanner(System.in);
}

}


