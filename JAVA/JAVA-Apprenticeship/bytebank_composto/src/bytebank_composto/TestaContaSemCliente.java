package bytebank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {

		Cliente Marcela = new Cliente();
		Marcela.nome = "Marcela Silva";
		

		Conta contaDaMarcela = new Conta();

		System.out.println(contaDaMarcela.saldo);
		
	

		contaDaMarcela.titular = Marcela;
		System.out.println(contaDaMarcela.titular.nome);

	}

}
