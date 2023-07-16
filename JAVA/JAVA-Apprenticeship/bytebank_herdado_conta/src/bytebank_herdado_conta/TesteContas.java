package bytebank_herdado_conta;

public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1111, 25678-9);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(2222, 36541-7);
		cp.deposita(200.0);
		
		cc.transfere(50.0, cp);
		
		System.out.println("Saldo da CC: " + cc.getSaldo());
		System.out.println("Saldo da CP: " + cp.getSaldo());
			
		
	}
}
