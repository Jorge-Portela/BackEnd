package exercise02.application;

import exercise02.entities.Employee;

import java.util.Locale;
import java.util.Scanner;
public class Program {

    public static void main(String[] args){
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

        Employee employee1 = new Employee();

        System.out.print("Name: ");
        employee1.name = reader.nextLine();

        System.out.print("Gross Salary: ");
        employee1.grossSalary = reader.nextDouble();

        System.out.print(" Tax: ");
        employee1.tax = reader.nextDouble();

        System.out.println("\nEmployee: "+employee1);

        System.out.print("\nPercentage to increase salary: ");
        double percentage = reader.nextDouble();
        employee1.isIncreaseSalary(percentage);

        System.out.print("\nUpdate data: " + employee1);

        reader.close();


    }
}
