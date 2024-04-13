package workingwithfiles.filereader.application;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        File file = new File("path/to/file.txt");

        System.out.println("Enter Product Name:");
        String productName = reader.nextLine();
        System.out.println("Enter product price:");
        double productPrice = reader.nextDouble();
        System.out.println("Enter product amount:");
        int productAmount = reader.nextInt();




        reader.close();
    }
}
