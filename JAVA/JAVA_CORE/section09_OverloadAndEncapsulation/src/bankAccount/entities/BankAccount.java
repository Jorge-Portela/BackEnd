package bankAccount.entities;


public class BankAccount {

	private String accountHolder;
	private int accountNumber;
	private double balance;

	
	public BankAccount() {}
	

	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;

	}


	
	public void setDepositAccount(double accountValue) {
		this.balance += accountValue;
	}
	
	public void setWithdrawAccount(double accountValue) {
		this.balance -= accountValue;
	}
	
	
	
	public double getDepositAccount() {
		return this.balance;
	}
	
	public double getWithdrawAccount() {
		return this.balance -= 5 ;
		
	}
	
	public String getWithdrawAccountData() {
		return  "Account: "+this.accountNumber
				+", "
				+"Holder: "+this.accountHolder
				+", "
				+String.format("Balance: $ %.2f",getWithdrawAccount());
	}
	
	public String toString() {
		return  "Account: "+this.accountNumber
				+", "
				+"Holder: "+this.accountHolder
				+", "
				+String.format("Balance: $ %.2f",getDepositAccount());
	}

}
