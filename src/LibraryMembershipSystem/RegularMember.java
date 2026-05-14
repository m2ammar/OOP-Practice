package LibraryMembershipSystem;

public class RegularMember extends  Member1{


    public RegularMember(String memberId, String name){
        super(memberId, name);
    }

    @Override
    public double calculateFee(){
        return 500;
    }
}
