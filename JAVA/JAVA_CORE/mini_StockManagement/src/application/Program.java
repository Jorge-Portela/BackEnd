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
		System.out.print("Name: ");
		product.name = reader.nextLine();
		System.out.print("Price: ");
		product.price = reader.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = reader.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = reader.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = reader.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);

		
		reader.close();
		
		
	}

}
