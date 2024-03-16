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
            System.out.print("Name: ");
            String name = reader.nextLine();
            System.out.print("Annual income: ");
            double income = reader.nextDouble();
            reader.nextLine();
            if (payerType.equalsIgnoreCase("i")) {
                System.out.print("Health expenditures: ");
                double healthOfIndividual = reader.nextDouble();
                reader.nextLine();

                taxPayers.add(new Individual(name, income, healthOfIndividual));
            } else if (payerType.equalsIgnoreCase("c")) {
                System.out.print("Number of employees: ");
                int numbOfEmploy = reader.nextInt();
                reader.nextLine();

                taxPayers.add(new Company(name, income, numbOfEmploy));
            }
        }

        System.out.println("\nTAXES PAID:");
        double sumTaxes = 0.0;
        for (TaxPayer taxPayer : taxPayers) {
            System.out.println(taxPayer);
            sumTaxes += taxPayer.tax();
        }

        System.out.printf("%nTOTAL TAXES: $ %.2f", sumTaxes);

        reader.close();
    }
}
