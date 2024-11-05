package dog;

public class InstatieteDog  {
	
	public static void main(String[] args) {
		
		Dog pitbull = new Dog();
		
		pitbull.insertBreed("Pitbull");
		pitbull.insertAge(7);
		pitbull.insertWeight(17);
		pitbull.feedTime(3);
		pitbull.makeSound("bark");
		pitbull.printState();
		pitbull.beVaccined("yes");
		
		
		
		
	}

}
