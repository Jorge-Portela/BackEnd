package bankAccount.application;

import java.util.Locale;
import java.util.Scanner;

import bankAccount.entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		

		System.out.print("Enter account number: ");
		int AccNumber = reader.nextInt();

		reader.nextLine();
		
		
		
		System.out.print("Enter account holder: ");
		String AccHolder = reader.nextLine();

		BankAccount bankAccount = new BankAccount(AccNumber,AccHolder);
		
		System.out.print("Is there na initial deposit (Y-YES/N-NO)?: ");
		String InitDeposit= reader.next();
		
		
		if(InitDeposit.equalsIgnoreCase("Y")) {
			System.out.println("Enter initial deposit value: ");
			
			double inputValue = reader.nextDouble();
			bankAccount.setDepositAccount(inputValue);
			
		}else if(InitDeposit.equalsIgnoreCase("N")) {
			
		}
		
		System.out.println(bankAccount);
		
		System.out.print("\nEnter a deposit value: ");
		double inputDeposit = reader.nextDouble();
		bankAccount.setDepositAccount(inputDeposit);
		
		System.out.println("\nUpdate Account Data: ");
		System.out.println(bankAccount);
		
		System.out.print("\nEnter a withdraw value: ");
		double inputWithdraw = reader.nextDouble();
		bankAccount.setWithdrawAccount(inputWithdraw);

		System.out.println("\nUpdate Account Data: ");
		System.out.println(bankAccount.getWithdrawAccountData());
		
				
		reader.close();	

	}

}
