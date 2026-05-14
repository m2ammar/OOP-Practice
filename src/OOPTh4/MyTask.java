package OOPTh4;

public class MyTask implements Runnable {
                                
    //an interface use to control threads

    private String name;

    public  MyTask(String name){
        this.name=name;
    }

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread: "+this.name+ " -count: "+i);
            try {
                Thread.sleep(50); //
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
