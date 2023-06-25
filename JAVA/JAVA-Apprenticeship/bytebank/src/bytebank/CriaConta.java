package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("A primeira conta possui um saldo de R$" + primeiraConta.saldo);
		System.out.println("A segunda conta possui um saldo de R$" + segundaConta.saldo);
		
		
		
		primeiraConta.saldo = 500;
		primeiraConta.agencia = 146;
		System.out.println("O saldo da primeira conta é " + primeiraConta.saldo);
		System.out.println("A agência da primeira conta é " + primeiraConta.agencia);
		
		segundaConta.saldo = 500;
		segundaConta.agencia = 146;
		System.out.println("O saldo da segunda conta é " + segundaConta.saldo);
		System.out.println("A agência de Sulacap é " + segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			
			System.out.println("mesma conta");
		} else {
			System.out.println("conta diferente");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
