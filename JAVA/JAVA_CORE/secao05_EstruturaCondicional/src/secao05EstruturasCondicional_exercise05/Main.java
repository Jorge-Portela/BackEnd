package secao05EstruturasCondicional_exercise05;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * Tabela:
		 *
		 * CODIGO ||   ESPECIFICAÇÃO   ||  PREÇO  ||
		 * ================================================ 
		 *    1   ||  HOT DOG          || R$ 4.00 ||
		 *    2   ||  X-SALAD          || R$ 4.50 || 
		 *    3   ||  X-BACON          || R$ 5.00 || 
		 *    4   ||  SIMPLE TOAST     || R$ 2.00 ||
		 *    5   ||  SODA             || R$ 1.50 ||
		 */

		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		
		int codItem, quantityItem;
		double totalPrice=0;
		String item = "";
		

		System.out.print("Enter the item CODE: ");
		codItem = reader.nextInt();

		System.out.print("Enter the item QUANTITY: ");
		quantityItem = reader.nextInt();
		

		if (quantityItem > 0) {
			switch (codItem) {
			case 1: //HOT DOG
				totalPrice = 4.00 * quantityItem;
				item = "HOT DOG";
				break;
			case 2: //X-SALAD
				totalPrice = 4.50 * quantityItem;
				item = "X-SALAD";
				break;
			case 3: //X-BACON
				totalPrice = 5.00 * quantityItem;
				item = "X-BACON";
				break;
			case 4: //SIMPLE TOAST
				totalPrice = 2.00 * quantityItem;
				item = "SIMPLE TOAST";
				break;
			case 5: //SODA
				totalPrice = 1.50 * quantityItem;
				item = "SODA";
				break;
			default:
				System.out.println("INVALID CODE.");
				break;
			}
			
			System.out.printf("%nITEM SELECTED: %s",item);
			System.out.printf("%nQUANTITY: %d",quantityItem);
			System.out.printf("%nITEM PRICE: USD$ %.2f ",totalPrice);
			

		} else {
			System.out.println("QUANTITY MUST NOT BE ZERO OR NULL. ");
		}
		
		
	
	}

}
