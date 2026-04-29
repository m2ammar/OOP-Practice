package Practice4;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota",66, "Petrol");
        car.displayInfo();
        car.startEngine();
        car.stop();

    }
}
class Vehicle{
    protected String brand;
    protected int speed;
    protected String fuelType;

    public Vehicle(String brand, int speed, String fuelType){
        this.brand=brand;
        this.speed=speed;
        this.fuelType=fuelType;

    }

    void startEngine(){

        System.out.println(this.brand+" Starting");
    }
    void stop(){

        System.out.println("Stopped: "+this.brand);
    }
    void displayInfo(){

        System.out.println("Car: "+this.brand);
        System.out.println("Running at "+this.speed+" km/h with fuel "+this.fuelType);
    }
}
class Car extends Vehicle{

    public Car(String brand, int speed, String fuelType) {
        super(brand,speed, fuelType);
    }
}