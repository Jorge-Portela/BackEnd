package secao05EstruturasCondicional_exercise03;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter the values below: ");
		a = reader.nextInt();
		b = reader.nextInt();
		
		if(a % b == 0 || b % a == 0 ) {
			System.out.println("The values ARE MULTIPLES of each other.");
			
		}else {
			System.out.println("The values are NOT MULTIPLES of each other.");
		}
		
		
	}

}
