package Practice5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Dice dice= new Dice();

        for(int i=0; i<5; i++){
            System.out.println("Roll "+ (i+1)+": "+dice.rollDice());
        }
    }
}
class Dice {

    private int num;
    private Random random;

    public Dice() {

        random= new Random();
    }

    public int rollDice(){
        num = random.nextInt(6)+1;
        return num;
    }
}