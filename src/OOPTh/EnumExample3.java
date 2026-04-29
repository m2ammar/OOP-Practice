package OOPTh;

public class EnumExample3 {
    public static void main(String[] args) {
        EnumIndexing e;
        e=EnumIndexing.Inactive;
        System.out.printf("%d", e.getIndex());
        System.out.println();

        Critically c = Critically.High;
        System.out.println(c.getDescription());
    }
}
