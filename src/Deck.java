import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards = new ArrayList<Card>(52); // this is our array that reps a deck of cards

    public Deck()
    {
        for(int i = 1; i < 5; i++)
        {
            for(int j = 1; j < 14; j++)
            {
                cards.add( new Card(i , j));

            }
        }
    }

    public void getCards()
    {
        for(int i = 0; i < cards.size(); i++)
            System.out.println(cards.get(i).getName());
    }

    public void shuffle()
    {
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < cards.size(); i++) {
                int randIndex = (int) (Math.random() * 52);
                Card temp = cards.get(i);
                cards.set(i,cards.get(randIndex));
                cards.set(randIndex,temp);

            }
        }
    }

}
