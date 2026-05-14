package MiniRetailSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products =  new ArrayList<>();

        for(int i=0; i<10; i++){
            if(i<5){
                products.add(new Grocery("Tomato",555.6, "2026-9-13"));
                products.add(new Grocery("Potato",65.26, "2026-5-3"));
                products.add(new Grocery("Onion",321.5, "2026-3-3"));
                products.add(new Grocery("Cucumber",122.6, "2026-3-4"));
                products.add(new Grocery("carrot",567.6, "2026-6-6"));
                products.get(i).getDescription();

            }else if(i<10){
                products.add(new Electronics("Juicer", 55550, 2));
                products.add(new Electronics("Grander", 10000, 1));
                products.add(new Electronics("Washing-Machine", 34550, 10));
                products.add(new Electronics("Hand Grander", 55540, 3));
                products.add(new Electronics("Iron", 2500, 1));
                products.get(i).getDescription();
            }
        }
    }
}
