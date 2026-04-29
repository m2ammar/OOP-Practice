public class Mid2 {
    public static void main(String[] args) {

        Vehicle1 v;

        v=new Car1(5,false,66.666);
        v.displayInfo();
    }
}

abstract class Vehicle1{

    protected int noOfWheels;
    protected boolean hasTurbo;
    protected double fuelCapacity;

    public Vehicle1(int noOfWheels,boolean hasTurbo,double fuelCapacity){
        this.noOfWheels=noOfWheels;
        this.hasTurbo=hasTurbo;
        this.fuelCapacity=fuelCapacity;
    }

    abstract void move();
    abstract void refuel();
    abstract void honk();
    void displayInfo(){
        move();
        refuel();
        honk();
    }
}
class Car1 extends Vehicle1{

    public Car1(int noOfWheels, boolean hasTurbo,double fuelCapacity) {
        super(noOfWheels, hasTurbo, fuelCapacity);

    }

    @Override
     void move(){

            System.out.println("This vehicle moves with "+this.noOfWheels+" wheels.");
    }
    @Override
    void refuel(){
        System.out.println("This vehicle refuels with "+fuelCapacity+" liters.");
    }

    @Override
    void honk() {

        if(hasTurbo){
            System.out.println("This car turbo boosts!");
        }else{
            System.out.println("This vehicle cannot turbo boost.");
        }
    }
}