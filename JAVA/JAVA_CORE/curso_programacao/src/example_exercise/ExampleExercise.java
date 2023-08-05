package example_exercise;

import java.util.Scanner;

public class ExampleExercise {
	public static void main(String[] args) {
		
//		Fazer um programa para ler as medidas da largura e comprimento
//		de um terreno retangular com uma casa decimal, bem como o 
//		valor do metro quadrado do terreno com duas casas decimais. 
//		Em seguida, o programa deve mostrar o valor da área do terreno, 
//		bem como o valor do preço do terreno, ambos com duas casas
//		decimais, conforme exemplo.
		
		Scanner sc = new Scanner(System.in);
		
		double larguraDoTerreno;
		double comprimentoDoTerreno;
		double areaDoTerreno;
		double vlrMetroQuadrado;
		double vlrDoTerreno;
		
		System.out.println("Insira a largura do Terreno: ");
		larguraDoTerreno = sc.nextDouble();
		
		System.out.println("Insira o comprimento do Terreno: ");
		comprimentoDoTerreno = sc.nextDouble();
		
		System.out.println("Insira o valor do metro quadrado: ");
		vlrMetroQuadrado = sc.nextDouble();
		
		//Calculo da Área do terreno
		areaDoTerreno = larguraDoTerreno * comprimentoDoTerreno;
		
		vlrDoTerreno = vlrMetroQuadrado * areaDoTerreno;
		
		System.out.printf("Área do Terreno: %.2f m² \n",areaDoTerreno);
		System.out.printf("Preço do Terreno: R$ %.2f",vlrDoTerreno);
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
