package conceptStaticModifier.dollarPrice.entities;

public class CurrencyConverter {
	
	// IOF percetage = 6is a static variable
	public static double IOF = 0.06;

	public static double currencConverter(double rateDollar, double dollarsBought) {
		double convertorIOF = (rateDollar * dollarsBought) * IOF;
		return (rateDollar * dollarsBought) + convertorIOF;
		// rateDollar * dollarsBought * (1.0 + IOF);
	}

}
