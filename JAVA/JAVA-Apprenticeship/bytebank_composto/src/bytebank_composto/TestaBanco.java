package bytebank_composto;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente marco = new Cliente();
		
		marco.cpf = "222.222.222-";
		marco.profissao = "programador";
		
		
		
		
		Conta ContaDomarco = new Conta();
		marco.deposita(100);
		
		
		
		 
		
	}

}
