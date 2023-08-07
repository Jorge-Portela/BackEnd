package secao04EstruturasSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//	Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//	mensagem explicativa, conforme exemplos.
//
//	Entrada: 
//	-30
//	10
//	Saída:
//	SOMA = -20

		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter: ");
		int x = reader.nextInt();
		int y = reader.nextInt();
		
		
		int sum = x + y;
		
		System.out.println("SUM:" + sum);
		
		
		
	}

}
