package SmartParkingSystem;

public class Main {
    public static void main(String[] args) {

        //Run time polymorphism
        ParkingLot lot = new ParkingLot();

        lot.addVehicle(new Car("abs888", 6));
        lot.addVehicle(new Bike("avd843", 4));
        lot.addVehicle(new Car("ngm778", 9));
        lot.addVehicle(new Truck("bfd742", 3));

        lot.displayAll(); // arraylist is actually used

    }
}

