package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		
		Conta[] contas = new Conta[5];
        ContaCorrente conta1 = new ContaCorrente(22, 11);
        contas[0] = conta1;

        ContaPoupanca conta2 = new ContaPoupanca(22, 22);
        contas[1] = conta2;    

        System.out.println(contas[1].getNumero());

        ContaCorrente ref = (ContaCorrente)contas[0];
        System.out.println(conta2.getNumero());
        System.out.println(ref.getNumero());
        
        
        ContaPoupanca ref2 = (ContaPoupanca)contas[1]; 
		System.out.println(ref.getSaldo());
		System.out.println(ref2.getNumero());
		
		
//		int numbers[] = {1, 4 , 3 ,8};
//		
//		System.out.println(numbers[2]);
//		System.out.println(numbers[5]);
		
		
		
	}
}
