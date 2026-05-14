package BankAccountSystem;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountNumber, String accountHolderName, double balance){

        super(accountNumber, accountHolderName, balance);
    }

    double rate;
   public void addInterest(){

        if(getBalance() <= 100000){
            rate  =10;
        }else if(getBalance() <= 500000) {
             rate =20;
        }else{
            rate =40;
        }

       double interest = getBalance() * rate / 100;

       deposit(interest);

       System.out.println("Interest added: " + interest);
       System.out.println("New Balance: " + getBalance());
   }
}
