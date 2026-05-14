package StudentManagementSystem;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("B032-00836-227", "Muhammad", 66);
        student.displayDetails();

        ScholarStudent scholarStudent = new ScholarStudent("B6353-9837-635xx","Shafi", 88);
        scholarStudent.calculateScholarship();

        ScholarStudent scholarStudent1= new ScholarStudent("xxxx-xxxx-x555","Hashmat", 44);
        scholarStudent1.calculateScholarship();


    }
}
