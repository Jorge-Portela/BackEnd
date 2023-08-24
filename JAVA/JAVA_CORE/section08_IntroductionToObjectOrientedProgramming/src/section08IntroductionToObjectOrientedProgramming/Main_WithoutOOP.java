package section08IntroductionToObjectOrientedProgramming;

import java.util.Locale;
import java.util.Scanner;

public class Main_WithoutOOP {
	public static void main(String[] args) {
	 /*
      *Fazer um programa para ler as medidas dos lados de dois triângulos 
	  *X e Y (suponha medidas válidas). Em seguida, mostrar o valor das 
	  *áreas dos dois triângulos e dizer qual dos dois triângulos possui a
	  *maior área
	  *
	  *A fórmula para calcular a área de um triângulo a partir das medidas 
	  *de seus lados a, b e c é a seguinte (fórmula de Heron):
	  * 
	  * p = (a+b+c) / 2 
	  * Math.sqrt(p*(p-a)*p*(p-b)*p*(p-c))
	  */
	
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		
		System.out.println("Enter the measures of triangle X: ");
		xA = reader.nextDouble();
		xB = reader.nextDouble();
		xC = reader.nextDouble();
		
		double pX = (xA+xB+xC)/2;
		double areaX = Math.sqrt(pX*(pX-xA)*pX*(pX-xB)*pX*(pX-xC));
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = reader.nextDouble();
		yB = reader.nextDouble();
		yC = reader.nextDouble();
		
		double pY = (yA+yB+yC)/2;
		double areaY = Math.sqrt(pY*(pY-yA)*pY*(pY-yB)*pY*(pY-yC));
		
		System.out.println("Area of Triangle X: "+areaX);
		System.out.println("Area of Triangle Y: "+areaY);
		
		
		if(pX < pY) {
			System.out.println("The Largest Area: Y");
		} else if(pX > pY) {
			System.out.println("The Largest Area: X");
		}else {
			System.out.println("The Largest Area: EQUALS");
		}		
		
		
	}

}
