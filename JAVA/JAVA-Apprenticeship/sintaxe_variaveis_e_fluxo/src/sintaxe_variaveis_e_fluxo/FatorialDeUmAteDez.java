package sintaxe_variaveis_e_fluxo;

public class FatorialDeUmAteDez {
	public static void main(String[] arg) {
		
		int fatorial = 2;
		
		for(int i = 2;i< 11;i++) {
			
			fatorial *= i;
			
			System.out.println("Fatorial de " + i + " = " + fatorial + ".");
			
		}
	}

}
