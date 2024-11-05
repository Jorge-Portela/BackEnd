package draft;

import java.util.Locale;
import java.util.Scanner;

public class Draft {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		int valueOfX,valueOfY,swap,sum = 0;
		
		
		System.out.println("Enter two values: ");
		valueOfX = reader.nextInt();
		valueOfY = reader.nextInt();
		
		if(valueOfX >valueOfY) {
			swap = valueOfX;
			valueOfX = valueOfY;
			valueOfY = swap;
		}
		
		for(int i = valueOfX + 1;i < valueOfY;i++) {
			if(i % 2 != 0) {
				sum +=i;
			}
		}
		
		System.out.println("Sum of ODDs: "+sum);
		
	}

}
