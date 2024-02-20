package Arrays.exercise11.entities;

public class PersonData {
    private double height;
    private char gender;

    public PersonData(){}

    public PersonData(double height,char gender){
        this.height = height;
        this.gender = gender;
    }

    public double getHeight(){
        return this.height;
    }

    public char getGender(){
        return this.gender;
    }

}
