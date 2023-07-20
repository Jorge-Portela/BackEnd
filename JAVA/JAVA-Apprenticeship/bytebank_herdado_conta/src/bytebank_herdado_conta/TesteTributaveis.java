package bytebank_herdado_conta;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1234, 4567-4);
		cc.deposita(100.0);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		
		calculadorDeImposto.registra(cc);
		calculadorDeImposto.registra(seguroDeVida);
		
		System.out.println(calculadorDeImposto.getTotalImposto());
		
		
	}

}
