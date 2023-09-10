package conceptStaticModifier.dollarPrice.program;

import java.util.Locale;
import java.util.Scanner;

import conceptStaticModifier.dollarPrice.entities.CurrencyConverter;

public class Program {
	/*
	 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
	 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
	 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
	 * sobre o valor em dólar.
	 * 
	 * Write a program to read the dollar rate, and then a value in dollars to be
	 * purchased by a person in reais. Inform how many reais a person will pay for
	 * dollars, considering that a person will have to pay 6% IOF on the dollar
	 * value.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);


		// variable the receive the dollar rate input (%.2f)
		System.out.println("What is the dollar price ?: ");
		double rateDollar = reader.nextDouble();

		//variable that receives total dollar purchased
		System.out.println("How many dollars will be bought ?: ");
		double dollarsBought = reader.nextDouble();               

		double convertor = CurrencyConverter.currencConverter(rateDollar, dollarsBought);

		System.out.printf("\nAmount to be paid in reais: %.2f", convertor);

		reader.close();

	}
}
