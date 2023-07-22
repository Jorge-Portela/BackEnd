package java_project;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try{
			metodo1();			
		}catch(ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try{
			metodo2();
		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticExcepetion");
		} 
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			Conta c = null;
			c.deposita();
			try {
				int a = i / 0;				
			} catch(ArithmeticException ex){
				System.out.println("ArithmeticException");
			}
		}
		System.out.println("Fim do metodo2");
	}

}
