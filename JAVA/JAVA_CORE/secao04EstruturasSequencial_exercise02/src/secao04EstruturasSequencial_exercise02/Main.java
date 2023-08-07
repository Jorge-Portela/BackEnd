package secao04EstruturasSequencial_exercise02;

import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		 /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo
        com quatro casas decimais conforme exemplos.

        Fórmula da área: area = π . raio**2
        Considere o valor de π = 3.14159

        Entrada:
        2.00
        Saída:
        A=12.5664
        */
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		double radiusOfCricle;
		double areaOfCicle;
		
		System.out.println("Enter the radius of the circle:");
		radiusOfCricle = reader.nextDouble();
		
		areaOfCicle = 3.14159*Math.pow(radiusOfCricle,2);
		
		System.out.printf("Circle Area: %.4f",areaOfCicle);
		
		reader.close();
		
		
		
	}

}
