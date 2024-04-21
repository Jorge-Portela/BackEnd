package payment_contract_system.application;

import payment_contract_system.entities.Contract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;


public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = reader.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(reader.next(),fmt);
        System.out.print("Contract value: ");
        double contractValue = reader.nextDouble();

        Contract contract = new Contract(number, date, contractValue);

        System.out.print("Enter number of installments: ");
        int installments = reader.nextInt();

        reader.close();

    }
}
