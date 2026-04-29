package OOPTh;

public class Temperature {
    private double centi, fahrenheit, kelvin;
    private double dummy;

    public void setCenti(double centi){
        this.centi=centi;
    }

    public void setFahrenheit(double fahrenheit){
        this.fahrenheit=fahrenheit;
    }

    public void setKelvin(double kelvin){
        this.kelvin=kelvin;
    }

    public double getCenti(){
        return this.centi;
    }

    public double getFahrenheit(){
        return this.fahrenheit;
    }

    public double getKelvin(){
        return this.kelvin;
    }
}

//class TemperatureConversation {
//    public static void main(String[] args) {
//        TemperatureScale scale;
//    }
//
//    static Temperature tempConverter(){
//
//    }
//}