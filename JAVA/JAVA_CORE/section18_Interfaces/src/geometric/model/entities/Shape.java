package geometric.model.entities;



public abstract class Shape {

    private Color color;

    private Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public abstract double area();

}
