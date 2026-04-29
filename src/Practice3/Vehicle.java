package Practice3;

public class Vehicle {

    private String brand;
    private int speed;

    public Vehicle(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void move(){
        System.out.println(this.brand+" is moving at "+this.speed+" km/h");
    }

}
class Car extends Vehicle {

    private String fuelType;

    public Car(String brand, int speed, String fuelType){
        super(brand, speed);
        this.fuelType=fuelType;
    }

    @Override
    public void move(){
        System.out.println(this.getBrand()+" is driving on "+this.fuelType+" at "+this.getSpeed()+" km/h");
    }

    public String getFuelType(){
        return this.fuelType;
    }
}

