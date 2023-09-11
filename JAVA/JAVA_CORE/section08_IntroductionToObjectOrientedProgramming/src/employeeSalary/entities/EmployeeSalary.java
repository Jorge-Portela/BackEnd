package employeeSalary.entities;

public class EmployeeSalary {
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
		public String name;
		public double grossSalary;
		public double tax;
		public double percentage;
		
		public double isNetSalary() {
			return this.grossSalary - this.tax;
		}
		
		public void increaseSalary(double percentage) {
			this.grossSalary += (grossSalary  * percentage) / 100;
		}
		
		public String toString() {
			return  this.name 
				  + ", Net Salary: $ "
				  + String.format("%.2f", isNetSalary());
		}

}
