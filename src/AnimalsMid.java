public class AnimalsMid {
    protected int noOfLegs;
    protected boolean hasWings;
    protected double averageWeight;

    public AnimalsMid(int noOfLegs, boolean hasWings, double averageWeight){
        this.noOfLegs=noOfLegs;
        this.hasWings=hasWings;
        this.averageWeight=averageWeight;
    }
}
interface Borrowable{

    void borrowItem();
    void returnItem();
}
abstract class LibraryItem implements Borrowable{

    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(String title, String author){
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    public abstract void borrowItem();
    public abstract void returnItem();
    abstract void displayInfo();
}
class Book extends LibraryItem{

    public Book(String title, String author){
        super( title, author);
    }

    @Override
    public void borrowItem(){
        this.isAvailable=false;
        System.out.println("Title has been borrowed.");
    }

    @Override
    public void returnItem(){

        this.isAvailable=true;
        System.out.println("Title has been returned.");
    }

    @Override
    void displayInfo(){

        System.out.println("Title: "+this.title+"\nAuthor: "+this.author);
        if(isAvailable == true) {
            System.out.println("Status: Available");
        }else{
            System.out.println("Status: Not Available");
        }
    }
}