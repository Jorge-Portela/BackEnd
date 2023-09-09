package exercise03_studentGrade.application.entities;

public class Student {
	public String studentName;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	public double finalGrade;

	public Student() {
	};

	public double calculateFinalGrade(double firstGrade, double secondGrade, double thirdGrade) {
		return this.finalGrade = this.firstGrade + this.secondGrade + this.thirdGrade;
	}

	public void validateGrade() {
		if (calculateFinalGrade(this.firstGrade, this.secondGrade, this.thirdGrade) < 60) {
			System.out.printf("\nFINAL GRADE = %.2f", this.finalGrade);
			System.out.println("\nFAILED");
			double missingPointsGrade = 60 - this.finalGrade;
			System.out.printf("MISSING %.2f POINTS", missingPointsGrade);

		} else {
			System.out.printf("\n\nFINAL GRADE = %.2f", this.finalGrade);
			System.out.println("\nPASS");

		}
	}

}
