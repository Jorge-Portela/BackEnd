package geometricShapes.application;

import geometricShapes.entities.Circle;
import geometricShapes.entities.Rectangle;
import geometricShapes.entities.Shape;
import geometricShapes.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int amountOfShapes = reader.nextInt();
        reader.nextLine();

        for (int i = 1; i <= amountOfShapes; i++) {
            System.out.println("\nShape # " + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            String typeOfShape = reader.nextLine();
            if (typeOfShape.equalsIgnoreCase("r")) {
                System.out.print("Color (BLACK/BLUE/RED): ");
                String colorOfRectangle = reader.nextLine();
                System.out.print("Width: ");
                double widthOfRectangle = reader.nextDouble();
                System.out.print("Height: ");
                double heightOfRectangle = reader.nextDouble();
                reader.nextLine();

                shapes.add(new Rectangle(Color.valueOf(colorOfRectangle),widthOfRectangle,heightOfRectangle));
            } else if (typeOfShape.equalsIgnoreCase("c")) {
                System.out.print("Color (BLACK/BLUE/RED): ");
                String colorOfCircle = reader.nextLine();
                System.out.print("Radius: ");
                double widthOfCircle = reader.nextDouble();
                reader.nextLine();
                shapes.add(new Circle(Color.valueOf(colorOfCircle),widthOfCircle));
            }
        }

        System.out.println("\nSHAPE AREAS: ");
        for( Shape shapeArea : shapes){
            System.out.printf("COLOR: %S  | AREA: %.2f%n",shapeArea.getColor(), shapeArea.area());
        }

        reader.close();

    }
}
