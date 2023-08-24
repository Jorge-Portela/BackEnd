package section08IntroductionToObjectOrientedProgramming;

import java.util.Locale;
import java.util.Scanner;




public class Main_WithoutOop {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
		 * (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois
		 * triângulos e dizer qual dos dois triângulos possui a maior área
		 *
		 * A fórmula para calcular a área de um triângulo a partir das medidas de seus
		 * lados a, b e c é a seguinte (fórmula de Heron):
		 * 
		 * p = (a+b+c) / 2 Math.sqrt(p*(p-a)*p*(p-b)*p*(p-c))
		 */

		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;

		System.out.println("Enter the measures of triangle X: ");
		xA = reader.nextDouble();
		xB = reader.nextDouble();
		xC = reader.nextDouble();

		double pX = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

		System.out.println("Enter the measures of triangle Y: ");
		yA = reader.nextDouble();
		yB = reader.nextDouble();
		yC = reader.nextDouble();

		double pY = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

		System.out.printf("Area of Triangle X: %.4f%n", areaX);
		System.out.printf("Area of Triangle Y: %.4f%n", areaY);

		if (pX < pY) {
			System.out.println("The Largest Area: Y");
		} else if (pX > pY) {
			System.out.println("The Largest Area: X");
		} else {
			System.out.println("The Largest Area: EQUALS");
		}
		
		reader.close();

	}

}
