package application;

import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeSalary;

public class Program {
	public static void main(String[] args) {
		/*
		 * Write a program to read an employee's data (name, gross salary and tax). In
		 * then show the employee's data (name and net salary). Then increase the
		 * employee salary based on a given percentage (only gross salary is
		 * affected by percentage) and show the employee data again. use the class
		 * projected below.
		 * 
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
		 * seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
		 * salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
		 * afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
		 * projetada abaixo. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		
		
		EmployeeSalary employeeSalary = new EmployeeSalary();
		
		System.out.print("Name: ");
		employeeSalary.name = reader.nextLine();
		
		System.out.print("\nGross Salary: ");
		employeeSalary.grossSalary = reader.nextDouble();
		
		System.out.printf("\nTax: ");
		employeeSalary.tax = reader.nextDouble();
		
		
		
		System.out.print("\nEmployee: ");
		System.out.print(employeeSalary);

		
		System.out.printf("\nWich percentage to increase salary? ");
		employeeSalary.percentage= reader.nextDouble();
			
		employeeSalary.increaseSalary(employeeSalary.percentage);
		
		System.out.print("\nUpdated data: ");
		System.out.println(employeeSalary);
		
		reader.close();
		
		
		
		
	}

}
