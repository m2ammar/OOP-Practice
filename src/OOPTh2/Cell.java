package OOPTh2;

public class Cell {

    private int index;
    private boolean hasLadder;
    private boolean hasSnake;
    public Cell(int index){
        this.index=index;
        hasLadder=false;
        hasSnake=false;
    }

    public int getIndex() {
        return index;
    }

    public void setHasLadder() {
        this.hasLadder = true;
    }

    public void setHasSnake() {
        this.hasSnake = true;
    }

    public boolean isHasLadder() {
        return hasLadder;
    }

    public boolean isHasSnake() {
        return hasSnake;
    }
}
