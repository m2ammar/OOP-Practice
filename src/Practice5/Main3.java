package Practice5;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {

        MaxFinder maxFinder= new MaxFinder();
        System.out.println("Num1: "+ maxFinder.getNum1());
        System.out.println("Num2: "+ maxFinder.getNum2());
        System.out.println("Num3: "+ maxFinder.getNum3());
        System.out.println("Max: "+ maxFinder.findMax());
    }
}
class MaxFinder{
    private int num1;
    private int num2;
    private int num3;
    private int max;
    private Random random;

    public MaxFinder(){
        random= new Random();
        generateNumbers();
    }

    public void generateNumbers(){
        this.num1= random.nextInt(100)+1;
        this.num2= random.nextInt(100)+1;
        this.num3=random.nextInt(100)+1;
    }

    public  int findMax(){

    if(this.num1>= this.num2 && this.num1>= this.num3){
        this.max=this.num1;
        return this.max;
    }else if(this.num2>= this.num1 && this.num2>= this.num3){
        this.max=this.num2;
        return this.max;
    }else{
        this.max=this.num3;
        return this.max;
    }

}
//    public int getMax(){
//        return this.max;
//    }

    public int getNum1(){
        return this.num1;
    }

    public int getNum2(){
        return this.num2;
    }

    public int getNum3(){
        return this.num3;
    }
}