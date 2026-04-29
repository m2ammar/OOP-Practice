package Lab10;

public class Main1 {
    public static void main(String[] args) {


//        for(Country c: Country.values()) {
//            System.out.print(c+": ");
//            System.out.println(c.getVariable());
//        }

        for(ErrorExample e: ErrorExample.values()){
            if(e.getVal().equals("Type2")){
                System.out.println(e.getDescription());
            }
        }
    }
}
