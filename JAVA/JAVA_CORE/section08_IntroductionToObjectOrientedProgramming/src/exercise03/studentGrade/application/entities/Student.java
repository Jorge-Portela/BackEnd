package exercise03.studentGrade.application.entities;

public class Student {
	public String studentName;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;

	public double calculateFinalGrade() {
		return this.firstGrade + this.secondGrade + this.thirdGrade;
	}

	public void validateGrade() {
		if (calculateFinalGrade() < 60) {
			System.out.printf("\nFINAL GRADE = %.2f", calculateFinalGrade());
			System.out.println("\nFAILED");
			double missingPointsGrade = 60 - calculateFinalGrade();
			System.out.printf("MISSING %.2f POINTS", missingPointsGrade);

		} else {
			System.out.printf("\n\nFINAL GRADE = %.2f", calculateFinalGrade());
			System.out.println("\nPASS");

		}
	}

}
