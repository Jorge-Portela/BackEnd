package bytebank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {

				

		Conta contaDaMarcela = new Conta();

		System.out.println(contaDaMarcela.getSaldo());
		
		Cliente Marcela = new Cliente();
		Marcela.setNome("Marcela Silva");
		contaDaMarcela.setTitular(Marcela);
		
		System.out.println(contaDaMarcela.setTitular().setNome());
		
	

		contaDaMarcela.setProfissao("Devops");
		

	}

}
