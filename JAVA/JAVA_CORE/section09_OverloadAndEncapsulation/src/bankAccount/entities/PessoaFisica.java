package bankAccount.entities;

public class PessoaFisica extends BankAccount {
	private String cpf;
	
	
	public PessoaFisica() {}
	
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
