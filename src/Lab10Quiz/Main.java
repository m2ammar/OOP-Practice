package Lab10Quiz;

public class Main {
    public static void main(String[] args) {

        Employee e;
         e= new FullTimeEmployee("Ammar",4,"Data Science");
         e.info();

         e= new PartTimeEmployee("Ammar",4,"Data Science",7);
         e.info();


         e= new Contractor("ali", 3);
         e.info();

         e= new Intern("Ammar");
         e.info();
    }
}
