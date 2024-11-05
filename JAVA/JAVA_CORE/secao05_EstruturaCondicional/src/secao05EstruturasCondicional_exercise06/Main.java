package secao05EstruturasCondicional_exercise06;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
		 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 */	
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int ordinaryValue;
		
		System.out.print("Enter a value: ");
		ordinaryValue = reader.nextInt();
		
		if (ordinaryValue >= 0 && ordinaryValue <=25) {
			System.out.println("The Value is in [0,25] range");
			
		} else if(ordinaryValue >= 25 && ordinaryValue <=50){
			System.out.println("The Value is in [25,50] range");
			
		}else if(ordinaryValue >= 50 && ordinaryValue <= 75){
			System.out.println("The Value is in [50,75] range");
			
		}else if(ordinaryValue >= 75 && ordinaryValue <= 100){
			System.out.println("The Value is in [75,100] range");	
		} else {
			System.out.println("The Value is OUT of range");
		}
	
		
	}

}
