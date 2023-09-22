package bankAccount.application;

import java.util.Scanner;

import bankAccount.entities.PessoaFisica;

public class TesteConta {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String pfAccountCpf = reader.nextLine();
		reader.nextLine();
		String pfAccountName = reader.nextLine();
		reader.nextLine();
		int pfAccountNumber = reader.nextInt();
		
		PessoaFisica pf1 = new PessoaFisica(pfAccountNumber, pfAccountName,pfAccountCpf);
 
		pf1.setDepositAccount(reader.nextDouble());
		
		reader.close();
	}

}
