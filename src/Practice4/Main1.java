package Practice4;

interface Borrowable{

    void borrowItem();
    void returnItem();
}

class LibraryItem implements Borrowable {
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(String title, String author){
        this.title=title;
        this.author=author;
        this.isAvailable=true;

    }

    @Override
    public void borrowItem(){

    }

    @Override
    public void returnItem(){

    }

    public void displayInfo(){

    }
}
class Book extends LibraryItem{

    public Book(String title, String author){
        super(title, author);
    }

    @Override
    public void borrowItem(){

        if(isAvailable) {
            isAvailable=false;
            System.out.println(this.title + " has been borrowed");
        }
    }
    @Override
    public void returnItem(){
        if(!isAvailable) {
            isAvailable=true;
            System.out.println(this.title + " has been returned ");
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Book: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Available: "+this.isAvailable);
    }
}

public class Main1{
    public static void main(String[] args) {
        
    }
}