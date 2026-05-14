package OOPTh4;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    Queue<Integer> buffer = new LinkedList<>();
    int capacity =5;

    void produce(int item){
        buffer.add(item);
        System.out.println("Produce: "+item+ " | Buffer size "+ buffer.size());
    }

    int consume(){
        int item = buffer.poll();
        System.out.println("Consumed: "+item+" | Buffer ");
        return item;
    }
}
class Producer implements Runnable{
    SharedBuffer buffer;

    Producer(SharedBuffer buffer){
        this.buffer=buffer;
    }

    @Override
    public void run(){
        for(int i=1; i<=20; i++){
            buffer.produce(i);
        }
    }
}

class Consumer implements Runnable{
    SharedBuffer buffer;

    Consumer(SharedBuffer buffer){
        this.buffer=buffer;
    }

    @Override
    public void run(){

     for(int i=1; i<=10; i++){
//            buffer.consume(i);
        }
    }
}

public class Multithreading2{
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();
    }
}