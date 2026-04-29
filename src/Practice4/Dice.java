package Practice4;

import java.util.Random;

public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }
    Random random = new Random();


    int roll() {

        int fromMe= random.nextInt(this.sides)+1;
        return fromMe;
    }
}
class Lottery{

    private final int ran=5;
    int[] arr = new int[ran];
    Random random = new Random();

    public Lottery(){
        for(int i=0; i<arr.length; i++){
            arr[i]=random.nextInt(100)+1;
        }
    }

    void  display(){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    int getWinner() {
        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp=arr[i];
            }
        }return temp;
    }
}

class ClassRoom {

    private String[] namePool = {"Ali", "Sara", "Ahmed", "Hina", "Bilal", "Zara", "Omar", "Nida", "Hassan", "Fatima"};
    private String[] students = new String[10];
    Random rand = new Random();

    public ClassRoom() {

        for (int i = 0; i < students.length; i++) {
            students[i] = namePool[rand.nextInt(namePool.length)];
        }
    }

    void display() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    String getPicked() {
        return students[rand.nextInt(namePool.length)];
    }
}
