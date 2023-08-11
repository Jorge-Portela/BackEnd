package secao05EstruturasCondicional_exercise04;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		int startTime, endTime, gameLasted;

		System.out.print("Enter the Start Time: ");
		startTime = reader.nextInt();

		System.out.print("Enter the End Time: ");
		endTime = reader.nextInt();

		if (startTime > endTime) {
			gameLasted = (24 - startTime) + endTime;

		} else if (startTime < endTime) {
			gameLasted = endTime - startTime;
		} else {
			gameLasted = 24;
		}

		System.out.printf("The Game Lasted: %d Hours.", gameLasted);

	}

}
