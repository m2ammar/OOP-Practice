package QuizProb;

public class Main {
    public static void main(String[] args) {

        PremiumAccount acc = new PremiumAccount();
        acc.deposit(500);
        acc.withdraw(150);
        System.out.println(acc.getBalance());

    }
}
class BankAccount {
    protected double balance;

    public void deposit() {
        balance += 100;
    }

    public void withdraw() {
        if (balance >= 100)
            balance -= 100;
    }

    public double getBalance() {
        return balance;
    }
}

class PremiumAccount extends BankAccount{

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount <0){
            return;
        }else{
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}