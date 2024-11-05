package example_switchCase;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Crie uma plicação para ler um valor numérico inteiro e relacioná-lo aos dias
		 * da semana
		 */

		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		int numberOfDayWeek;

		System.out.print("Enter the value between [1-7] to a day of week: ");
		numberOfDayWeek = Math.absExact(reader.nextInt());

		switch (numberOfDayWeek) {
		case 1:
			System.out.println("The day of week is SUNDAY.");
			break;
		case 2:
			System.out.println("The day of week is MONDAY.");
			break;
		case 3:
			System.out.println("The day of week is TUESDAY.");
			break;
		case 4:
			System.out.println("The day of week is WEDNESDAY.");
			break;
		case 5:
			System.out.println("The day of week is THURSDAY.");
			break;
		case 6:
			System.out.println("The day of week is FRIDAY.");
			break;
		case 7:
			System.out.println("The day of week is SATURDAY.");
			break;
		default:
			System.out.println("It is not a VALID DAY.");
			break;
		}

		reader.close();

	}

}


