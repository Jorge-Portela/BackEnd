package employeenames.application;

import employeenames.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args){

        List<Employee> list = new ArrayList<>();
        String path = " / ";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String employeeCsv = br.readLine();
            while(employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0],Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list){
                System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.getSalary()));
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
