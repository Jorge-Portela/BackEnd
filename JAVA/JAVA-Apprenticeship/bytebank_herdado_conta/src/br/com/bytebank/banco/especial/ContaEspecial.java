package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	public static void main(String[] args) {
		
		ContaEspecial ce = new ContaEspecial(555, 2356);
		ce.deposita(200);
		System.out.println(ce.getSaldo());  
	 } 
	
}

 
