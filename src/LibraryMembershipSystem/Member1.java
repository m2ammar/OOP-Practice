package LibraryMembershipSystem;

public abstract class Member1 {

    protected String memberId;
    protected String name;

    public Member1(String memberId,String name){

        this.memberId=memberId;
        this.name=name;
    }

    abstract double calculateFee();
}

