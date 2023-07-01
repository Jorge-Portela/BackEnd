package bytebank_encapsulado;

public class Conta { // a classe instanciou o objeto Conta

	private double saldo; // atributo saldo
	private int agencia; // atributo agencia
	private int numero; // atributo núemro
	private Cliente titular; // atríbuto titular

	// declarar os métodos: deposita, saca, transferencia para o objeto Conta

	public void deposita(double valor) { // suso do parâmetro valor junto ao tipo "dobule"
		this.saldo = this.saldo + valor; // Uso do this para envocar o método
	}

	public boolean saca(double valor) { // uso de condicional para validar se
		if (this.saldo >= valor) { // há saldo positivo para ser sacado
			this.saldo = this.saldo - valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) { // uso de condicional
		if (this.saldo >= valor) { // para validar se há saldo para transferir
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	// Inclusão de encapsulamento(GETTERS e SETTERS) para tornar a classe mais
	// segura e eficiente. Se faz necessário mudar o acesso dos atributos para
	// privado

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
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
