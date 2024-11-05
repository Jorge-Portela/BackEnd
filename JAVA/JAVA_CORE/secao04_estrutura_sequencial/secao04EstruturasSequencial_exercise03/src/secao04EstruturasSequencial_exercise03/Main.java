package secao04EstruturasSequencial_exercise03;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args){
		/*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

        Entrada:
        5
        6
        7
        8
        Saída:
        DIFERENCA = -26
		*/
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int a,b,c,d,diference;
		
		System.out.println("Enter the numbers:");
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();
		d = reader.nextInt();
		
		diference = (a*b)-(c*d);
		
		System.out.println("DIFERENCE = "+diference);
		
		reader.close();
		
		
		
		
		
		
	}		
}
