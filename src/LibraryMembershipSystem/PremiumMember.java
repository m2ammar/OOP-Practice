package LibraryMembershipSystem;

public class PremiumMember extends Member1 {

    public PremiumMember(String memberId, String name){
        super(memberId, name);
    }

    @Override
    public double calculateFee(){
        if(this.name.charAt(0) =='a' || this.name.charAt(0) =='A'){
            double rate= 1000-(1000*0.20);
            return rate;
        }else{
            return 1000;
        }
    }
}
