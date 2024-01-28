package com.mjBanks.application;

import com.mjBanks.entities.Account;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] arg){

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.println("MJ BANK");

        System.out.print("Enter account number:");
        int accountNumber = reader.nextInt();

        System.out.print("\nEnter account holder:");
        String holder = reader.nextLine();

        System.out.print("\nIs there an initial deposit (y/n): ");
        String responseInitialDeposit = reader.nextLine();

        double initialDeposit;
        if(responseInitialDeposit == "y"){
            System.out.print("\nEnter initial deposit value: ");
            initialDeposit = reader.nextDouble();
        }else{
            initialDeposit =0;
        }


        Account account1 = new Account(accountNumber,holder,initialDeposit);

       System.out.println("Account data: ");
       System.out.println("Account: " + account1.getAccountNumber()
                            + ", Holder: " + account1.getHolder()
                            + ", Balance: $ "
                            + String.format("%.2f",  ));

        reader.close();

    }

}
