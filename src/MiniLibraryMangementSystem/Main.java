package MiniLibraryMangementSystem;

public class Main {
    public static void main(String[] args) {

        Library l = new Library();


        Book b1 = new Book(44, "Math", "Ammar");
        Book b2 = new Book(56, "PF", "Hadi");
        Book b3 = new Book(34, "Bio Chemistry", "Raza");
        Book b4 = new Book(2, "Literature", "Shafi");
        Book b5 = new Book(4, "Nuclear physics", "Wasay");
        Book b6 = new Book(32, "C++", "Hamdan");
        Book b7 = new Book(77, "Quantum", "Muhammad");
        Book b8 = new Book(5, "Chemistry", "Junaid");
        Book b9 = new Book(86, "Al Chemist", "Jamshed");
        Book b10 = new Book(1, "Lean Startup", "Yasir");
        System.out.println(b1.issueBook());
        System.out.println(b3.getBookId());
        System.out.println(b2.getAuthor());
        System.out.println(b6.getIsIssued());
        System.out.println(b2.getTitle());



        Member m1 = new Member(1, "Ali");
        Member m2 = new Member(2, "Anwar");
        Member m3 = new Member(3, "Ahmed");
        Member m4 = new Member(4, "Wajahat");
        Member m5 = new Member(5, "Ghazi");
        Member m6 = new Member(6, "Sohail");
        Member m7 = new Member(7, "Saad");
        Member m8 = new Member(8, "Saeed");
        Member m9 = new Member(9, "Zakir");
        System.out.println(m1.getMemberId());
        System.out.println(m2.getName());
        System.out.println(m3.borrowBook(b1));
        System.out.println(m6.returnBook(b3));


    }
}
