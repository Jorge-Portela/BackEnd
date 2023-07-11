package bytebank_herdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente(); // Aplicamos o tipo Funcionario
		//(genericoo) ao objeto Gerente com uma forma de polimorfismo. 
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Pedro");
		gerente1.setSalario(5000.0);
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setSalario(2000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente1);
		
		System.out.println(controle.getSoma());
		
		
	}
}
