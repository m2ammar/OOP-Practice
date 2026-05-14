package OOPTh2;

public class Snake {

    private int head;
    private int tail;
    public Snake(int head,int tail){
        if(!(head<10||tail<0||head<=tail||head>99)){
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
