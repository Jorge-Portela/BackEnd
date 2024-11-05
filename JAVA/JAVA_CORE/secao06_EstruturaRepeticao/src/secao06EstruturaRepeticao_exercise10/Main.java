package secao06EstruturaRepeticao_exercise10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve
		 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
		 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo.
		 * 
		 * Create a program to read a positive integer number N. The program should then
		 * display on the screen N lines, starting from 1 up to N. For each line,
		 * display the line number, followed by the square and cube of the value, as
		 * shown in the example.
		 */

		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		int valueOfN;

		System.out.print("Enter the value: ");
		valueOfN = reader.nextInt();

		for (int i = 1; i <= valueOfN; i++) {
			int square = i * i;
			int cube = i * i * i;

			System.out.println(i + ". square: " + square + ", cube: " + cube);
		}

		reader.close();

//	WRONG DRAFT:	
//		int aux=0;
//		aux+=valueOfN;
//	
//		for(int i = 1; i<=valueOfN;i++) {
//			
//			double squared = Math.pow(aux,2);
//			double cubeed = Math.pow(aux,3);
//			System.out.printf("\n"+i+". Squared: "+(int)squared+", cubeed: "+(int)cubeed);
//			aux++;
//			
//		}

	}

}
