package bytebank;

public class Conta {
	int saldo;
	int agencia;
	int numero;
	String nome;
	
	public void deposita(double valor){
		
	this.saldo += valor;
		
	}
}
