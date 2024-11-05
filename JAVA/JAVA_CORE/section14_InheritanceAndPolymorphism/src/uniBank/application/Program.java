package uniBank.application;

import uniBank.entities.Account;
import uniBank.entities.BusinessAccount;
import uniBank.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
;

public class Program  {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List <Account> accountList = new ArrayList<>();

        accountList.add(new SavingsAccount(1001, "Maria",1000.0,0.01));
        accountList.add(new BusinessAccount(1002,"Bob",1000.0,500.0));
        accountList.add(new BusinessAccount(1003,"Felix", 4300.0, 10000.0));
        accountList.add(new SavingsAccount(1004,"Hudson",6600.0,0.03));

        // Deposit $ 10.00 in each account created
        double sum = 0.0;
        for(Account acc : accountList){
             acc.deposit(10.0);
             sum += acc.getBalance();
        }

        System.out.printf("%nTotal Balance of Accounts: $ %.2f%n ",sum);

        System.out.println();
        // Show the balance updated of every account
        for(Account acc2 :accountList){
            System.out.printf("Update Balance, %d: $ %.2f%n",acc2.getNumber(),acc2.getBalance());
        }


       /* Account acc1 = new Account(1001,"Bob Proctor",1000.0);

        Account sacc1 = new SavingsAccount(1003,"July Jimenez",1000.00,0.01);

        acc1.withdraw(50.0);

        sacc1.withdraw(50.0);

        System.out.println(acc1.getBalance());

        System.out.println(sacc1.getBalance());


        //BusinessAccount acc5 = (BusinessAccount)acc3;

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
      */
    }
}
