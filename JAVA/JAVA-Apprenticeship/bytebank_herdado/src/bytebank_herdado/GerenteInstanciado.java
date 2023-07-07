package bytebank_herdado;

public class GerenteInstanciado {
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		
		gerente1.setNome("Claudio Barbosa");
		gerente1.setCpf("25987-7");
		gerente1.setSalario(8900.0);
		
		gerente1.setSenha(77778);
		
		boolean autenticado = gerente1.autentica(77778);
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());
		System.out.println(autenticado);
		
		
	}
}
