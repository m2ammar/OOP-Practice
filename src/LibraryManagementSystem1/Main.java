package LibraryManagementSystem1;

public class Main {
    public static void main(String[] args) {

        StudentMember s = new StudentMember("Ali", 18);
        System.out.println(s.calculateFine());

        try {
            StudentMember s1 = new StudentMember("Ammar", -100);
            System.out.println(s1.calculateFine());
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
