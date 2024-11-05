package example_exercise;

import java.util.Scanner;
import java.util.Locale;

public class ExampleExercise {
	public static void main(String[] args) {
		
//Write a program to read measurements of width and length of a 
//rectangular land to one decimal place, as well as the square meter
//value of the land to two decimal places.Then, the program should show
//the land area value, as well as the land price value, both with two
//decimal places, as in the example.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double widthOfLand;
		double lengthOfLand;
		double squareOfLand;
		double squarePrice;
		double priceOfLand;
		
		System.out.println("Enter the Width of Land: ");
		widthOfLand = sc.nextDouble();
		
		System.out.println("Enter the Length of Land: ");
		lengthOfLand = sc.nextDouble();
		
		System.out.println("Enter the price per square meter of land: ");
		squarePrice = sc.nextDouble();
		
		//Calculus of land area
		squareOfLand = widthOfLand * lengthOfLand;
		
		priceOfLand = squarePrice * squareOfLand;
		
		System.out.printf("Land Area: %.2f m² \n",squareOfLand);
		System.out.printf("Land Price: USD$ %.2f",priceOfLand);
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
