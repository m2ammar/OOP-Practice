package OOPTh3;

public class AutoBox {
    public static void main(String[] args) {

        Integer i;// is an object of class Integer
        Double d= 5.3;
        Short s;
        Boolean b;

        // Generic APIs doesn't work with data types but with these classes

        i=3;
        Integer j = 5;
        //Integer k= new Integer(5);
        System.out.println(j.compareTo(3));
        System.out.println(j.compareTo(5)); // equal then 0 output, bigger -1, and smaller then 1
        System.out.println(d.intValue());

        int y=3;
        Integer x = (Integer) y;// boxing. same as type casting but differ name
        System.out.println(x);

        int ss=j.intValue(); // unboxing

        int a= j; // auto-unboxing
        System.out.println(a);

        Integer u= a; // auto- boxing
        System.out.println(u);

        int avg = (a+j+ss+u)/3;
        System.out.println(avg);
    }
}
