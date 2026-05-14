package OOPTh2;

public enum Player {

    Red(0),
    Green(0),
    Yellow(0),
    Blue(0);
    private int position;
    Player(int position){
        this.position=position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
