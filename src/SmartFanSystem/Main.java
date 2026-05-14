package SmartFanSystem;

public class Main {
    public static void main(String[] args) {

        Fan fan = new Fan();
        fan.turnOn();
        fan.increaseSpeed();// speed = 2
        fan.increaseSpeed();// speed = 3
        fan.increaseSpeed();// stays 3

        fan.decreaseSpeed();// 2
        fan.decreaseSpeed();// 1
        fan.decreaseSpeed();//

    }
}
