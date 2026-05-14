package OOPTh4;

public class Counter {
    int count=0;

    synchronized void increment(){
        count++;
//        System.out.println(getCount());
    }

    public int getCount(){
        return this.count;
    }
}
class CounterTask implements Runnable{
    Counter counter;
    CounterTask(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run(){
        for(int i=0; i<10000; i++){
            counter.increment();
        }
    }
}