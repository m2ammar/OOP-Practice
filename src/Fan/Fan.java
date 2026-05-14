package Fan;

public class Fan {

    private int speed;
    private boolean isOn;
    public Fan(){
        this.speed=0;
        this.isOn=false;
    }

    public void turnOn(){
        this.speed=1;
    }

    public void turnOff(){
        this.speed=0;
    }

    public void speedUp(){

        if (!isOn && speed<3){
            this.speed++;
        }
    }

    public void slowDown() {

        if (this.isOn && speed>1) {

            this.speed--;
        }
    }

    public int getSpeed(){
        return this.speed;
    }

    public boolean isRunning(){

        return this.isOn;
    }
}
