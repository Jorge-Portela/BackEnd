package entities;

public class AreaRectangle {
	/*
	 * Fazer um programa para ler os valores da largura e altura 
	 * de um retângulo. Em seguida, mostrar na tela o valor de 
	 * sua área, perímetro e diagonal. Usar uma classe como 
	 * mostrado no projeto ao lado.
	 */
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2*(width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	

}
