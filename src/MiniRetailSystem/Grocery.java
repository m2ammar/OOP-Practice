package MiniRetailSystem;

public class Grocery extends Product implements Sellable{

    private String expiryDate;

    public  Grocery(String name, double price, String expiryDate){

        super(name, price);
        this.expiryDate=expiryDate;
    }

    @Override
    public void  getDescription(){

        System.out.println("Name: "+this.getName()+"\nPrice: "+this.getPrice()+"\nWarranty: "+this.expiryDate);
    }

    @Override
    public void sell(int quantity){

    }
}
