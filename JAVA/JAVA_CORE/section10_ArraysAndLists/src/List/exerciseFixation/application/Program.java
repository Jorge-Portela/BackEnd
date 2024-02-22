package List.exerciseFixation.application;

import List.exerciseFixation.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        // PART 1 - READING DATA:

        System.out.print("How many employees will be registered? ");
        int n = reader.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = reader.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = reader.nextInt();
            }

            System.out.print("Name: ");
            reader.nextLine();
            String name = reader.nextLine();
            System.out.print("Salary: ");
            double salary = reader.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = reader.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = reader.nextDouble();
            emp.increaseSalary(percentage);
        }

        // PART 3 - LISTING EMPLOYEES:

        System.out.println();
        System.out.println("List of employees:");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        reader.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
