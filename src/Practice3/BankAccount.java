package Practice3;

public class BankAccount {
    private double balance;

    public BankAccount(double deposit) {
        if (deposit < 500) {
            throw new RuntimeException("Deposit not enough.");
        }
        this.balance = deposit;
    }

    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("New balance: "+this.balance);
    }

    public  void withdraw(double amount){
        if(amount<this.balance && this.balance>500){
            this.balance-=amount;
            System.out.println("Amount after withdrawal: "+this.balance);
        }else {
            this.balance-=10;
            System.out.println("Penalty of 10 rupees! "+this.balance);
        }
    }

    public double getBalance(){
        return this.balance;
    }
}
