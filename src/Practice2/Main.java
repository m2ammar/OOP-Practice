package Practice2;

public class Main {
    public static void main(String[] args) {

        Circle[] circle={new Circle(5),
         new Circle(6),
         new Circle(44.5)};

        for(int i=0; i<circle.length; i++){
            System.out.println("The radius of "+(i+1)+" is: "+circle[i].calcArea());
        }

        Employee[] employee={new Employee("Ali", 50000),
                new Employee("Ahmed", 80000),
                new Employee("Bahar", 60000),
                new Employee("Khadija", 95000)};
        Employee max= employee[0];

        for(int i=0; i< employee.length; i++){
            if(employee[i].getSalary()>max.getSalary()){
                max=employee[i];
            }
        }
        System.out.println("Highest salary: " + max.getName() + " : " + max.getSalary());

    }
}
class Circle{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

     double calcArea(){
        double temp=Math.PI*radius*radius;
       return temp;
    }
}
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }
}