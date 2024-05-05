package loan_service.program;


import loan_service.entities.BrazilInterestService;
import loan_service.entities.UsaInterestService;

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

        UsaInterestService usaist = new UsaInterestService(1.0);
        double payment = usaist.payment(amount, month);

        System.out.println("Payment after " + month + " months:");
        System.out.println(String.format("R$ %.2f",payment));

        reader.close();

    }
}
