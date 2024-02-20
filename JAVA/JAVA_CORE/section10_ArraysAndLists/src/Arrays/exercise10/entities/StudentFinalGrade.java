package Arrays.exercise10.entities;

public class StudentFinalGrade {

    private String name;
    private double firstGrade;
    private double secondGrade;

    public StudentFinalGrade(){}

    public StudentFinalGrade(String name, double firstGrade, double secondGrade){
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }

    public String getName(){
       return this.name;
    }

    public double getFirstGrade(){
        return this.firstGrade;
    }

    public double getSecondGrade(){
        return this.secondGrade;
    }

    public double averageGrade(double firstGrade,double secondGrade){
        return (getFirstGrade() + getSecondGrade())/2;
    }

    public void approvedStudent(double firstGrade,double secondGrade){
        if(averageGrade(firstGrade, secondGrade) >= 6){
            System.out.println(getName());
        }

    }
}
