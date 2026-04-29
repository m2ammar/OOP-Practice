package OOPTh;

public enum EnumIndexing {

    Active(1),Inactive(2);
    private int index;

    EnumIndexing(int index){
        this.index=index;
    }
    public int getIndex(){
        return this.index;
    }
}
