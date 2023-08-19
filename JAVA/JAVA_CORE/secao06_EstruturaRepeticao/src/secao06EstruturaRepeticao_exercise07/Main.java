package secao06EstruturaRepeticao_exercise07;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		//Refactored Algorithm
		int valueOfN;

		System.out.print("Enter the number of pairs: ");
		valueOfN = reader.nextInt();

		for (int i = 0; i < valueOfN; i++) {
			System.out.println("Enter the first and second values of Pair "+(i+1)+":");
			double firstInput = reader.nextDouble();
			double secondInput = reader.nextDouble();

			if (secondInput == 0) {
				System.out.println("Division by zero is not possible.");
			} else {
				double divisionOfPairsInput = firstInput / secondInput;
				System.out.println("The Division of the first input by second input number: " + divisionOfPairsInput);
			}
		}
		
		System.out.println("Process completed.");

		
		//Legacy algorithm
		
//		double firstInput, secondInput;
//		int valueOfN, countOfPair = 1;
//
//		System.out.print("Enter the value pair quantity: ");
//		valueOfN = reader.nextInt();
//
//		for (int i = 0; i < valueOfN; i++) {
//			System.out.println("Enter the first and second value numbers below of Pair "+countOfPair+":");
//			firstInput = reader.nextDouble();
//			secondInput = reader.nextDouble();
//
//			if (secondInput == 0) {
//				System.out.println("Impossible Division Operation by denominator equal(=) to 0.");
//			} else {
//				double divisionOfPairsInput = firstInput / secondInput;
//				System.out.println("The Division of the first input by second input number: " + divisionOfPairsInput);
//			}
//			
//			countOfPair++;
//		}
//		
//		System.out.println("END THE PROCESS.");
		
		reader.close();
		
	}

}
