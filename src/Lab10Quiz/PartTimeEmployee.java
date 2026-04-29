package Lab10Quiz;


public class PartTimeEmployee implements Employee{
    //no benefits, paid per hour

    private String name;
    private int age;
    private String department;
    private  double hour;
    private double salary;

    public PartTimeEmployee(String name, int age, String department, double hour){

        this.name=name;
        this.age=age;
        this.department=department;
        this.hour=hour;
    }

    public PartTimeEmployee(String name, double hour){
        this.name=name;
        this.hour=hour;
    }

    public void calcSalary(){
        this.salary=this.hour*1000;
    }

    @Override
    public void info(){
        System.out.println("Part Time Employee");
        System.out.println(this.name + " : " + this.salary+" Hours Worked: "+this.hour);
        if (this.department != null) {
            System.out.print(" Age: " + this.age + " Department: " + this.department+" \n");
        }
        System.out.println();
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

    public double getHour(){
        return  this.hour;
    }
}
