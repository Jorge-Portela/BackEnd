package curso_programacao;

import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		double x = 12.5398116544;
		String name = "João";
		int age = 31;
		double income = 4000.0;
		
		
		System.out.println(x);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f\n", x);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.1f\n",x);
		System.out.printf("Result %.2f meters \n",x);
		
		System.out.println("---------------------");
		
	
		
		System.out.printf("%s has %d years old and his income's $ %.2f dollars a month.",name,age,income);
		
		
		

		
	}

}
