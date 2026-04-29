interface PaymentGateway{

    public boolean pay();

}

class PayByStripe implements PaymentGateway{

    @Override
    public boolean pay() {
        return false;
    }

//    @Override
//    public boolean pay(double amount){
//
//        // pay by stripe
//        return false;
//    }
}

class PayByCard implements PaymentGateway{

    @Override
    public boolean pay() {
        return false;
    }

//    @Override
//    public boolean pay(double amount){
//
//        return false;
//    }
}

class PayByBankTransfer implements PaymentGateway{

    @Override
    public boolean pay() {
        return false;
    }


//    @Override
//    public boolean pay(double amount){
//
//        return false;
//    }
}


public class Interfaces2 {
    public static void main(String[] args) {

    }
}
