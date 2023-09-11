package bankAccount.entities;

public class BankAccount {

	private String accountHolder;
	private int accountNumber;
	private double depositInitial;

	public BankAccount() {
	}

	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;

	}

	public void setDepositInitial(String initDepositValidation, double depositInitial) {

		System.out.print("Is there na initial deposit (y/n)?: ");

		initDepositValidation.toUpperCase();

		if (initDepositValidation.equalsIgnoreCase("Y")) {

		} else if (initDepositValidation.equalsIgnoreCase("N")) {

		}
	}

	public double setDepositInitial() {
		return this.depositInitial;
	}

}
