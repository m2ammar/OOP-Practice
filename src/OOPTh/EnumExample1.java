package OOPTh;

public class EnumExample1 {
    public static void main(String[] args) {
        DaysOfWeek day;
        day=DaysOfWeek.Sat;
        System.out.println(day.toString());

        day=DaysOfWeek.Sun;
        if(day.compareTo(DaysOfWeek.Sun)==0){
            System.out.println("Chutttiii");
        }
    }
}
