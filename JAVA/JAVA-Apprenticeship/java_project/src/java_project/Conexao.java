package java_project;

public class Conexao implements AutoCloseable {
	
	public Conexao() {
	System.out.println("Abrindo Conexao");
	}
	
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();

	}
	
//	public void fecha() {
//		System.out.println("Fechando conexao");
//	}
	
	@Override
	public void close() throws Exception {
	System.out.println("Fechando Conexao");		
	}
}
