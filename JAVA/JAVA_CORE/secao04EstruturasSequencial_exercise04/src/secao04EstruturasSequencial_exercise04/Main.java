package secao04EstruturasSequencial_exercise04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
		decimais.
		Entrada: 
		25
		100
		5.50
		Saída:
		NUMBER = 25
		SALARY = U$ 550.00
		*/
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int numberOfEmployee;
		int hoursWorked;
		double hourlyWage;
		
		System.out.println("Enter the Emploiee number: ");
		numberOfEmployee = reader.nextInt();
		
		System.out.println("Enter the Hours Worked: ");
		hoursWorked = reader.nextInt();
		
		System.out.println("Enter the hourly wage: ");
		hourlyWage = reader.nextDouble();
		
		hourlyWage = hourlyWage * hoursWorked;
		
		System.out.println("Emploiee Number: " + numberOfEmployee);
		
		System.out.printf("Emploiee Salary: USD$ %.2f",hourlyWage);
		
		reader.close();
		
	}

}
