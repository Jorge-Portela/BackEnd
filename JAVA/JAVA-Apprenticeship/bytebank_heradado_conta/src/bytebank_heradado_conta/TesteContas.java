package bytebank_heradado_conta;

public class TesteContas {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 2745-1);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 2635-1);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo da CC: " + cc.getSaldo());
		System.out.println("Saldo da CP: " + cp.getSaldo());
	}
}
