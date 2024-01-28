package com.mjBanks.application;

import com.mjBanks.entities.Account;


import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] arg){

        Locale.setDefault(Locale.US);
        Scanner readerStr = new Scanner(System.in);
        Scanner readerNumb = new Scanner(System.in);

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
        }else{
            initialDeposit =0;
        }





       Account account1 = new Account(accountNumber,holder,initialDeposit);

       System.out.println("Account data: ");
       System.out.println(account1);




       readerStr.close();
       readerNumb.close();
    }

}
