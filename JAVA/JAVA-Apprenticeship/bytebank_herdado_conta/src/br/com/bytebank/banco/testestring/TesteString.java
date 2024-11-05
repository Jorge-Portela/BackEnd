package br.com.bytebank.banco.testestring;

public class TesteString {
	public static void main(String[] args) {
		
		String animal = "dog";
		String vehicle = new String("car");
		
		System.out.println(animal + "\n" + vehicle);
	//------------------------------------------------//
		
		String name = "Pablo";
		name = name.replace("b", "v");
		
		String surname = "Piccaso";
		String newSurname = surname.replace("P", "V");
		
		System.out.println("before the 'replace' method: "
		+ surname + "\n" +"after the 'replace' method: " + newSurname );
	//-----------------------------------------------------//
		
		String typeOfBottle = "Glass";
		String newTypeOfbottle = typeOfBottle.toLowerCase();
		
		System.out.println(typeOfBottle.toUpperCase());
		System.out.println(newTypeOfbottle);
	//--------------------------------------------------------//
		
		String brand = "Armani";
		
		System.out.println(brand.charAt(3));
		
		String newBrand = "Kenzo";
		
		System.out.println(newBrand.indexOf('e'));
		System.out.println(newBrand.substring(1));
		
		for(int i = 0; i< brand.length();i++) {
				System.out.println(brand.charAt(i));
		}
		
		//-----------------------------------------------//
		
		String nome = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nome = nome.replace("AL", cs);

		System.out.println(nome);
		
		
		
		
	}

}
