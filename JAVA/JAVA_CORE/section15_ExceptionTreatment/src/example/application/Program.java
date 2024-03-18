package example.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        try{
            String [] vector = reader.nextLine().split(" ");
            int position = reader.nextInt();
            System.out.println(vector[position]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position entered!");
        } catch(InputMismatchException e ){
            System.out.println("Invalid type entered");
        }

        System.out.println("End of Program.");



        reader.close();
    }
}
