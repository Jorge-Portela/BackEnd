package bytebank;

public class TestaReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta.saldo);
		
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
		
		segundaConta.saldo += 100;
		
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta ) 
			
			System.out.println("é a mesma conta");
			
	
	
	}

}
