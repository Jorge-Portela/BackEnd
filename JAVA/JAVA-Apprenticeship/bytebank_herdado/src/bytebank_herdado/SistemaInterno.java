package bytebank_herdado;

// Este sistema será visualizado apenas por alguns funcionários, 
//por isso, conterá um método 'autentica()' próprio

public class SistemaInterno {

	private int senha = 222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
	

	
}
