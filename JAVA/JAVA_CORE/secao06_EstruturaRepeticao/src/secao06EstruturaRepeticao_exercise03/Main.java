package secao06EstruturaRepeticao_exercise03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		int fuelType,alcoholFuel=0,gasolineFuel=0,dieselFuel=0,sum = 0;
		
		System.out.println("Fuel Types: \n1 - Alcohol \n2 - Gasoline \n3 - Diesel \n4 - End Process");
		
		
		System.out.print("\nEnter the Fuel type: ");
		fuelType=reader.nextInt();
		
		while(fuelType != 4) {
			switch(fuelType) {
			case 1:
				alcoholFuel += 1 ;
				break;
			case 2:
				gasolineFuel +=1;
				break;
			case 3:
				dieselFuel += 1;
				break;
			default:
				System.out.println("INVALID COD. PLEASE ENTER A VALID ONE.");
				break;
				
			}
			System.out.print("\nEnter the Fuel type: ");
			fuelType=reader.nextInt();
			
		}
		
		System.out.println("\nQuantity of Fuel Entered:");
		System.out.println("\nAlcohol: "+alcoholFuel);
		System.out.println("Gasoline: "+gasolineFuel);
		System.out.println("Diesel: "+dieselFuel);
		
		
		
		
		
	}

}
