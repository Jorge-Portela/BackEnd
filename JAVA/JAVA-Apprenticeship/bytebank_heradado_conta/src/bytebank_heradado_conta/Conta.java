package bytebank_heradado_conta;

public class Conta { // a classe instanciou o objeto Conta

	private double saldo; // atributo saldo
	private int agencia; // atributo agencia
	private int numero; // atributo núemro
	private Cliente titular; // atríbuto titular
	private static int total;//inserido a palavra-chave "static", para que o atributo "total" seja da classe
							 //geral e não apenas de uma determinada instância

	
	
	
	public Conta(int agencia, int numero) {
		Conta.total ++; // adicionamos a classe geral "Conta" e não o "this" na variável "total" para
		// referência-la para a classe "Conta" em geral e não apenas à uma instanciação
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100; // isso sognofoca que toda conta começa com 100 de saldo
		System.out.println("Criada conta numero: "+ this.numero	
				+ " na agencia: " + this.agencia);
		System.out.println("Total de contas criadas: " + Conta.total);
	} 
	
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
