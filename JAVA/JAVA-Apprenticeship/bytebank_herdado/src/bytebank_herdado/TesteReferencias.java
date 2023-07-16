package bytebank_herdado;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Rogerio");
		gerente1.setSalario(5000.0);
		
		
		EditorVideo editorDeVideo1 = new EditorVideo();
		editorDeVideo1.setSalario(2500.0);
		
		Designer designer1 = new Designer();
		designer1.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente1);
		controle.registra(editorDeVideo1);
		controle.registra(designer1);
		
		
		System.out.println(controle.getSoma());
		
		
	}

}
