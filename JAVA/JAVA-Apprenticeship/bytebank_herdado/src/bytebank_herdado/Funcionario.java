package bytebank_herdado;

// não podemos instanciar essa classe, pois a mesma é do tipo abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; // a palavra chave protected faz com que somente
    //sublcasses(classes filhas) ou classes do mesmo pacote, possam ter acesso 
    //aos atributo, método ou construtores qual ela foi empregada
	
	

	// regra de negócio: Todo funcionário padrão terá uma bonificação de 10%
	// no salário
	
	public Funcionario() {}
	
	// metodo sem corpo, nao ha implementacao
	
	public abstract double getBonificacao(); 
	 


	
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
