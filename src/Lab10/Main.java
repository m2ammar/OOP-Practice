package Lab10;

public class Main {
    public static void main(String[] args) {


        Day day1 = Day.MONDAY;
        Day day2 = Day.TUESDAY;
        Day day3 = Day.WEDNESDAY;
        Day day4 = Day.THURSDAY;
        Day day5 = Day.FRIDAY;

        System.out.println(day1);

        for( Day d: Day.values() ){

            System.out.println(d);
        }

        System.out.println(day1.getValue());

        int[] arr = {2,4,5,6,74,33,3};

        for(int a  : arr){
            System.out.println(a);
        }

        //2d array
        int[][] arr2 = { {2, 4, 5}, {6, 74, 33},
        {3, 8, 1}};

        for(int[] a  : arr2) {
            for (int b : a) {
                System.out.println(b);
            }
        }
    }
}
