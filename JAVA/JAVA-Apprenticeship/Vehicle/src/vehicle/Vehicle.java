package vehicle;

public class Vehicle {

	int speed;
	int gear;
	int acceleration;
	String color;
	String brand;
	String model;
	
	


	public boolean currentSpeed(int speed,int acceleration) {
		if(this.speed >= this.acceleration) {
			 this.speed -= this.acceleration;
			 return true;
		} else {
			System.out.println("Braking factor is greater than current speed");
			return false;
		}
	}

	void changeGear(int newValue) {
		gear = newValue;
	}

	void insertColor(String newValue) {
		color = newValue;
	}

	void insertBrand(String newValue) {
		brand = newValue;
	}

	void insertModel(String newValue) {
		model = newValue;
	}

	void printState() {
		System.out.println("gear: " + gear);
		System.out.println("color: " + color);
		System.out.println("brand: " + brand);
		System.out.println("model: " + model);
	}
}
