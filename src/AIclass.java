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
        Card[][] hands = new Card[][]{
                {Hand.get(0),Hand.get(1),Hand.get(2),Hand.get(3)},//1
                {Hand.get(1),Hand.get(0),Hand.get(2),Hand.get(3)},//2
                {Hand.get(2),Hand.get(1),Hand.get(0),Hand.get(3)},//3
                {Hand.get(0),Hand.get(2),Hand.get(1),Hand.get(3)},//4
                {Hand.get(1),Hand.get(2),Hand.get(0),Hand.get(3)},//5
                {Hand.get(2),Hand.get(1),Hand.get(0),Hand.get(3)},//6
                {Hand.get(2),Hand.get(1),Hand.get(3),Hand.get(0)},//7
                {Hand.get(1),Hand.get(2),Hand.get(3),Hand.get(0)},//8
                {Hand.get(3),Hand.get(2),Hand.get(1),Hand.get(0)},//9
                {Hand.get(2),Hand.get(3),Hand.get(1),Hand.get(0)},//10
                {Hand.get(1),Hand.get(3),Hand.get(2),Hand.get(0)},//11
                {Hand.get(3),Hand.get(1),Hand.get(2),Hand.get(0)},//12
                {Hand.get(3),Hand.get(0),Hand.get(2),Hand.get(1)},//13
                {Hand.get(0),Hand.get(3),Hand.get(2),Hand.get(1)},//14
                {Hand.get(2),Hand.get(3),Hand.get(0),Hand.get(1)},//15
                {Hand.get(3),Hand.get(2),Hand.get(0),Hand.get(1)},//16
                {Hand.get(0),Hand.get(2),Hand.get(3),Hand.get(1)},//17
                {Hand.get(2),Hand.get(0),Hand.get(3),Hand.get(1)},//18
                {Hand.get(1),Hand.get(0),Hand.get(3),Hand.get(2)},//19
                {Hand.get(0),Hand.get(1),Hand.get(3),Hand.get(2)},//20
                {Hand.get(3),Hand.get(1),Hand.get(0),Hand.get(2)},//21
                {Hand.get(1),Hand.get(3),Hand.get(0),Hand.get(2)},//22
                {Hand.get(0),Hand.get(3),Hand.get(1),Hand.get(2)},//23
                {Hand.get(3),Hand.get(0),Hand.get(1),Hand.get(2)},//24



        };
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
