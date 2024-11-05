package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 17;
		int quantidadeDePessoas = 3;

		boolean acompanhado;

		if (quantidadeDePessoas >= 2) {

			acompanhado = true;

		} else {

			acompanhado = false;

		}

		System.out.println("Valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {

			System.out.println("Seja bem vindo!");

		} else {

			System.out.println("Infelizmente você não pode entrar");

		}

	}

}
