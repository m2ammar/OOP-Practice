package Quiz3;

public class CounterMain {
    public static void main(String[] args) {
        NewCounter newCounter = new NewCounter();
        newCounter.increment(5);
        System.out.println(newCounter.getCount());
    }
}
