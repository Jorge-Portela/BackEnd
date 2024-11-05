package loan_service.program;


import loan_service.entities.BrazilInterestService;
import loan_service.entities.InterestService;
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

        System.out.println("\n=========================\n");

        InterestService usaist = new UsaInterestService(1.0);
        double paymentUsaist = usaist.payment(amount, month);

        System.out.println("USA Interest Rate: 1%");
        System.out.println("Payment after " + month + " months:");
        System.out.println(String.format("TOTAL: US $ %.2f",paymentUsaist));

        System.out.println("\n---------------------------\n");

        InterestService brist = new BrazilInterestService(2.0);
        double paymentBrist = brist.payment(amount, month);

        System.out.println("Brazilian Interest Rate: 2%");
        System.out.println("Payment after " + month + " months:");
        System.out.println(String.format("TOTAL: R$ %.2f",paymentBrist));

        reader.close();

    }
}
