package printer_system.application;

import printer_system.entities.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = reader.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Enter the value "+(i+1)+": ");
            int value = reader.nextInt();
            ps.addValue(value);
        }

        System.out.print("The values entered: ");
        ps.print();
        System.out.println("First: " + ps.first());

        reader.close();
    }
}
