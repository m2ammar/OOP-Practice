package OOPTh;

import Lab09.Cat;

public enum Critically {
    Low("Can be delayed up to 2 weeks"), Medium("Can be delayed up to 1 week "), High("Must be done now");

    private String description;

    Critically(String description){
        this.description=description;
    }

    public String getDescription() {
        return this.description;
    }
    public void setLow(String description){
        this.description=description;
    }
}
