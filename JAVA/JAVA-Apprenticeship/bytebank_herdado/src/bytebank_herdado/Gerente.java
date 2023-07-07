package bytebank_herdado;
//Classe Gerente é filha da Classe Funcionário na relação de Herança
public class Gerente extends Funcionario {
	
	private int senha; //atributo carterístico da classe Gerente
	
	public Gerente() {}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Senha CORRETA.");
			return true;
		} else {
			System.out.println("Senha INCORRETA. Tente Novamente");
			return false;
		}
	}
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	
}