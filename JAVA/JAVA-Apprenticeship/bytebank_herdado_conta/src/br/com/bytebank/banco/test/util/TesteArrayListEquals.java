package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {

		 ArrayList<Conta> lista = new ArrayList<Conta>();

		    Conta cc1 = new ContaCorrente(22, 22);
		    Conta cc2 = new ContaCorrente(22, 22);

		    lista.add(cc1);
		    
		    boolean existe = lista.contains(cc2); //novo

		    System.out.println("Já existe? " + existe);
		    
		    
		    for(Conta conta : lista){
		        System.out.println(conta);
		    }
		
        
		     boolean igual = cc1.equals(cc2);
		    System.out.println(igual); //deve imprimir true

        
        

    }


}
