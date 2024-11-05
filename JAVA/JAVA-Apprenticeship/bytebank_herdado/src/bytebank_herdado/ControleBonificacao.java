package bytebank_herdado;

public class ControleBonificacao {
	
	private double soma;
	
//O método 'registra' abaixo é executável para todos as outras classes 
// instanciadas pois recebe uma referência do tipo 'Fncionario', a classe
//'super'(mãe) das outras classes. Fazendo com que ela seja a mais genérica
	
	public void registra(Funcionario funcionario1) {
		double bonificacao = funcionario1.getBonificacao();
		this.soma += bonificacao;
	}

	public double getSoma() {
		return this.soma;
	}
	
}
