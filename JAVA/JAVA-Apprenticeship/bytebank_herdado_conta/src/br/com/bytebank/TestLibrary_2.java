package br.com.bytebank;

import br.com.bytebank.banco.modelo.Conta;  
import br.com.bytebank.banco.modelo.ContaCorrente;


public class TestLibrary_2 {
	
	public static void main(String[] args) {
		Conta account = new ContaCorrente(321, 9874);
		
		account.deposita(200.3);
		
		System.out.println(account.getSaldo());
	}
	
	
}
