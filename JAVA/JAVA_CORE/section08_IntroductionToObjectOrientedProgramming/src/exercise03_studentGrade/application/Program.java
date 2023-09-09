package exercise03_studentGrade.application;

import java.util.Locale;
import java.util.Scanner;

import exercise03_studentGrade.application.entities.Student;



public class Program {

	public static void main(String[] args) {
		/*
		 *Fazer um programa para ler o nome de um aluno e as três 
		 *notas que ele obteve nos três trimestres do ano 
		 *(primeiro trimestre vale 30 e o segundo e terceiro valem 35
		 *cada). Ao final, mostrar qual a nota final do aluno no ano. 
		 *Dizer também se o aluno está aprovado (PASS) ou não (FAILED)
		 *e, em caso negativo, quantos pontos faltam para o aluno 
		 *obter o mínimo para ser aprovado (que é 60% da nota). 
		 *Você deve criar uma classe Student para resolver este 
		 *problema.
		 *
		 *	
		 *recebe 3 notas ;
		 * 
		 *primeiro trimestre max: 30; seg e terc max:35    
		 * 
		 *aprovação soma notas >= 60; aprovação soma notas < 60
		 * 
		 *aprovado mostrar msg "PASS"; reprovado mostrar "FAILED" e pts faltantes
		 */
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		Student mike = new Student();
		
		System.out.println("Enter Data:");
		System.out.print("\nStudent Name: ");
		mike.studentName = reader.nextLine();
		
		System.out.print("First Grade: ");
		mike.firstGrade = reader.nextDouble();
		
		System.out.print("Second Grade: ");
		mike.secondGrade = reader.nextDouble();
		
		System.out.print("Third Grade: ");
		mike.thirdGrade = reader.nextDouble();
		
		
		mike.validateGrade();
		
		reader.close();
		
		
		
	}

}
