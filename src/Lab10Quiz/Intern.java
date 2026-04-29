package Lab10Quiz;

public class Intern implements Employee {
    //limited working hours, no benefits and stipend basis
    private String name;
    private int age;
    private String department;
    private  double salary;

    public Intern(String name, int age, String department){

        this.name=name;
        this.age=age;
        this.department=department;
        this.salary=25000;
    }

    public Intern(String name){

        this.name=name;
        this.salary=25000;
    }

    @Override
    public void info(){
        System.out.println("Intern");
        System.out.println(this.name + " : " + this.salary);
        if (this.department != null) {
            System.out.print(" Age: " + this.age + " Department: " + this.department+" \n");
        }
        System.out.println();
    }

}
