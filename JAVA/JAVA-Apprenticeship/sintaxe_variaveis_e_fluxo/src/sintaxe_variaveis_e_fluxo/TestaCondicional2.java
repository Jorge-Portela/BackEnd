package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testantdo Condicionais2");

		int idade = 18;
		int quantidadeDePessoas = 2;
		boolean acompanhado = quantidadeDePessoas >=2;
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Você pode entrar");
		} else {

			System.out.println("Infelizmente não pode entrar");
		}

	}

}
