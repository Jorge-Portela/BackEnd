package secao06EstruturaRepeticao_exercise08;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int valueOfN,factorial=0;
		
		System.out.print("Enter the value: ");
		valueOfN = reader.nextInt();
		
		for(int i = valueOfN; i >1;i--) {
			valueOfN = valueOfN * (i-1);
			factorial = valueOfN;
			
		}
		
		System.out.println("Factorial: "+factorial);
		
		reader.close();
		
	}

}
