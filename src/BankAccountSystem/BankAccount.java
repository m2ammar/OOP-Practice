package BankAccountSystem;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){

        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        if(balance>=0) {
            this.balance = balance;
        }else{
            System.out.println("Deposit can't be less than zero.");
        }
    }

    public void deposit(double amount){

        if(amount>0){
            this.balance += amount;
            System.out.println("Updated status: "+this.balance);
        }else{
            System.out.println("Deposit can't be zero.");
        }
    }

    public void withdraw(double amount){

        if(amount>0){
           if(balance> amount){
               this.balance -= amount;
               System.out.println("Balance after withdrawal: "+this.balance);
           }else {
               System.out.println("Insufficient balance");
           }
        }else{
            System.out.println("Amount can't be zero.");
        }
    }


    public void displayBalance(){

        System.out.println("Balance: "+this.balance);
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public double getBalance(){
        return this.balance;
    }
}
