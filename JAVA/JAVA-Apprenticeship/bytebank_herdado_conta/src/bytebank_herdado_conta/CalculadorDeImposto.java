package bytebank_herdado_conta;

public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel tributo) {
		double valorDeImposto = tributo.getValorImposto();
		this.totalImposto += valorDeImposto;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
