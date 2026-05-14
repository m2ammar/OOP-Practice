package SmartFanSystem;

public class Fan {

    private int speed;
    private boolean isOn;

    public Fan(){
        this.speed=0;
        this.isOn=false;
    }

    public void turnOn(){

        this.speed=1;
        this.isOn=true;
        System.out.println("Speed: "+this.speed+"  Status: Onn");
    }

    public void turnOff(){
        this.speed=0;
        this.isOn=false;
        System.out.println("Speed: "+this.speed+"  Status: Off");
    }

    public void increaseSpeed(){

        if(getIsOn() && getSpeed()<3){

            this.speed++;
            System.out.println("Current Speed: "+this.speed);

        }else if(getIsOn() && getSpeed()==3) {

            System.out.println("Current Speed: " + this.speed);
        } else{
            System.out.println("Fan is not On!");
            return;
        }
    }

    public void decreaseSpeed(){

        if(getSpeed() > 1){
            this.speed--;
            System.out.println("Current Speed: "+this.speed);
        }else if(getSpeed() == 1){
            this.speed = 0;
            this.isOn=false;
            System.out.println("Off");
        }
        else{
            System.out.println("Speed is already low");
        }

    }

    public int getSpeed(){
        return this.speed;
    }

    public boolean getIsOn(){
        return this.isOn;
    }
}
