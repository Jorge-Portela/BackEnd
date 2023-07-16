package bytebank_herdado;

public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente flavio = new Gerente();
		flavio.setNome("Flavio Melo");
		flavio.setSenha(223);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(flavio);
		
	
	}
}
