package bytebank_herdado;
//Gerente eh Autenticavel e herda os métodos da interface Autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método bonificacao do GERENTE");
		return  super.getSalario(); 
		
	}
	
	
}


