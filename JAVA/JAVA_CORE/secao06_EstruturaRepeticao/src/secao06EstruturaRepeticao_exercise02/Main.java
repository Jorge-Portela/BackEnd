package secao06EstruturaRepeticao_exercise02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner reader= new Scanner(System.in);
		
		double axisX, axisY;
		
		System.out.print("Enter a Value the Axis X: ");
		axisX = reader.nextDouble();
		
		System.out.print("Enter a Value the Axis Y: ");
		axisY = reader.nextDouble();
		
		while(axisX != 0 && axisY != 0) {
			
			if(axisX > 0 && axisY > 0) 
			{
				System.out.println("The Coordinate Point is located in First Quadrant (Q1).");
				
				
			}else if(axisX < 0  && axisY > 0) 
			{
				System.out.println("The Coordinate Point is located in Second Quadrant (Q2).");
				
				
			}else if(axisX < 0  && axisY < 0) {
				System.out.println("The Coordinate Point is located in Third Quadrant (Q3).");
				
				
			}else 
			{
				System.out.println("The Coordinate Point is located in Fourth Quadrant (Q4).");
				
			}
			
			System.out.print("\nEnter a Value the Axis X: ");
			axisX = reader.nextDouble();
			
			System.out.print("\nEnter a Value the Axis Y: ");
			axisY = reader.nextDouble();
			
		}
		
		System.out.println("END OF THE SEARCH.");		
		
	}

}
