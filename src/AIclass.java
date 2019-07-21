public class AIclass
{
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

    public void calculate() {
        boolean works = false;
        int firstNum;
        int secondNum;
        int thirdNum; // combines these numbers to make 24
        while (works != true) {
            for (int i = 0; i < 4; i++) // goes through first 4 cards
            {
                ayy.get(i).getValue();
                for (int j = 0; j < 3; j++) // operates them in addition
                {

                    for (int k = 0; k < 2; k++) // through final two, makes 24 after combo theoretically
                    {

                    }
                }
            }

            // if it works, the values are stored in variables to create an equation that makes 24
        }
    }

}
