package secao04EstruturasSequencial_exercise06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	/*
	Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 	 
	a) a área do triângulo retângulo que tem A por base e C por altura. 
	b) a área do círculo de raio C. (pi = 3.14159) 
	c) a área do trapézio que tem A e B por bases e C por altura. 
	d) a área do quadrado que tem lado B. 
	e) a área do retângulo que tem lados A e B.
	Entrada: 
	3.0 4.0 5.2 
	Saída:
	TRIANGULO: 7.800
	CIRCULO: 84.949
	TRAPEZIO: 18.200
	QUADRADO: 16.000
	RETANGULO: 12.000
	*/	
	Locale.setDefault(Locale.US);	
	Scanner reader = new Scanner(System.in);
	
	double a,b,c;
	
	
	System.out.println("Enter the value of A, B and C:");
	a = reader.nextDouble();
	b = reader.nextDouble();
	c = reader.nextDouble();
		
	//Triangle Area => (base * height)/2
	double triangle = (a * c)/2;
	
	//Circle Area => pi * (radius^2) 
	double circle = Math.PI*(Math.pow(c,2));
	
	//Trapeze Area => ((minor base + bigger base)*height)/2
	double trapeze = ((a+b)*c)/2;
	
	//Square Area => b² or b^2
	double square = Math.pow(b,2);
	
	// Rectangle Area => length * width
	double rectangle = a * b;
	
	System.out.printf("Result  Area of Geometric Figures: %nTRIANGLE: %.2f %nCIRCLE: %.2f %nTRAPEZE: %.2f %nSQUARE: %.2f %nRECTANGLE: %.2f ",triangle,circle,trapeze,square,rectangle);
	
	reader.close();
	
		
	}

}
