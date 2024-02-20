package Arrays.fixationExercise.application;

import Arrays.fixationExercise.entities.Hostel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner readerString = new Scanner(System.in);
        Scanner readerNumb = new Scanner(System.in);

        Hostel[] rooms = new Hostel[10];

        System.out.println("\n*** Hostel Vacancy System ***");
        System.out.print("\nHow many rooms will be rented ?: ");
        int numbOfStudents = readerNumb.nextInt();


        for (int i = 0; i < numbOfStudents; i++) {
            System.out.print("\nRent #" + (i+1) + ": ");
            System.out.print("\nName: ");
            String name = readerString.nextLine();
            System.out.print("Email: ");
            String email = readerString.nextLine();
            System.out.print("Room: ");
            int room = readerNumb.nextInt();

            rooms[room] = new Hostel(name, email);
        }

        System.out.println("\nBusy rooms: ");

        for (int i = 0; i < 10; i++) {
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i].getName()
                        + ", "
                        + rooms[i].getEmail());
            }
        }

        readerString.close();
        readerNumb.close();

    }

}

