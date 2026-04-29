package Lab10;

public enum Day {

    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5);

    private int value;

    private Day(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }
}
