package workContract.entities;

public class Department {
    private String name;

    public Department(){}

    public Department(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void getName(String name){
        this.name = name;
    }


}
