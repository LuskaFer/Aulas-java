package util;

public class CurrencyConverter {
	

	public static double buyDollar(double dollarPrice, double dollarAmount) {
		return dollarPrice * dollarAmount;
	}
	
	public static double taxDollar(double buyDollar) {
		return (buyDollar * 6 /100) + buyDollar;
	}
	
	
}
