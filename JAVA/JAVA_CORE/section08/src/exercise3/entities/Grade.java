package exercise3.entities;

public class Grade {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;


    public double calculateFinalGrade(){
        double totalGrade;
        return totalGrade = (firstGrade + secondGrade + thirdGrade);
    }




    public String toString(){
        return this.name
                + " FINAL GRADE = "
                + calculateFinalGrade()
                +" ";

    }

}
