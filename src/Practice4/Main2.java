package Practice4;

import javax.print.Doc;

public class Main2 {

}
interface Diagnosable{


    void diagnosePatient(String patientName);
    void writeReport();
}
abstract class HospitalStaff{

    protected int id;
    protected String name;
    protected String department;

    public HospitalStaff(String name, String  department){

        this.name=name;
        this.department=department;
    }

    public HospitalStaff( String name){

        this.name=name;
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

    public void setName(String name){
        this.name=name;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    abstract void displayInfo();
}
class Doctor extends HospitalStaff implements Diagnosable{

    private static int noOfDoctors;
    private String specialization;

    public Doctor( String name, String department, String specialization){
        super(name, department);
        this.specialization=specialization;
        this.id=++noOfDoctors;

    }

    public Doctor( String name){
        super(name);
        this.id=++noOfDoctors;

    }

    public String getSpecialization(){

        return this.specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }

    @Override
    public void  diagnosePatient(String patientName) {

        System.out.println("Patient name: "+patientName+" Doctor's name: "+this.name);
    }
    @Override
    public void writeReport(){

        System.out.println("Doctor's name: "+this.name+" Specialization: "+this.specialization);
    }

    @Override
    public void displayInfo(){

        System.out.println("Doctor's name: "+this.name+" Specialization: "+this.specialization+" Department: "+
                this.department);
    }
}

class Nurse extends HospitalStaff implements Diagnosable{

    private static int noOfNurses;
    private String ward;

    public Nurse(String name, String department, String ward){
        super(name, department);
        this.ward=ward;
        this.id=++noOfNurses;

    }

    public Nurse(String name) {
        super(name);
        this.id = ++noOfNurses;
    }

    public String getWard(){
        return this.ward;
    }

    public void setWard(String ward){
        this.ward=ward;
    }

    @Override
    public void  diagnosePatient(String patientName) {

        System.out.println("Patient name: "+patientName+" Nurse name: "+this.name);
    }
    @Override
    public void writeReport(){

        System.out.println("Nurse name: "+this.name+" Ward: "+this.ward);
    }

    @Override
    public void displayInfo(){

        System.out.println("Nurse name: "+this.name+" Ward: "+this.ward+" Department: "+
                this.department);
    }
}

