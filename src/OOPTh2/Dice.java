package OOPTh2;

import java.util.Random;

public class Dice {

    private int outcome1;
    private int outcome2;
    Random random = new Random();
    Dice(){
        outcome1=0;
        outcome2=0;
    }
    public void roll(){
        outcome1=random.nextInt(6)+1;
        outcome2=random.nextInt(6)+1;
    }

    public int getOutcome1() {
        return outcome1;
    }

    public int getOutcome2() {
        return outcome2;
    }
}
