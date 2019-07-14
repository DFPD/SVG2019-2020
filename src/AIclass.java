public class AIclass {
    private int timeConstraint;
    private long timer;
    public AIclass(int tc){
        timeConstraint = tc;
    }

    public void startTime(){
        timer = System.currentTimeMillis();
    }
    public boolean checktime(){
        if(timer >timeConstraint){
            return true;
        }
        else{return false};
    }

}
