package bytebank_composto;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	void deposita(double valor) {
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

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	
	public int getAgencia(int agencia) {
		return this.agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;			
	}
}
