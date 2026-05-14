package OOPTh2;

import java.util.Random;

public class Board {

    private Cell[] cell=new Cell[100];
    private Snake[]s=new Snake[5];
    private Ladder[]l=new Ladder[5];
    Player []player=new Player[2];
    Dice dice=new Dice();
    public Board(){
        for(int i=0;i<101;i++){
            cell[i]=new Cell(i);
        }

    }
    public void snakeGenerator(){
        Random rand=new Random();
        for(int i=0;i<5;i++){
            int head= rand.nextInt(100);
            int tail= rand.nextInt(head);
            s[i]=new Snake(head,tail);
        }
    }
    public void ladderGenerator(){
        Random rand=new Random();
        for(int i=0;i<5;i++){
            int head= rand.nextInt(100);
            int tail= rand.nextInt(head);
            l[i]=new Ladder(head,tail);
        }
    }
}
