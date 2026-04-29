public class Practice1 {
    public static void main(String[] args) {

        Employee employee = new Employee(666.7, "Ammar");
        employee.calculateBonus();

        Manager manager= new Manager(7787,"Hammad");
        manager.calculateBonus();

        Developer developer= new Developer(884.66,"Shahid");
        developer.calculateBonus();

        Employee e;

        e = new Manager(999,"Shaft");
        e.calculateBonus();

        e= new Developer(95544,"hand");
        e.calculateBonus();

    }
}
class Employee{

    protected double salary;
    protected String name;

    public Employee(double salary, String name){
        this.salary=salary;
        this.name=name;
    }

    void calculateBonus() {
        System.out.println("Basic bonus\n");
    }
}

class Manager extends Employee{
    public Manager(double salary, String name){
        super(salary, name);
    }

    @Override
    void calculateBonus() {
        System.out.println("Manager bonus is 20%\n");
    }
}

class Developer extends Employee{
    public Developer(double salary, String name){
        super(salary, name);
    }

    @Override
    void calculateBonus() {
        System.out.println("Developer bonus is 10%\n");
    }
}
