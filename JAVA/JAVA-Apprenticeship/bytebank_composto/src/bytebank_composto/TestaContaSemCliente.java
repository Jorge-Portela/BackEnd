package bytebank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {

				
		Conta contaDaMarcela = new Conta();
		
		Cliente marcela = new Cliente();
		
		contaDaMarcela.deposita(100);
		
		System.out.println(contaDaMarcela.getSaldo());
		
		
				
		
		
		marcela.setNome("Marcela Silva");
		
		contaDaMarcela.setTitular(marcela);
		
		System.out.println(contaDaMarcela.getTitular().getNome());
		
	

	
		

	}

}
