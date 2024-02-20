package Arrays.examples.example02.entities;

public class Product {
    private String name;
    private double price;

    //general constructor
    public Product(){}

    //constructor for attributes
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

}
