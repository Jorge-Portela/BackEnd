package employeerPayment.application;

import employeerPayment.entities.Employee;
import employeerPayment.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int amountEpm  = reader.nextInt();
        reader.nextLine();

        List<Employee> emp = new ArrayList<>();
        for(int i = 1; i <=amountEpm;i++){
            System.out.println("\nEmployee #"+i+" data:");
            System.out.print("Outsourced (y/n)? ");
            String outsourceEmp = reader.nextLine();
            System.out.print("Name: ");
            String employerName = reader.nextLine();
            System.out.print("Hours: ");
            int hour = reader.nextInt();
            System.out.print("Value per hour: ");
            double hourValue = reader.nextDouble();
            reader.nextLine();
            if(outsourceEmp.equalsIgnoreCase( "y")){
                System.out.print("Additional charge: ");
                double addChOutEmp = reader.nextDouble();
                reader.nextLine();
                emp.add(new OutsourceEmployee(employerName,hour,hourValue,addChOutEmp));
            } else {

                emp.add(new Employee(employerName,hour,hourValue));
            }
        }

        double sumPayment = 0;
        System.out.println("\nPAYMENTS:");
        for(Employee o : emp){
            System.out.println(o.getName() + ": $"+o.payment());
            sumPayment += o.payment();
        }
        System.out.printf("\nTOTAL PAYMENTS: $ %.2f",sumPayment);

        reader.close();

    }
}
