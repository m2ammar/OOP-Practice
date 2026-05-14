package MiniRetailSystem;

public class Electronics extends Product implements Sellable{

    private int warrantyMonths;

    public Electronics(String name, double price, int warrantyMonths){

        super(name, price);
        this.warrantyMonths=warrantyMonths;
    }

    @Override
    public void  getDescription(){

        System.out.println("Name: "+this.getName()+"\nPrice: "+this.getPrice()+"\nWarranty: "+this.warrantyMonths);
    }

    @Override
    public void sell(int quantity){

    }
}
