package studentGrade.application.program;

import java.util.Locale;
import java.util.Scanner;

import studentGrade.application.entities.Student;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
		 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
		 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
		 * também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
		 * quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é
		 * 60% da nota). Você deve criar uma classe Student para resolver este problema.
		 *
		 * Make a program to read a student's name and the three grades he got in the
		 * three quarters of the year (first quarter is worth 30 and second and third
		 * are worth 35 each). At the end, show the student's final grade in the year.
		 * Also say if the student is approved (PASS) or not (FAILED) and, if not, how
		 * many points are missing for the student to obtain the minimum to pass (which
		 * is 60% of the grade). You must create a Student class for solve this problem.
		 */

		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		Student mike = new Student();

		System.out.println("Enter Data:");
		System.out.print("\nStudent Name: ");
		mike.studentName = reader.nextLine();

		System.out.print("\nFirst Grade(MAX 30 POINTS): ");
		mike.firstGrade = reader.nextDouble();
		while (mike.firstGrade < 0 || mike.firstGrade > 30) {
			System.out.print("\nEnter First Grade again (MAX 30 POINTS): ");
			mike.firstGrade = reader.nextDouble();
		}

		System.out.print("\nSecond Grade(MAX 35 POINTS): ");
		mike.secondGrade = reader.nextDouble();
		while (mike.secondGrade < 0 || mike.secondGrade > 35) {
			System.out.print("\nEnter Second Grade again (MAX 35 POINTS): ");
			mike.secondGrade = reader.nextDouble();
		}

		System.out.print("\nThird Grade(MAX 35 POINTS): ");
		mike.thirdGrade = reader.nextDouble();
		while (mike.thirdGrade < 0 || mike.thirdGrade > 35) {
			System.out.print("\nEnter Third Grade again (MAX 35 POINTS): ");
			mike.thirdGrade = reader.nextDouble();
		}

		mike.validateGrade();

		reader.close();

	}

}
