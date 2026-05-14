package BankAccountSystem;

public class Main {
    public static void main(String[] args) {

        BankAccount b  = new BankAccount("XXXXXXXXXXX0987", "Muhammad Ammar", 78000);
        b.deposit(5976);
        b.deposit(-988);
        b.withdraw(1000000);
        b.withdraw(300);
        b.displayBalance();

        SavingsAccount s = new SavingsAccount("XXXXXXXXXXXXXXX8789","Ahmed Ali", 6666);
        s.addInterest();
    }
}
