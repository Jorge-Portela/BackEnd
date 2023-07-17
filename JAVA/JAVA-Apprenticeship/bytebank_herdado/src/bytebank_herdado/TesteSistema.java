package bytebank_herdado;

public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Flavio Melo");
		g.setSenha(223);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
				
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		
	
	}
}
