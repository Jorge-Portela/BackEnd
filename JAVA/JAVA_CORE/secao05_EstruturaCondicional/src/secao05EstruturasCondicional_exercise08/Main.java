package secao05EstruturasCondicional_exercise08;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
		 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
		 * recursos arrecadados são utilizados em benefício da população, sem qualquer
		 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		 *  Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
		 * de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
		 * Imposto de Renda, segundo a tabela abaixo.
		 * 
		 *       RENDA                IMPOSTO 
		 *  de 0.00 a 2000.00         isento 
		 *  de 2000.01 a 3000.00       8 % 
		 *  de 3000.01 a 4500.00       18 % 
		 *  acima de 4500.00           28 %
		 *  
		 *  Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
		 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
		 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
		 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
		 * valor deve ser impresso com duas casas decimais.
		 * 
		 * x = 3002.00
		 * (x <= 2000.00) entao isento valor de x 
		 * (x >= 2000.01 && x <= 3000.00) entao (x - 2000.00)* 0.08  
		 * (x >= 3000.01 && x <= 4500.00) entao (1000.00 * 0.08) + (x - 3000.00) * 0.18
		 * ( x < 4500.00) entao (1500.00 * 0.18) +  (x - 4500)* 0.28
		 */

		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		double income, taxIncome;
		
		System.out.print("Enter the Average Monthly Income:  ");
		income = reader.nextDouble();
		
		if(income <= 2000.00 ) 
		{
			taxIncome = income;
			System.out.printf("%nFREE of Tax Income.");
			
		}else if(income > 2000.00 && income <=3000.00)
			{
				taxIncome = (income - 200.00) * 0.08 ;
				System.out.printf("%nThe Tax Income: USD$ %.2f",taxIncome);
			
			}else if(income >= 3000.00 && income <=4500.00) 
				{ //80.00 + tax income of 0.18 over(multiply) entered income
					taxIncome = (1000.00 * 0.08) + (income - 3000.00) * 0.18;   
					System.out.printf("%nThe Tax Income: USD$ %.2f",taxIncome);
				
				} else 
					{//80.00 + 270.00 + tax income of 0.28 over(multiply) entered income
						taxIncome = (1000.00 * 0.08) + (1500.00 * 0.18) + (income - 4500.00) * 0.28;   
						System.out.printf("%nThe Tax Income: USD$ %.2f",taxIncome);
					}
		
		
		reader.close();		
		
		
		
		
	}

}
