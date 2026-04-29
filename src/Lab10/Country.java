package Lab10;

public enum Country {

   CHINA("+86"),INDIA("+91") ,PAKISTAN("+92"),INDONESIA("+62"), CANADA("+1"),
    FRANCE("+33"), GERMANY("+49"), UK("+44"),AUSTRALIA("+61"), JAPAN("+81");

    private String variable;

   private Country(String variable){
       this.variable=variable;
   }

   public String getVariable(){
       return  this.variable;
   }
}
