package printer_system.application;

import printer_system.entities.PrintService;

import java.util.Locale;
import java.util.Scanner;

/*
* Write a program that reads a quantity of N, and then N integers.
* Finally, print these numbers in an organized way as per the example.
* Then, inform the value entered.
* */


public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        PrintService<String> pss = new PrintService<>();

        System.out.print("How many values? ");
        int n = reader.nextInt();

        reader.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.print("Enter the value "+(i)+": ");
            String value = reader.nextLine();
            pss.addValue(value);
        }

        System.out.print("\nValues entered: ");
        pss.print();

        System.out.print("\nFirst value entered: ");
        pss.first();

        reader.close();
    }
}
