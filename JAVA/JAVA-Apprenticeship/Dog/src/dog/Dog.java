package dog;

public class Dog implements BehaviorDog {
	
	String breed;
	String sound;
	String vaccined = "yes";
	int age;
	int amountEatTime;
	double weight;
	
	
	void insertBreed(String newBreed) {
		breed = newBreed;
	}

	void insertWeight(double newWeight) {
		weight = newWeight;
	}
	
	void insertAge(int newAge) {
		age = newAge;
	}
	
	@Override
	public void makeSound(String newSound) {
		sound = newSound;
	}
	
	@Override
	public boolean beVaccined(String newVaccined) {
		if(vaccined == newVaccined) {
			System.out.println("Dog is VACCINED");
			return true;
		} else {
			System.out.println("Dog DOES NOT vaccined");
			return false;
		}
		
	}
	
	@Override
	public void feedTime(int newAmountEatTime) {
		amountEatTime = newAmountEatTime;
	}
	
	void printState() {
		System.out.println("Dog breed: " + breed);
		System.out.println("Dog wight: " + weight + "Kg");
		System.out.println("Dog ages: " + age);
		System.out.println("Dog sound: " + sound);
		System.out.println("The Dog eats " + amountEatTime + " times a day");
	}
}
