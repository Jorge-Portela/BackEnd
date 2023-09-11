package bankAccount.entities;

import java.util.Locale;

public class BankAccount {

	private String accountHolder;
	private int accountNumber;
	private double accountValue;

	
	
	public BankAccount() {
	}

	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;

	}



	public void setDepositInitial(double accountValue) {
		this.accountValue += accountValue;
	}
	
	
	public double getDepositInitial() {
		return this.accountValue;
	}
	
	public String toString() {
		return  "Account data: "
				+"Account: "+this.accountNumber
				+", "
				+"Holder: "+this.accountHolder
				+", "
				+String.format("Balance: $ %.2f",getDepositInitial());
	}

}
