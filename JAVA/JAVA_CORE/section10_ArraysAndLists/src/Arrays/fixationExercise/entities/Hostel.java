package Arrays.fixationExercise.entities;

public class Hostel {
    private String name;
    private String email;


    public Hostel(){}

    public Hostel(String name, String email){
        this.name = name;
        this.email = email;
    }



    public String getName(){
        return name;
    }

    //If necessary to change the name host
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    //If necessary to change the email host
    public void setEmail(String email){
        this.email = email;
    }


}

