package Lab09;

public class Main {
    public static void main(String[] args) {

//        Animal a= new Cat();
//        a.sound();
//
//        Cat cat = new Cat();
//        cat.sound();
//
//        Payment payment = new CreditCard();
//        payment.pay();
//
//        Payment payment1 = new DebitCard();
//        payment.pay();

//        Fan fan = new Fan();
//        fan.turnOff();
//        fan.turnOn();
//        fan.increase();
//        fan.decrease();

//        Employee e = new FullTimeEmployee();
//        e.calculateSalary();
//
//        e=new PartTimeEmployee();
//        e.calculateSalary();
//
//        Switchable s;
//        s= new Light();
//        s.turnOn();
//        s.turnOff();
//
//        s= new SecuritySystem();
//        s.turnOff();
//        s.turnOn();
//
//        AC ac= new AC();
//        ac.decrease();
//        ac.turnOff();

//        Switchable[] lights = new Light[10];
//        for(int i=0; i< lights.length; i++){
//            lights[i]= new Light();
//        }
//
//        for(int i=0; i<lights.length; i++){
//            lights[i].turnOn();
//        }

//        Fan[] fans = new Fan[6];
//        for(int i=0; i< fans.length; i++){
//            fans[i]= new Fan();
//        }
//        for(int i=0; i<fans.length; i++){
//            fans[i].turnOn();
//        }

//        Combine[] combines ={new Fan(), new Light()};
//        for(int i=0; i< combines.length; i++){
//            if(i==0 && i<=5) {
//                combines[i] = new Fan();
//            }else if(i==6 && i<=combines.length) {
//                combines[i] = new Light();
//            }
//        }
//
//        for(int i=0; i<combines.length; i++){
//            combines[i].turnOn();
//        }



        Switchable[] lightsAndFan = new Switchable[10];
        for(int i=0; i< lightsAndFan.length; i++){
            if(i<5) {
                lightsAndFan[i] = new Light();
            }else{
                lightsAndFan[i] = new Fan();
            }
        }

        for(int i=0; i<lightsAndFan.length; i++){
            lightsAndFan[i].turnOn();
        }

    }
}
