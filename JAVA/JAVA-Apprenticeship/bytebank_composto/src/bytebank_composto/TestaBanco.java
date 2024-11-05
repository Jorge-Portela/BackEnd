package bytebank_composto;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Conta ContaDoMarco = new Conta();
		ContaDoMarco.deposita(100);
		
		System.out.println(ContaDoMarco.getSaldo());
		
		
		
		Cliente marco = new Cliente();
		
		marco.setCpf("222.222.222-2");
		marco.setProfissao ("programador");
		
		
		
		
		
		
		
		
		 
		
	}

}
