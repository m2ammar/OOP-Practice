package MiniLibraryMangementSystem;

import java.util.ArrayList;

public class Member {

    private int memberId;
    private String name;
    protected ArrayList<Book> issuedBooks;

    public Member(int memberId, String name){
        this.memberId=memberId;
        this.name=name;
        this.issuedBooks=new ArrayList<>();
    }

    public int getMemberId(){
        return this.memberId;
    }

    public String getName(){
        return this.name;
    }

    public String borrowBook(Book b){

        if(issuedBooks.size() >= 3){
            return "Cannot borrow more than 3 books";
        }

        String result = b.issueBook();

        if(result.equals("Book has been issued")){
            issuedBooks.add(b);
            return "Book borrowed successfully";
        } else {
            return "Book is not available";
        }
    }

    public String returnBook(Book b){
        if(issuedBooks.contains(b)){
            issuedBooks.remove(b);
            b.issueBook();
            return "Book has returned";
        }else{
            return "This book was not borrowed";
        }
    }



}
