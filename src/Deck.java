public class Deck
{
    private Card[] cards = new Card[52]; // this is our array that reps a deck of cards

    public Deck()
    {
        int pointer = 0; // marks where in the array of cards we at
        for(int i = 1; i < 5; i++)
        {
            for(int j = 1; j < 14; j++)
            {
                cards[pointer] = new Card(i , j);
                pointer++;
            }
        }
    }

    public void getCards()
    {
        for(int i = 0; i < cards.length; i++)
            System.out.println(cards[i].getName());
    }

    public void shuffle()
    {
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < cards.length; i++) {
                int randIndex = (int) (Math.random() * 52);
                Card temp = cards[i];
                cards[i] = cards[randIndex];
                cards[randIndex] = temp;

            }
        }
    }

}
