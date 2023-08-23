package secao07Funcao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Fazer um programa para ler três números inteiros e mostrar na tela
		//o maior deles.
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		reader.close();

		
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
