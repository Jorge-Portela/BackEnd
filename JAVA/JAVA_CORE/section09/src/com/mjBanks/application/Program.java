package com.mjBanks.application;

import com.mjBanks.entities.Account;

import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] arg){

        Locale.setDefault(Locale.US);
        Scanner readerStr = new Scanner(System.in);
        Scanner readerNumb = new Scanner(System.in);

        Account account1;

        System.out.println("MJ BANK");

        System.out.print("Enter account number:");
        int accountNumber = readerNumb.nextInt();

        System.out.print("\nEnter account holder:");
        String holder = readerStr.nextLine();


        System.out.print("\nIs there an initial deposit (y/n): ");
        String responseInitialDeposit = readerStr.nextLine();


        double initialDeposit;
        if(responseInitialDeposit.equalsIgnoreCase("y") ){
            System.out.print("\nEnter initial deposit value: ");
            initialDeposit = readerNumb.nextDouble();
            account1 = new Account(accountNumber,holder,initialDeposit);
        }else{
            initialDeposit =0;
            account1 = new Account(accountNumber,holder);
        }


       System.out.println("\nAccount data: ");
       System.out.println(account1);

        System.out.print("\nEnter a deposit value: ");
        account1.isDeposit(readerNumb.nextDouble());

        System.out.println("\nUpdate account data:");
        System.out.println(account1);

        System.out.print("Enter a withdraw value: ");
        account1.isWithdraw(readerNumb.nextDouble());

        System.out.println("Update account data: ");
        System.out.println(account1);





       readerStr.close();
       readerNumb.close();
    }

}
