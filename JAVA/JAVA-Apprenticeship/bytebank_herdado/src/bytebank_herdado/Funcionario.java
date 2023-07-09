package bytebank_herdado;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; // a palavra chave protected faz com que somente
    //sublcasses(classes filhas) ou classes do mesmo pacote, possam ter acesso 
    //aos atributo, método ou construtores qual ela foi empregada
	
	

	// regra de negócio: Todo funcionário padrão terá uma bonificação de 10%
	// no salário
	
	public Funcionario() {}
	
	public double getBonificacao() {
		return this.salario * 0.05; 
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
