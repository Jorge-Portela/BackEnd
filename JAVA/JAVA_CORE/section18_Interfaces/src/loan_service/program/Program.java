package loan_service.program;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = reader.nextDouble();
        System.out.println("Months: ");
        int months = reader.nextInt();



        reader.close();

    }
}
