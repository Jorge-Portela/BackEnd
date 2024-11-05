package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collection;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayList {
	
	    public static void main(String[] args) {

	        ArrayList<Conta> lista = new ArrayList<Conta>();
	        //List<Conta> lista = new LinkedList<Conta>(); //lista linkada
	        //Collection<Conta> lista = new Vector<Conta>(); //usa array por baixo,
	                                                 //mas tbm é threadsafe

	        Conta cc = new ContaCorrente(22, 11);
	        lista.add(cc);

	        Conta cc2 = new ContaCorrente(22, 22);
	        lista.add(cc2);

	        System.out.println("Tamanho: " + lista.size());

	        Conta ref = lista.get(0);
	        System.out.println(ref.getNumero());

	        lista.remove(0);
	        System.out.println("Tamanho: " + lista.size());

	        Conta cc3 = new ContaCorrente(33, 311);
	        lista.add(cc3);

	        Conta cc4 = new ContaCorrente(33, 322);
	        lista.add(cc4);

	        for(int i = 0; i < lista.size(); i++) {
	            Object oRef = lista.get(i);
	            System.out.println(oRef);
	        }

	        System.out.println("----------");

	        for(Object oRef : lista) {
	            System.out.println(oRef);
	        }

	    }

}
