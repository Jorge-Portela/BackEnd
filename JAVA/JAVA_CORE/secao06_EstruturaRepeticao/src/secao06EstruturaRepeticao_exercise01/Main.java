package secao06EstruturaRepeticao_exercise01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int enteredPassword;
		
		System.out.println("Enter the Password: ");
		enteredPassword = reader.nextInt();
		
		while(enteredPassword != 2002) {
			
			System.out.println("INVALID Password. Please, Enter the Password again: ");
			enteredPassword = reader.nextInt();
		}
		
		System.out.println("CORRECT PASSWORD. WELCOME!");
		
		
		reader.close();
		
		
		
		
	}

}
