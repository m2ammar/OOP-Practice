package LibraryManagementSystem1;

public abstract class Member {

    private String name;
    private int daysOverdue;

    public Member(String name , int daysOverdue){
        System.out.println("I'm here.");

        this.name=name;
        if(daysOverdue>0){
            this.daysOverdue=daysOverdue;
        }else{
            throw new IllegalArgumentException("Days can't be negative!");
        }
    }

    public double calculateFine(){
        return 0;
    }

    public String getFineSummary(){
        return name+" "+calculateFine();
    }

    public String getName(){
        return this.name;
    }

    public int getDaysOverdue(){
        return this.daysOverdue;
    }

}


class StudentMember extends Member{

    public StudentMember(String name, int daysOverdue){
        super(name,daysOverdue);
    }

    @Override
    public double calculateFine(){
        double result=0;
        int days = getDaysOverdue();

        if(getDaysOverdue()<=5){
            result= getDaysOverdue()*10;
        }else if(getDaysOverdue()<=15){
            result = (5 * 10) + ((days - 5) * 20);
        } else {
            result = (5 * 10) + (10 * 20) + ((days - 15) * 50);
        }
        return result;
    }

}


class PremiumMember extends Member{

    public PremiumMember(String name, int daysOverdue){
        super(name,daysOverdue);
    }

    @Override
    public double calculateFine(){
        double result=getDaysOverdue()*5;

       if(result>200){
           return 200;
       }
       return result;
    }
}