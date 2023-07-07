package bytebank_herdado;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;

	// regra de negócio: Todo funcionário padrão terá uma bonificação de 10%
	// no salário
	
	public Funcionario() {}
	
	public double getBonificacao() {
		return this.salario * 0.1; 
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
