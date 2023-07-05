package bytebank_herdado;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		
		System.out.println("Nome do Funcionário: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Salario sem bonificação: R$ " + this.salario);
		System.out.println("Bonificação de 10%: R$ " + this.getBonificacao());
		System.out.println("Salario com bonificação: R$ " + this.getSalarioComBonificacao());
		
	}
	

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public double getSalario() {
		return this.salario;
	}
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	public double getSalarioComBonificacao() {
		return this.salario = salario + getBonificacao();
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
