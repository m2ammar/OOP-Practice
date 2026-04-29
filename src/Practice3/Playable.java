package Practice3;

public interface Playable {
    void play();
    void stop();
}
class Song implements Playable{

    private String title;
    private String artist;

    public Song(String title, String artist){
        this.title=title;
        this.artist=artist;
    }

    @Override
    public void play(){
        System.out.println("Playing: "+this.title+" by "+this.artist);
    }

    @Override
    public void stop(){
        System.out.println("Stopped: "+this.title);
    }

    public String getTitle(){
        return this.title;
    }
}
