public enum TrafficLight {

    RED("Stop",30),Yellow("Get ready to go",5),Green("Go",25);

    private String action;
    private int duration;

     TrafficLight(String action, int duration){

        this.action=action;
        this.duration=duration;
    }

    public String getAction(){
         return this.action;
    }

    public int getDuration() {
        return duration;
    }
}
