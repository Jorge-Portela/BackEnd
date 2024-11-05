package bankAccount.application;

import bankAccount.model.entities.Account;
import bankAccount.model.exception.AccountException;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = reader.nextInt();
            reader.nextLine();
            System.out.print("Holder: ");
            String name = reader.nextLine();
            System.out.print("Initial balance: ");
            double initBalance = reader.nextDouble();
            System.out.print("Withdraw limit: ");
            double withLimit = reader.nextDouble();

            Account acc1 = new Account(number,name,initBalance,withLimit);

            System.out.print("\nEnter amount for withdraw: ");

            acc1.withdraw(reader.nextDouble());
            System.out.println(acc1);
        } catch (AccountException e) {

            System.out.println("Withdraw: " + e.getMessage());
            System.exit(0);
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error");
            System.exit(0);
        }


        reader.close();
    }
}
