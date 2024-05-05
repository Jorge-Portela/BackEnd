package loan_service.program;


import loan_service.entities.BrazilInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = reader.nextDouble();
        System.out.print("Months: ");
        int month = reader.nextInt();

        BrazilInterestService brist = new BrazilInterestService(2.0);
        double payment = brist.payment(amount, month);

        System.out.println("Payment after " + month + " months:");
        System.out.println(String.format("R$ %.2f",payment));

        reader.close();

    }
}
