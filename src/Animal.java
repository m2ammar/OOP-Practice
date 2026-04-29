abstract public class Animal {

    private String name;
    private int age;
    private double weight;

    public abstract String makeSound();

    public Animal(String name, int age, double weight){
        this.name=name;
        if(age>0){
            this.age=age;
        }
        if(weight>=0) {
            this.weight = weight;
        }
    }
    public String getName(){
       return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }
}
class Cat extends Animal{
    private boolean isIndoor;

    public Cat(String name, int age,double weight, boolean isIndoor){
        super(name, age, weight);
        this.isIndoor=isIndoor;
    }

    public boolean getIsIndoor(){
        return this.isIndoor;
    }

    public String makeSound() {

        return "Meow!";
    }

    public void purr(){

        System.out.println(getName()+" is making "+makeSound()+" sound.");
    }
}
class Dog extends Animal{

    private boolean isIndoor;

    public Dog(String name, int age,double weight, boolean isIndoor){
        super(name, age, weight);
        this.isIndoor=isIndoor;
    }

    public boolean getIsIndoor(){
        return this.isIndoor;
    }

    public String makeSound(){

        return "Woof!";
    }

}
class Bird extends Animal{

    private boolean canFly;

    public Bird(String name, int age,double weight, boolean canFly){
        super(name, age, weight);
        this.canFly=canFly;
    }

    public boolean getCanFly(){
        return this.canFly;
    }

    public String makeSound(){

        return "Tweet!";
    }
}
class Main {
    public static void main(String[] args) {

        Dog d1= new Dog("Zorro", 1,66, true);
        Cat c1 = new Cat("Bounty", 2, 55, false);
        Bird b1 = new Bird("Luna", 2,2, true);

        Animal[] animals= {d1, c1, b1};

        int temp;
        for(temp =0; temp< animals.length; temp++ ){
            System.out.println(animals[temp].getName());
            System.out.println(animals[temp].getAge());
            System.out.println(animals[temp].getWeight());
            System.out.println(animals[temp].makeSound());

        }
//
//        System.out.println(d1.getName());
//        System.out.println(d1.getAge());
//        System.out.println(d1.getIsIndoor());
//        System.out.println(d1.makeSound());
//
//        System.out.println(c1.getName());
//        System.out.println(c1.getAge());
//        System.out.println(c1.getIsIndoor());
//        System.out.println(c1.makeSound());
//        c1.purr();
//
//        System.out.println(b1.getName());
//        System.out.println(b1.getAge());
//        System.out.println(b1.getCanFly());
//        System.out.println(b1.makeSound());

    }
}