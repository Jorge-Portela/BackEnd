package Arrays.exercise03.entities;

public class PersonHeight {
    private String nameOfPerson;
    private int ageOfPerson;
    private double heightOfPerson;

    public PersonHeight(){}

    public PersonHeight(String nameOfPerson, int ageOfPerson, double heightOfPerson){
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
        this.heightOfPerson = heightOfPerson;
    }

    public String getNameOfPerson(){
        return this.nameOfPerson;
    }

    public int getAgeOfPerson(){
        return this.ageOfPerson;
    }

    public double getHeightOfPerson(){
        return this.heightOfPerson;
    }



    public void filterNameAge(int ageOfPerson){
            if(ageOfPerson < 16){
                System.out.println(getNameOfPerson());
            }
    }




}
