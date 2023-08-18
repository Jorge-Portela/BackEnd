package secao06EstruturaRepeticao_exercise04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		int valueOfX, i;

		System.out.print("Enter the value of X: ");
		valueOfX = reader.nextInt();

		System.out.println("\nBelow are the ODD numbers in the range 1 to X:  ");

		for (i = 1; i <= valueOfX; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		reader.close();

	}

}
