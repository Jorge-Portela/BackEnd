package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os valores da largura e altura 
		 * de um retângulo. Em seguida, mostrar na tela o valor de 
		 * sua área, perímetro e diagonal. Usar uma classe como 
		 * mostrado no projeto ao lado.
		 */
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rectangle.width = reader.nextDouble();
		rectangle.height = reader.nextDouble();
		
		System.out.println();
		System.out.printf("\nAREA = %.2f", rectangle.area(rectangle.width, rectangle.height));
		System.out.printf("\nPERIMENTER = %.2f",rectangle.perimeter(rectangle.width, rectangle.height));
		System.out.printf("\nDIAGONAL = %.2f",rectangle.diagonal(rectangle.width, rectangle.height));
	
		reader.close();
	
	}	

}
