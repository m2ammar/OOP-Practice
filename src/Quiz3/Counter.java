package Quiz3;

public class Counter {
    protected int count;

    public void increment(){
        count++;
    }

    public void decrement(){
        count--;
    }

    public void reset(){
        count=0;
    }

    public int getCount(){
        return this.count;
    }
}

class NewCounter extends Counter{


    public void increment(int value){
        count += value;
    }

    public void decrement(int value){

        if(count - value>=0 ){
            count -= value;
        }else{
           this.count= 0;
        }
    }

    public void reset(){
        count=0;
    }
}