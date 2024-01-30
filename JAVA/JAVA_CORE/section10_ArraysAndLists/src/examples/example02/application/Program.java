package examples.example02.application;

/*
* Make a program to read an integer N and the data (name and
* price) of N Products. Store the N products in a vector. In
* Then show the average price of the products.
*
* Fazer um programa para ler um número inteiro N e os dados (nome e
* preço) de N Produtos. Armazene os N produtos em um vetor. Em
* seguida, mostrar o preço médio dos produtos.
* */

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner readerInt = new Scanner(System.in);
        Scanner readerString = new Scanner(System.in);
        Scanner readerDouble = new Scanner(System.in);

        System.out.print("\nEnter the quantity of product on the inputs: ");
        int n = readerInt.nextInt();

        double[] vector = new double[n];

        int count = 1;
        for(int i = 0; i<vector.length;i++){
            System.out.println("\n*** INPUT "+ count+ " ***");

            System.out.print("Enter the Product name: ");
            String nameOfProduct = readerString.nextLine();

            System.out.print("Enter the Product Price: ");
            vector[i] = readerDouble.nextDouble();

            count++;
        }

        double sum = 0;
        for(int i = 0;i<vector.length;i++){
            sum += vector[i];
        }

        double average = sum/n;

        System.out.printf("\nAVERAGE PRODUCTS PRICE: $ %.2f",average);

        readerInt.close();
        readerString.close();
        readerDouble.close();
    }
}
