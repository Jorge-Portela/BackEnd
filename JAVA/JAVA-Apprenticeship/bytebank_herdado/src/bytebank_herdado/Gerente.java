package bytebank_herdado;
//Gerente eh Autenticavel e herda os métodos da interface Autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método bonificacao do GERENTE");
		return  super.getSalario(); 
		
	}
	
	
}


