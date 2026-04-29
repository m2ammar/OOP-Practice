package Lab10Quiz;

public class Contractor implements Employee, WorkFromHome{
    //work from home allowed, fixed contract amount
    private String name;
    private int age;
    private double fixedAmount;

    public Contractor(String name, int age){

        this.name=name;
        this.age=age;
        this.fixedAmount=3600000;
    }

    public Contractor(String name){

        this.name=name;
    }


    @Override
    public void info(){
        System.out.println("Contractor");
        System.out.println("Name: "+this.name );
        if (this.age != 0) {
            System.out.print(" Age: " + this.age +" \n");
        }
        System.out.println();
    }
    @Override
    public void workFromHome(){
        System.out.println("Contractor but Work from home allowed");
    }

    public int getAge(){
        return  this.age;
    }

    public String getName(){
        return  this.name;
    }
}
