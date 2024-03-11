package uniBank.application;

import uniBank.entities.Account;
import uniBank.entities.BusinessAccount;
import uniBank.entities.SavingsAccount;

import java.util.Locale;
;

public class Program  {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Account acc1 = new Account(1001,"Bob Proctor",1000.0);

        Account sacc1 = new SavingsAccount(1003,"July Jimenez",1000.00,0.01);

        acc1.withdraw(50.0);

        sacc1.withdraw(50.0);

        System.out.println(acc1.getBalance());

        System.out.println(sacc1.getBalance());


        //BusinessAccount acc5 = (BusinessAccount)acc3;

     /*   if(acc3 instanceof BusinessAccount){
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
