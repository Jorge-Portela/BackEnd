package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = reader.nextLine();
		System.out.println("Price: ");
		product.price = reader.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = reader.nextInt();
		
		System.out.println(product);
		
		
		
		reader.close();
		
		
	}

}
