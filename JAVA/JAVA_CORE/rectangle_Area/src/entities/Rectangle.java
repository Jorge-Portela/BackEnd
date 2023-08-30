package entities;

public class Rectangle {
	/*
	 * Fazer um programa para ler os valores da largura e altura 
	 * de um retângulo. Em seguida, mostrar na tela o valor de 
	 * sua área, perímetro e diagonal. Usar uma classe como 
	 * mostrado no projeto ao lado.
	 * 
	 * Write a program to read the width and height values
	 * of a rectangle. Then show on the screen the value of
	 * its area, perimeter and diagonal. Use a class like
	 * shown in the project opposite.
	 */
	
	public double width;
	public double height;
	
	public double area(double width, double height) {
		return this.width * this.height;
	}
	
	public double perimeter(double width, double height) {
		return 2*(this.width + this.height);
	}
	
	public double diagonal(double width, double height) {
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	}
	
	public String toString() {
		return "\nAREA = "
			   + String.format("%.2f", area(this.width, this.height)) 
			   +"\nPERIMENTER = "
			   + String.format("%.2f", perimeter(this.width, this.height)) 
			   +"\nDIAGONAL = " 
			   + String.format("%.2f", diagonal(this.width, this.height));
	}
	
}
