package OOPTh;

public class EnumExample2 {
    public static void main(String[] args) {
        DaysOfWeek d= DaysOfWeek.Wed;
        System.out.printf("%d", d.ordinal());

        //.ordinal() use to find the index

         d= DaysOfWeek.Sun;
        if(d.ordinal()==6){
            System.out.println("\nChutttiiiiiii!!!! hohohohoho oooooo hip hip hurrayyyyyyyyyyyyyyyy!!!!!!! ");
        }
    }
}
