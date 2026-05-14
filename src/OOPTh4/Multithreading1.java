package OOPTh4;

public class Multithreading1{
    public static void main(String[] args) {


//        MyTask myTask1 = new MyTask("A");
//        MyTask myTask2 = new MyTask("B");
//
//        Thread t1 = new Thread(myTask1);
//        Thread t2 = new Thread(myTask2);
//        Thread t3 = new Thread(new MyTask("C"));
//
//        t1.start();
//        t2.start();



        //Counter
        Counter counter = new Counter();
        CounterTask c1 = new CounterTask(counter);

        Thread T1 = new Thread(c1);
        Thread T2 = new Thread(new CounterTask(counter));

        T1.start();
        T2.start();
        System.out.println("Expected: 20000");
        System.out.println("Actual: "+counter.count);
    }
}
