package Lab09;

public interface Employee {

    public void calculateSalary();
}
class FullTimeEmployee implements  Employee{

    @Override
    public void calculateSalary(){
        System.out.println("Full time employee");
    }
 }

class PartTimeEmployee implements Employee{

    @Override
    public void calculateSalary(){
        System.out.println("Part time employee");
    }
}


