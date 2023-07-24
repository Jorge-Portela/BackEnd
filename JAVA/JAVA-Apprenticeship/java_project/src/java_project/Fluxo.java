package java_project;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try{
			metodo1();			
		}catch( Exception ex) {
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
		}catch(Exception ex) {
			System.out.println("ArithmeticExcepetion");
		} 
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Ini do metodo2");
			Conta c = null;
			
			try {
				c.deposita();
						
			} catch(Exception ex){
				System.out.println("ArithmeticException");
			}
		
		System.out.println("Fim do metodo2");
	}

}
