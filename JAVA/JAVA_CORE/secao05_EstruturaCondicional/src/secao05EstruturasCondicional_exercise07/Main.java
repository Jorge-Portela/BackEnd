package secao05EstruturasCondicional_exercise07;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		/*
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
		 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
		 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
		 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
		 * ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		 * situação.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		double axiX,axiY;
		
		System.out.print("Enter the value of point in X axi: ");
		axiX = reader.nextDouble();
		
		System.out.print("Enter the value of point in Y axi: ");
		axiY = reader.nextDouble();
		
		if(axiX > 0 && axiY > 0) {
			System.out.println("The coordinate point is located in First Quadrant (Q1)");
			
		}else if(axiX < 0 && axiY > 0){
			System.out.println("The coordinate point is located in Second Quadrant (Q2)");
			
		}else if(axiX < 0 && axiY < 0){
			System.out.println("The coordinate point is located in Third Quadrant (Q3)");
			
		}else if(axiX > 0 && axiY < 0){
			System.out.println("The coordinate point is located in Fourth Quadrant (Q4)");
			
		}else {
			System.out.println("The coordinate point is located at the Origin.");
			
		}
		
		reader.close();
	
	} 

}
