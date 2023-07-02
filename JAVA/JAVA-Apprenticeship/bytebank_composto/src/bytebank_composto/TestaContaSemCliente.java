package bytebank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {

				
		Conta contaDaMarcela = new Conta();
		
		Cliente marcela = new Cliente();
		
		contaDaMarcela.deposita(100);
		contaDaMarcela.setSaldo(marcela);

		System.out.println(contaDaMarcela.getSaldo(marcela));
		
		
		
		
		
		
		marcela.setNome("Marcela Silva");
		
		contaDaMarcela.setTitular(marcela);
		
		System.out.println();
		
	

	
		

	}

}
