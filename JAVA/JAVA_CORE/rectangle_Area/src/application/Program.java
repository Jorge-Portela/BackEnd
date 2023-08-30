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
		 * 
		 * Write a program to read the width and height values
		 * of a rectangle. Then show on the screen the value of
		 * its area, perimeter and diagonal. Use a class like
		 * shown in the project opposite.
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rectangle.width = reader.nextDouble();
		rectangle.height = reader.nextDouble();
		
		System.out.println();
		System.out.println(rectangle);
	
		reader.close();
	
	}	

}
