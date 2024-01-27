package exerciseFixation.entities;

public class CurrencyConverter {

    public CurrencyConverter(){}
    public static final double IOF = 0.06;


    public static double convetorDollar(double dollarPrice, double dollarBought){
        
        return dollarPrice * dollarBought * (1 +  IOF);
    }






}
