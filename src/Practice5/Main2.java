package Practice5;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {

        RandomSum randomSum= new RandomSum();
        System.out.println("Num1: "+ randomSum.getNum1());
        System.out.println("Num2: "+ randomSum.getNum2());
        System.out.println("Sum: "+ randomSum.getSum());
    }
}
class RandomSum{
    private int num1;
    private int num2;
    private int sum;
    private Random random;

    public RandomSum(){
        random= new Random();
        generateNumbers();
    }

    public void generateNumbers(){
        this.num1= random.nextInt(50)+1;
        this.num2= random.nextInt(50)+1;

    }
    public int getSum(){
        return num1+num2;
    }

    public int getNum1(){
        return this.num1;
    }

    public int getNum2(){
        return this.num2;
    }
}