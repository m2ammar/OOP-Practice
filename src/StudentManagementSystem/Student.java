package StudentManagementSystem;

public class Student {

    private String rollNumber;
    private String name;
    private double marks;

    public Student(String rollNumber, String name, double marks){

        this.rollNumber=rollNumber;
        this.name=name;
        if(marks>=0) {
            this.marks = marks;
        }else {
            System.out.println("Marks can't be negative");
        }
    }

    public void displayDetails(){
        System.out.println("Name: "+this.name+" Roll number: "
                +this.rollNumber+" Marks: "+this.marks);
    }
    public boolean isPassed(){
        if(this.marks>=50){
            return true;
        } return false;
    }

    public String getRollNumber(){
        return this.rollNumber;
    }

    public String getName(){
        return this.name;
    }

    public double getMarks(){
        return this.marks;
    }
}
