package exercise01.entities;

public class RectangleArea {

    public double width;
    public double height;

    public double isArea(double width, double height){

        return width * height;
    }

    public double isPerimeter(double width, double height){

        return 2 * (width + height);
    }

    public double isDiagonal(double width, double height){

        return Math.sqrt((Math.pow(width,2)+Math.pow(height,2)));
    }

    public String toString(){
        return "AREA = " +
        String.format("%.2f", isArea(this.width, this.height)) +
        "\nPERIMETER = " +
        String.format("%.2f", isPerimeter(this.width, this.height)) +
        "\nDiagonal = " +
        String.format("%.2f", isDiagonal(this.width, this.height));
    }
}
