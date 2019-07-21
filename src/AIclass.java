import java.util.ArrayList;

public class AIclass {
    private int timeConstraint;
    private long timer;

    public AIclass(int tc) {
        timeConstraint = tc;
    }

    public void startTime() {
        timer = System.currentTimeMillis();
    }

    public boolean checktime() {
        if (timer > timeConstraint) {
            return true;
        } else return false;
    }

    public String calculate(ArrayList<Card> Hand) {
        int tempHand; // first number you take out of the hand
        int tempHand2; // number you create after first combo (3 values left)
        int tempHand3; // number created after second combo (2 values left)
        int firstNum;
        int secondNum;
        int thirdNum; // combines these numbers to make 24
        for (int u = 0; u < 4; u++) // goes through 4 cards in the hand
            tempHand = Hand.get(u).getValue();
            for (int i = 0; i < 4; i++) // uses that 1 card and combines in the 4 math opps
            {
                tempHand
                for (int j = 0; j < 3; j++) // combines tempHand2 with the rest in the 4 opps
                {

                    for (int k = 0; k < 2; k++) // through final two, makes 24 after combo theoretically
                    {

                    }
                }
            }

        return "";
        // if it works, the values are returned in a string of the equation that makes 24
    }

}
