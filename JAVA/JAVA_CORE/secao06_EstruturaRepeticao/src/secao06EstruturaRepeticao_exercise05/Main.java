package secao06EstruturaRepeticao_exercise05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		int valueOfN, valueOfX, inRange = 0, outRange = 0, i;

		System.out.print("Enter the value N: ");
		valueOfN = reader.nextInt();

		for (i = 0; i < valueOfN; i++) {
			System.out.print("Enter a value: ");
			valueOfX = reader.nextInt();
			if (valueOfX >= 10 && valueOfX <= 20) {
				inRange += 1;
			} else {
				outRange += 1;
			}
		}

		System.out.println("\nQuantity values IN and OUT of range[10-20]: ");
		System.out.println("Values IN: " + inRange);
		System.out.println("Values OUT: " + outRange);

		reader.close();

	}

}

