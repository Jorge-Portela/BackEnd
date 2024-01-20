package exercise3.entities;

public class Grade {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;


    public double calculateFinalGrade(){
        double totalGrade;
        return totalGrade = (this.firstGrade + this.secondGrade + this.thirdGrade);
    }

    public void validateGrade(){
        System.out.print("RESULT: ");
        if(calculateFinalGrade() > 60){
            System.out.println(" PASS ");
        }else{
            double missingPoints = 60 - calculateFinalGrade();
            System.out.println(" FAIL | MISSING: "+ missingPoints+ " POINTS TO APPROVAL ");
        }
    }

    public String toString(){
        return this.name
                + " FINAL GRADE = "
                + calculateFinalGrade();

    }
}
