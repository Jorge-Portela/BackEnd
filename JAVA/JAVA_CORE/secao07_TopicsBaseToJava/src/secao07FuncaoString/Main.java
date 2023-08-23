package secao07FuncaoString;

public class Main {
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();//transforma as string em caixa baixa
		String s02 = original.toUpperCase();//transforma as string em caixa alta
		String s03 = original.trim();//retira os espaços vazios
		String s04 = original.substring(2); //imprime a string a partir do indice declarado
		String s05 = original.substring(2, 9);//imprime a string entre os indices 2-9
		String s06 = original.replace('a', 'x');//substitui a letra 'a' pela 'x' na String
		String s07 = original.replace("abc", "xy");//substitui uma substring por outra
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -"+original+"-");
		System.out.println("toLowerCase: -"+s01+"-");
		System.out.println("toUpperCase: -"+s02+"-");
		System.out.println("trim: -"+s03+"-");
		System.out.println("substring: "+s04+"-");
		System.out.println("substring index[2-9]: -"+s05+"-");
		System.out.println("replace: -"+s06+"-");
		System.out.println("replace: -"+s07+"-");
		System.out.println("Index of 'bc:"+i);
		System.out.println("Last index of 'bc': "+j);
	}

}
