package Arrays.examples.example02.application;

/*
* Make a program to read an integer N and the data (name and
* price) of N Products. Store the N products in a vector. In
* Then show the average price of the products.
*
* Fazer um programa para ler um número inteiro N e os dados (nome e
* preço) de N Produtos. Armazene os N produtos em um vetor. Em
* seguida, mostrar o preço médio dos produtos.
* */

import Arrays.examples.example02.entities.Product;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner readerNumb = new Scanner(System.in);
        Scanner readerString = new Scanner(System.in);


        System.out.print("\nEnter the quantity of product on the inputs: ");
        int n = readerNumb.nextInt();

        Product[] arrayProductPrice = new Product[n];

        int count = 1;
        for(int i = 0; i < arrayProductPrice.length; i++){
            System.out.println("\n*** INPUT "+ count+ " ***");

            System.out.print("Enter the Product name: ");
            String nameOfProduct = readerString.nextLine();

            System.out.print("Enter the Product Price: ");
            double priceOfProduct = readerNumb.nextDouble();

            arrayProductPrice [i] = new Product(nameOfProduct,priceOfProduct);

            count++;
        }

        double sum = 0.0;
        for(int i = 0;i < arrayProductPrice.length;i++){
            sum += arrayProductPrice[i].getPrice();
        }

        double average = sum/n;

        System.out.printf("\nAVERAGE PRODUCTS PRICE: $ %.2f",average);

        readerNumb.close();
        readerString.close();
    }
}
