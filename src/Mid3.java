public class Mid3 {
    public static void main(String[] args) {

    }
}
interface Treatable{
    void diagnose();
    void prescribe();

}

abstract class Staff {

    static int noOfDoctors = 0;
    static int noOfNurses = 0;
    protected int id;
    private String name;
    private String department;

    public Staff(String name){
        this.name=name;
    }
    public Staff( String name, String department){

        this.name=name;
        this.department=department;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

    public void  setName(String name){
        this.name=name;
    }

    public void setDepartment(String department){
        this.department=department;
    }

    abstract void displayInfo();

}

class Doctor extends Staff implements Treatable{

    private  String specialization;

    public Doctor(String name, String department,  String specialization){
        super(name, department);
        this.id=++Staff.noOfDoctors;
        this.specialization=specialization;
    }

    public Doctor(String name){
        super(name);
        this.id = ++Staff.noOfDoctors;
    }

    public String getSpecialization(){
        return this.specialization;
    }

    @Override
    public void  diagnose(){

        System.out.println("Doctor "+this.getName()+" is diagnosing the patient.");
    }

    @Override
    public void prescribe(){

        System.out.println("Doctor "+this.getName()+" has prescribed the medicine.");
    }

    @Override
    void displayInfo(){

        System.out.println("Doctor Id: "+noOfDoctors);
        System.out.println("Doctor Name: "+getName()+"\n" +
                "Department: "+getDepartment()+"\nSpecialization: "+getSpecialization());
    }
}

class Nurse extends Staff {

    private String shift;
    public Nurse(String name){
        super(name);
    }

    public Nurse(String name, String department,  String shift){
        super(name, department);
        this.id=++Staff.noOfNurses;
        this.shift=shift;
    }

    public String getShift(){
        return this.shift;
    }

    public void setShift(String shift){
        this.shift=shift;
    }

    @Override
    void displayInfo(){

        System.out.println("Nurse Id: "+noOfNurses);
        System.out.println("Nurse Name: "+getName()+"\n" +
                "Department: "+getDepartment()+"\nShift: "+getShift());
    }
}