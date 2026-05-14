package StudentManagementSystem;

public class ScholarStudent extends Student {

    public ScholarStudent(String rollNumber, String name, double marks){
        super(rollNumber, name, marks);
    }

    public void calculateScholarship() {
        double scholarship;

        if (isPassed()) {
            if (getMarks() >= 80 && getMarks() <= 100) {
                scholarship = 0.3;
            } else if (getMarks() >= 60) {
                scholarship = 0.2;
            } else if (getMarks() >= 50) {
                scholarship = 0.1;
            } else {
                System.out.println("No scholarship");
                return;
            }

            double scholarshipAmount = 100000 * scholarship;

            System.out.println("Scholarship: " + scholarshipAmount);

        } else {

            System.out.println("Not passed. Can't apply to scholarship!");
        }

    }
}
