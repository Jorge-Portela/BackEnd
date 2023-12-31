package example.application;

import java.util.Locale;
import java.util.Scanner;

import example.entitie.Triangle;

public class Main_WithOop {
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

		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = reader.nextDouble();
		x.b = reader.nextDouble();
		x.c = reader.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = reader.nextDouble();
		y.b = reader.nextDouble();
		y.c = reader.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Area of Triangle X: %.4f%n", areaX);
		System.out.printf("Area of Triangle Y: %.4f%n", areaY);

		if (areaX < areaY) {
			System.out.println("The Largest Area: Y");
		} else if (areaX > areaY) {
			System.out.println("The Largest Area: X");
		} else {
			System.out.println("The Largest Area: EQUALS");
		}
		
		reader.close();

	}
	
}
