package MiniLibraryMangementSystem;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int bookId, String title, String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isIssued=false;
    }

    public String issueBook(){

        if(isIssued){
            return "Book already issued";
        }else{
            isIssued=true;
            return "Book has been issued";
        }
    }
    public String returnBook(){
        if(isIssued){
            this.isIssued=false;
            return "Book has been returned";
        }else{
            return "Book was not issued!";
        }
    }

    public int getBookId(){
        return this.bookId;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public boolean getIsIssued(){
        return this.isIssued;
    }
}
