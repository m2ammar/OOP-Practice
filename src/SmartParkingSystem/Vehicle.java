//Encapsulation
package SmartParkingSystem;

import java.util.ArrayList;

//abstraction
public abstract class Vehicle {

    //Encapsulation
    protected String plateNumber;
    protected double hoursParked;
    public static int track;

    public Vehicle(String plateNumber,  double hoursParked){
        this.plateNumber=plateNumber;
        this.hoursParked=hoursParked;
    }

    abstract void calculateFee(double hours);
    abstract void displayDetails();

}

//inheritance
class Car extends Vehicle{

    public Car(String plateNumber,  double hoursParked){
        super(plateNumber, hoursParked);
        track++;
    }

    //override
    @Override
    void calculateFee(double hours){
        double temp= hours*200;
        System.out.println("Total Bill for parking Car for "+hours+" is "+temp);
    }

    //override
    @Override
    void displayDetails(){
        System.out.println("========================");
        System.out.println("Plate number: "+plateNumber);
        calculateFee(hoursParked);
    }

}

//inheritance
class Bike extends Vehicle{

    public Bike(String plateNumber,  double hoursParked){
        super(plateNumber, hoursParked);
        track++;
    }

    //override
    @Override
    void calculateFee(double hours){
        double temp= hours*100;
        System.out.println("Total Bill for parking Bike for "+hours+" is "+temp);
    }

    //override
    @Override
    void displayDetails(){
        System.out.println("========================");
        System.out.println("Plate number: "+plateNumber);
        calculateFee(hoursParked);
    }
}

//inheritance
class Truck extends Vehicle{

    public Truck(String plateNumber,  double hoursParked){
        super(plateNumber, hoursParked);
        track++;
    }

    //override
    @Override
    void calculateFee(double hours){
        double temp= (hours*300)+500;
        System.out.println("Total Bill for parking Truck for "+hours+" with 500 extra charges is "+temp);
    }

    //override
    @Override
    void displayDetails(){
        System.out.println("========================");
        System.out.println("Plate number: "+plateNumber);
        calculateFee(hoursParked);
    }
}

class ParkingLot {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    void displayAll() {
        for (Vehicle v : vehicles) {
            v.displayDetails();
        }
    }
}