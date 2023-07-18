package bytebank_herdado;

public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Flavio Melo");
		g.setSenha(222);
		
		Administrador adm = new Administrador();
		adm.setSenha(333);
		
		Autenticavel referencia = new Cliente();
		
		AutenticacaoUtil autl = new AutenticacaoUtil();
		
			
		
				
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		
		
	
	}
}
