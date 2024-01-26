package exerciseFixation.application;

import exerciseFixation.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;
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

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = reader.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarBought = reader.nextDouble();

        double convertor = CurrencyConverter.convetorDollar(dollarPrice,dollarBought);

        System.out.println("Amount to be paid in BRL(REAL) = $ "
                + String.format("%.4f  ", convertor));

    }

}
