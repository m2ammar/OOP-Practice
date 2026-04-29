package Lab09;

public class Fan implements  Switchable, Adjustable {

    @Override
    public void turnOn(){

        System.out.println("Fan turned on");
    }

    @Override
    public void turnOff(){

        System.out.println("Fan turned off");
    }

    @Override
    public void increase(){

        System.out.println("Increase");
    }

    @Override
    public void decrease(){

        System.out.println("Decrease");
    }
}
class Light implements Switchable{

    @Override
    public void turnOn(){

        System.out.println("Turn on light");
    }
    @Override
    public void turnOff(){

        System.out.println("Turn of light");
    }
}
class SecuritySystem implements Switchable{

    @Override
    public void turnOn(){

        System.out.println("Turned On Security System");
    }
    @Override
    public void turnOff(){

        System.out.println("Turned Of Security System");
    }
}
class AC implements Switchable, Adjustable {

    @Override
    public void turnOn() {

        System.out.println("Turned On Ac");
    }

    @Override
    public void turnOff() {
        System.out.println("Turned Of Ac");

    }

    @Override
    public void increase() {

        System.out.println("Increase Ac");
    }

    @Override
    public void decrease() {

        System.out.println("Decrease Ac");
    }

    public void heat() {

        System.out.println("Ac is heat up");
    }
}
