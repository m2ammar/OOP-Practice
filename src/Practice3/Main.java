package Practice3;

public class Main {
    public static void main(String[] args) {

//        Dog dog= new Dog("Bruno",3);
//        dog.bark();
//
//        System.out.println(dog.getName());
//
//        dog.setAge(-5);
//        System.out.println(dog.getAge());

        try {
            BankAccount b = new BankAccount(200); // drops here
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // caught here
        }
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name=name;
        this.age=age;

    }

    public void bark(){
        System.out.println(this.name+" says: Woof!");
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if(age>0) {
            this.age = age;
        }
    }
}