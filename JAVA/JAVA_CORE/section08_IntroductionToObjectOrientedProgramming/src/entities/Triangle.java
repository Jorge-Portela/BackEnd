package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	
	public double area() {
		double pX = (a + b + c) / 2;
		return  Math.sqrt(pX * (pX - a) * (pX - b) * (pX - c));
	}
}
