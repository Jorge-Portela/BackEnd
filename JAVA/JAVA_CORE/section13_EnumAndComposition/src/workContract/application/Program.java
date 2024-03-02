package workContract.application;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = reader.nextLine();

        System.out.println("\nEnter worker data: ");
        System.out.print("Name: ");
        String workerName = reader.nextLine();
        System.out.print("Level: ");
        String workerLevel = reader.nextLine();
        System.out.print("Base Salary: ");
        double workerBaseSalary = reader.nextDouble();
        System.out.print("\nHow many contracts to this worker? ");

        System.out.println("");




        reader.close();
    }
}
