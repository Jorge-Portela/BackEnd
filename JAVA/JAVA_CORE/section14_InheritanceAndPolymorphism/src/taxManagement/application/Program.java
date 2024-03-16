package taxManagement.application;

import taxManagement.entities.Company;
import taxManagement.entities.Individual;
import taxManagement.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int amountOfTaxPayers = reader.nextInt();
        reader.nextLine();

        for (int i = 1; i <= amountOfTaxPayers; i++) {
            System.out.println("\nTax payer #" + i + " data:");
            System.out.print("Individual or Company (i/c)? ");
            String payerType = reader.nextLine();
            if (payerType.equalsIgnoreCase("i")) {
                System.out.print("Name: ");
                String nameOfIndividual = reader.nextLine();
                System.out.print("Annual income: ");
                double incomeOfIndividual = reader.nextDouble();
                System.out.print("Health expenditures: ");
                double healthOfIndividual = reader.nextDouble();
                reader.nextLine();

                taxPayers.add(new Individual(nameOfIndividual, incomeOfIndividual, healthOfIndividual));

            } else if (payerType.equalsIgnoreCase("c")) {
                System.out.print("Name: ");
                String nameOfCompany = reader.nextLine();
                System.out.print("Annual income: ");
                double incomeOfCompany = reader.nextDouble();
                System.out.print("Number of employees: ");
                int numbOfEmploy = reader.nextInt();
                reader.nextLine();

                taxPayers.add(new Company(nameOfCompany, incomeOfCompany, numbOfEmploy));
            }
        }

        System.out.println("TAXES PAID:");

        double sumTaxes = 0.0;
        for (TaxPayer taxPayer : taxPayers) {
            System.out.printf("%n%S: $ %.2f",taxPayer.getName(),taxPayer.tax());

            sumTaxes += taxPayer.tax();
        }
        System.out.printf("%n%nTOTAL TAXES: $ %.2f",sumTaxes);





        reader.close();

    }
}
