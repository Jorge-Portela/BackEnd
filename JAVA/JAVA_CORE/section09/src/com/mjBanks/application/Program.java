package com.mjBanks.application;

import com.mjBanks.entities.Account;

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


        System.out.print("\nEnter initial deposit value: ");
        double initialDeposit = reader.nextDouble();

        Account account1 = new Account(accountNumber,holder,initialDeposit);



        reader.close();

    }

}
