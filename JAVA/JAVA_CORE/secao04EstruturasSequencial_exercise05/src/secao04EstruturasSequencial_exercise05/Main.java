package secao04EstruturasSequencial_exercise05;

import java.util.Scanner;
import java.util.Locale;


public class Main {
	public static void main(String[] args) {
		/*
		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

		Entrada: 
		12 1 5.30
		16 2 5.10
		Saída:
		VALOR A PAGAR: R$ 15.50
		*/
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int pieceCode1,pieceNumber1,pieceCode2,pieceNumber2;
		double piecePrice1,piecePrice2,TotalPrice;
		
		
		System.out.println("Enter the CODE, NUMBER and PRICE OF PIECE 1:");
		
		pieceCode1=reader.nextInt();
		pieceNumber1=reader.nextInt();
		piecePrice1=reader.nextDouble();
		
		piecePrice1 = piecePrice1 * pieceNumber1;
		
		
		System.out.println("Enter the CODE, NUMBER and PRICE OF PIECE 2:");
		
		pieceCode2=reader.nextInt();
		pieceNumber2=reader.nextInt();
		piecePrice2=reader.nextDouble();
		
		piecePrice2 = piecePrice2 * pieceNumber2;
		
		TotalPrice = piecePrice1 + piecePrice2;
		
		System.out.printf("Amount to pay: USD$ %.2f",TotalPrice);
		
		
		reader.close();
		
	
		
		
		
		
	}

}
