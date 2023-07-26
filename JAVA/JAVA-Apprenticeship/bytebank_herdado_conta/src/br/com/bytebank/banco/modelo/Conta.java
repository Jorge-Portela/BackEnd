package br.com.bytebank.banco.modelo;

/**
 * Classe representa uma conta no bytebank 
 * 
 * @author jorge
 * @version 0.1
 * 
 * 
 */


 public abstract class Conta { 

	protected double saldo; 
	private int agencia; 
	private int numero; 
	private Cliente titular; 
	private static int total;	
	

	/**
	 * Construtor para inicializar o objeto Conta a partir agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 * 
	 * 
	 * */
	
	public Conta( int agencia,int numero) {
		Conta.total ++; 
		this.agencia = agencia;
		this.numero = numero;
  //	this.saldo = 100;
		System.out.println("Criada conta numero: "+ this.numero	
				+ " na agencia: " + this.agencia);
		System.out.println("Total de contas criadas: " + Conta.total);
	} 
	
	
	public abstract void deposita(double valor); 
	
	
	/**
	 * Valor precisa ser menor ou igual ao saldo 
	 * 
	 * @param valor
	 * @param SaldoInfucienteException
	 * 
	 * */

	public void saca(double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 

        this.saldo -= valor;       
}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException { 
		 this.saca(valor);  
		 destino.deposita(valor);
			
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
