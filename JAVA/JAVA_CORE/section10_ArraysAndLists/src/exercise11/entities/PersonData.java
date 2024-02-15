package exercise11.entities;

public class PersonData {
    private double height;
    private String gender;

    public PersonData(){}

    public PersonData(double height,String gender){
        this.height = height;
        this.gender = gender;
    }

    public double getHeight(){
        return this.height;
    }

    public String getGender(){
        return this.gender;
    }

}
