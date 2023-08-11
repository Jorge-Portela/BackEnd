package secao05EstruturasCondicional_exercise01;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número positivo ou
		 * negativo.
		 */
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int numberEntered;
		
		System.out.print("Enter the number: ");
		numberEntered = reader.nextInt();
		
		if(numberEntered >=0) {
			System.out.println("It is a POSITIVE number.");
		} else {
			System.out.println("It is a NEGATIVE number.");
		}
		
		reader.close();
		
		
	}
}
