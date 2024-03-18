package example.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        method1();

        System.out.println("End of Program.");


    }

    public static void method1(){
        System.out.println("***METHOD 1 START  ***");

        method2();

        System.out.println("***METHOD 1 START  ***");
    }
    public static void method2(){
        System.out.println("***METHOD 2 START***");
        Scanner reader = new Scanner(System.in);
        try{
            String [] vector = reader.nextLine().split(" ");
            int position = reader.nextInt();
            System.out.println(vector[position]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position entered!");
            e.printStackTrace();
            reader.next();
        } catch(InputMismatchException e ){
            System.out.println("Invalid type entered");
            e.printStackTrace();
        }

        System.out.println("***METHOD 2 END***");

        reader.close();
    }
}
