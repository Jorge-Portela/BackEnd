package workContract.application;

import workContract.entities.Department;
import workContract.entities.HourContract;
import workContract.entities.Worker;
import workContract.entities.enums.WorkerLevel;


import java.text.ParseException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = reader.nextLine();

        System.out.println("\nEnter worker data: ");
        System.out.print("Name: ");
        String workerName = reader.nextLine();
        System.out.print("Level: ");
        String workerLevel = reader.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = reader.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("\nHow many contracts to this worker? ");
        int amountContracts = reader.nextInt();

        for(int i = 1; i <= amountContracts; i++ ){
            System.out.print("Enter contract #"+ i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            String contractDate = reader.next();
            System.out.println("Value per hour: ");
            double valuePerHour = reader.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = reader.nextInt();
            HourContract contract = new HourContract(LocalDate.parse(contractDate,formatterDate), valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = reader.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year,month)));

        reader.close();
    }
}
