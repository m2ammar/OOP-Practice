package Fan;

public class Main {
    public static void main(String[] args) {

        Fan f = new Fan();
        System.out.println(f.getSpeed());

        f.turnOn();
        System.out.println(f.getSpeed());
        f.speedUp();
        f.speedUp();
        System.out.println(f.getSpeed());
        f.speedUp();
        System.out.println(f.getSpeed());
        f.turnOff();
        System.out.println(f.getSpeed());
        f.slowDown();
        System.out.println(f.getSpeed());
    }
}
