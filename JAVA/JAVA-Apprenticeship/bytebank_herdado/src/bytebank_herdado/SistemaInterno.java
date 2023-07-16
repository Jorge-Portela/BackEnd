package bytebank_herdado;

// Este sistema será visualizado apenas por alguns funcionários, 
//por isso, conterá um método 'autentica()' próprio

public class SistemaInterno {

	private int senha = 222;
	
	public void autentica(Gerente gerente1) {
		boolean autenticou = gerente1.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	
	
	
	}
}
