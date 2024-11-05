package commercialProduct.application;

import commercialProduct.entities.ImportedProduct;
import commercialProduct.entities.Product;
import commercialProduct.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int amountOfProduct = reader.nextInt();

        for(int i = 1; i <= amountOfProduct;i++){
            System.out.println("\nProduct #"+i+" data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            reader.nextLine();
            String typeOfProduct = reader.nextLine();
            if(typeOfProduct.equalsIgnoreCase("c")){
                System.out.print("Name: ");
                String nameOfProduct = reader.nextLine();
                System.out.print("Price: ");
                double priceOfProduct = reader.nextDouble();

                Product comp = new Product(nameOfProduct,priceOfProduct);
                products.add(comp);
            } else if(typeOfProduct.equalsIgnoreCase("u")){
                System.out.print("Name: ");
                String nameOfProduct = reader.nextLine();
                System.out.print("Price: ");
                double priceOfProduct = reader.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                reader.nextLine();
                LocalDate manuProduct = LocalDate.parse(reader.next(),fmt1) ;

                Product usp = new UsedProduct(nameOfProduct,priceOfProduct,manuProduct);
                products.add(usp);
            } else if (typeOfProduct.equalsIgnoreCase("i")) {
                System.out.print("Name: ");
                String nameOfProduct = reader.nextLine();
                System.out.print("Price: ");
                double priceOfProduct = reader.nextDouble();
                System.out.print("Customs fee: ");
                double feeOfProduct = reader.nextDouble();

                Product imp = new ImportedProduct(nameOfProduct,priceOfProduct,feeOfProduct);
                products.add(imp);
            }
        }

        System.out.println("\nPRICE TAGS:");

        for(Product prod: products){
            System.out.println(prod.priceTag());
        }

        reader.close();


    }
}
