package Lab10Quiz;

public class FullTimeEmployee implements Employee, BenefitEligible, BonusEligible, WorkFromHome {
    //Fixed salary, eligible for bonus and benefits
    private String name;
    private int age;
    private String department;
    private  double salary;

    public FullTimeEmployee(String name, int age, String department){

        this.name=name;
        this.age=age;
        this.department=department;
        this.salary=350000;
    }

    public FullTimeEmployee(String name, double salary){

        this.name=name;
        this.salary=salary;
    }


    @Override
    public void info(){
        System.out.println("Full Time Employee");
        System.out.print(this.name + " : " + this.salary);
        if (this.department != null) {
            System.out.print(" Age: " + this.age + " Department: " + this.department);
        }
        System.out.println();
    }

    @Override
    public void eligibleBenefit(){

        System.out.println("Full time employee eligible for benefit");
    }

    @Override
    public void eligibleBonus(){

        System.out.println("Full time employee eligible");
    }
    @Override
    public void workFromHome(){

        System.out.println("Full time employee work form home");
    }

    public int getAge(){
        return  this.age;
    }

    public String getName(){
        return  this.name;
    }
    public String getDepartment(){
        return  this.department;
    }
    public double getSalary(){
        return  this.salary;
    }
}
