package bytebank_herdado;
//Gerente eh um FuncionarioAutenticavel, Gerente herda da classe
//FuncionarioAutenticavel

public class Gerente extends FuncionarioAutenticavel {
	
		
	public double getBonificacao() {
		System.out.println("Chamando o método bonificacao do GERENTE");
		return  super.getSalario(); 
		
	}
	
	
}


