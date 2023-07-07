package bytebank_herdado;

public class FuncionarioInstanciado {
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Mark Steel");
		funcionario1.setCpf("55547-9");
		funcionario1.setSalario(2800.0);
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getCpf());
		System.out.println(funcionario1.getSalario());
		System.out.println(funcionario1.getBonificacao());
		
		System.out.println();
		
		Funcionario funcionario2 = new Funcionario();
		
		funcionario2.setNome("Stanley Rodgers");
		funcionario2.setCpf("98213-4");
		funcionario2.setSalario(3100.0);
		
		System.out.println(funcionario2.getNome());
		System.out.println(funcionario2.getCpf());
		System.out.println(funcionario2.getSalario());
		System.out.println(funcionario2.getBonificacao());
	}
}
