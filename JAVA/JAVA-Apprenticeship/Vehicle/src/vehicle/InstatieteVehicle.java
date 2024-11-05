package vehicle;

public class InstatieteVehicle {
	
	public static void main(String[] args) {
		Vehicle corolla = new Vehicle();
		
		//corolla.speedUp(07);
		//corolla.applyBreak(10);
		corolla.changeGear(3);
		corolla.insertBrand("Toyota");
		corolla.insertModel("Corolla XEi");
		corolla.insertColor("Silver");
		corolla.printState();
		corolla.currentSpeed(10, 15);
		
		
		
		
	}

}
