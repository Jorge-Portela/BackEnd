package workingwithfiles.filereader.application;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import workingwithfiles.filereader.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        List <Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = reader.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean sucess = new File(sourceFolderStr + "/out").mkdir();

        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){



            String itemCsv = br.readLine();
            while(itemCsv != null){

                String[] fields = itemCsv.split(",");
                String productName = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(productName, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for(Product item : list){
                    bw.write(item.getProductName() + ", " + String.format("%.2f", item.getTotalPrice()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED!");
            } catch(IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        reader.close();
    }
}
