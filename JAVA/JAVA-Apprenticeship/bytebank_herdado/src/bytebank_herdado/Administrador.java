package bytebank_herdado;

public class Administrador extends Funcionario {

	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	
	@Override
	public double getBonificacao() {
		
		return 50;
	}
	
	

}
