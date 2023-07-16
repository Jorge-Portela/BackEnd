package bytebank_herdado_conta;

public abstract class Conta { 

	protected double saldo; 
	private int agencia; 
	private int numero; 
	private Cliente titular; 
	private static int total;	
	
	
	public Conta(int agencia, int numero) {
		Conta.total ++; 
		this.agencia = agencia;
		this.numero = numero;
  //	this.saldo = 100;
		System.out.println("Criada conta numero: "+ this.numero	
				+ " na agencia: " + this.agencia);
		System.out.println("Total de contas criadas: " + Conta.total);
	} 
	
	
	public abstract void deposita(double valor); 
	

	public boolean saca(double valor) { 
		if (this.saldo >= valor) { 
			this.saldo = this.saldo - valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) { 
		if (this.saca(valor)) { 
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}



	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Apenas valor maior que 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Apenas valor maior que 0");
			return;
		}
		this.numero = numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
}
