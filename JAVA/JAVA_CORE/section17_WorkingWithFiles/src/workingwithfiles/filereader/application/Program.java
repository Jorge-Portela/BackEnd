package workingwithfiles.filereader.application;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        File file = new File("/home/jorge-portela/Documents/create_file_project/product.csv");

        System.out.println("How much products will be entered? ");
        int numbInput = reader.nextInt();
        reader.nextLine();

        String[][] products = new String[numbInput][numbInput];

        for(int i = 1; i <= numbInput; i++){
            for (int j = 1; j<=numbInput; j++){
                System.out.println("Enter Product Name:");
                String productName = reader.nextLine();
                System.out.println("Enter product price:");
                double productPrice = reader.nextDouble();
                System.out.println("Enter product amount:");
                int productAmount = reader.nextInt();

            }
        }





        reader.close();
    }
}
