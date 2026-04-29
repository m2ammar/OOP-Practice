package MiniLibraryMangementSystem;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void addMember(Member m) {
        members.add(m);
    }

    private Book findBook(int bookId) {

        for(Book b : books) {
            if (b.getBookId() == bookId) {
                return b;
            }
        }return null;
    }

    private Member findMember(int memberId){
        for(Member m : members){
            if(m.getMemberId() == memberId){
                return m;
            }
        }return null;
    }


    public String issueBook(int memberId, int bookId){

        Member m = findMember(memberId);
        Book b = findBook(bookId);

        if(m == null){
            return "Member not found";
        }

        if(b == null){
            return "Book not found";
        }
        return m.borrowBook(b);
    }

    public  String returnBook(int memberId, int bookId){

        Member m = findMember(memberId);
        Book b = findBook(bookId);

        if (m == null) {
            return "Member not found";
        }

        if (b == null) {
            return "Book not found";
        }

        return m.returnBook(b);
    }

}
