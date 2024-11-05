package bytebank_herdado;

public class FuncionarioInstanciado {
	public static void main(String[] args) {
		
		Gerente mark = new Gerente();
		
		mark.setNome("Mark Steel");
		mark.setCpf("55547-9");
		mark.setSalario(2800.0);
		
		System.out.println(mark.getNome());
		System.out.println(mark.getCpf());
		System.out.println(mark.getSalario());
		System.out.println(mark.getBonificacao());
		
		System.out.println();
		
		Designer stanley = new Designer();
		
		stanley.setNome("Stanley Rodgers");
		stanley.setCpf("98213-4");
		stanley.setSalario(3100.0);
		
		System.out.println(stanley.getNome());
		System.out.println(stanley.getCpf());
		System.out.println(stanley.getSalario());
		System.out.println(stanley.getBonificacao());
	}
}
