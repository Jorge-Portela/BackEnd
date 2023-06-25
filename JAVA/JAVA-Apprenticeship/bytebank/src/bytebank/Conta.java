package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String nome;

	public void deposita(double valor) {

		this.saldo += valor;

	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}
}
