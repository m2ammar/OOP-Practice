package OOPTh2;

public class Ladder {

    private int head;
    private int tail;
    public Ladder(int head,int tail){
        if(!(head<0||tail<0||head<=tail||head>99)){
            this.head=head;
            this.tail=tail;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }
}
