package secao05EstruturasCondicional_exercise02;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		 */
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int enteredNumber;
		
		System.out.print("Enter the number: ");
		enteredNumber = reader.nextInt();
		
		if (Math.abs(enteredNumber) % 2 ==0) {
			System.out.println("It is a EVEN Number.");
		} else {
			System.out.println("It is a ODD Number.");
		}
		
		reader.close();
		
		
	}

}
