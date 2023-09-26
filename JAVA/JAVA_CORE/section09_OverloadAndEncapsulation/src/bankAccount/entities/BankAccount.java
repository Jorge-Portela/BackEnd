package bankAccount.entities;


public class BankAccount {

	private String accountHolder;
	private int accountNumber;
	private double accountValue;

	
	public BankAccount() {}
	

	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;

	}



	
	
	
	public void setDepositAccount(double accountValue) {
		this.accountValue += accountValue;
	}
	
	public void setWithdrawAccount(double accountValue) {
		this.accountValue -= accountValue;
	}
	
	
	
	public double getDepositAccount() {
		return this.accountValue;
	}
	
	public double getWithdrawAccount() {
		return this.accountValue -= 5 ;
		
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
