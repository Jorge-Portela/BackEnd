package bankAccount.entities;

public class PessoaFisica extends BankAccount {
	private String cpf;
	
	
	public PessoaFisica() {} //Pattern Construct to future usage in JSON or data persistence process
	
	public PessoaFisica(int accountNumber, String accountHolder,String cpf) {
		super(accountNumber,accountHolder) ;
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}
