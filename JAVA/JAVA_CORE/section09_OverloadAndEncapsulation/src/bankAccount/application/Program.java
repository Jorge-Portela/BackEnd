package bankAccount.application;

import java.util.Locale;
import java.util.Scanner;

import bankAccount.entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		

		System.out.println("Enter account number: ");
		int inputAccountNumber = reader.nextInt();

		reader.nextLine();
		
		System.out.println("Enter account holder: ");
		String inputAccountHolder = reader.nextLine();

		BankAccount bankAccount = new BankAccount(inputAccountNumber,inputAccountHolder);
		
		System.out.print("Is there na initial deposit (Y-YES/N-NO)?: ");
		String inputInitDepositValidation = reader.next();
		
		
		if(inputInitDepositValidation.equalsIgnoreCase("Y")) {
			System.out.println("Enter initial deposit value: ");
			
			double inputInitialDeposit = reader.nextDouble();
			bankAccount.setDepositInitial(inputInitialDeposit);
			
		}else if(inputInitDepositValidation.equalsIgnoreCase("N")) {
			
		}
		
		System.out.println(bankAccount);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
