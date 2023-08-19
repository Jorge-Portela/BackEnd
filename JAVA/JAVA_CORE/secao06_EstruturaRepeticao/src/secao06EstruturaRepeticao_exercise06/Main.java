package secao06EstruturaRepeticao_exercise06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int valueOfN,countGroup=1;
		double firstInput,secondInput,thirdInput;
		
		System.out.print("Enter the value group quantity: ");
		valueOfN = reader.nextInt();
		
		for(int i=0;i<valueOfN;i++) {
			System.out.println("\nEnter the three values below to group "+ countGroup+":");
			firstInput = reader.nextDouble()*2;
			secondInput = reader.nextDouble()*3;
			thirdInput = reader.nextDouble()*5;
			double wightedAverage = (firstInput + secondInput + thirdInput) / 10; 
			countGroup++;
			System.out.println("The Weighted Average: " + wightedAverage);
		}
		
		System.out.println("\nEND THE PROCESS.");
		
		
		
		
	}

}
