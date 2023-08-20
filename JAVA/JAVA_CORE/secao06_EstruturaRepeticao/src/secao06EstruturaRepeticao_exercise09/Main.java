package secao06EstruturaRepeticao_exercise09;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Ler um número inteiro N e calcular todos os seus divisores.
		 * 
		 * Read an integer N and calculate all it divisors. 
		 */
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		int valueOfN, division = 0;

		System.out.print("Enter the value: ");
		valueOfN = reader.nextInt();

		System.out.println("Divisors:");

		for (int i = valueOfN; i >= 1; i--) {
			division = valueOfN / i;
			if (valueOfN % i == 0) {
				System.out.println(division);
			}
		}

	}

}
