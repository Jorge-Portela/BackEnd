package fixationExercise.application;

import fixationExercise.entities.Hostel;

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

        int countRooms = 1;
        for (int i = 0; i < numbOfStudents; i++) {
            System.out.print("\nRent #" + countRooms + ": ");
            System.out.print("\nName: ");
            String name = readerString.nextLine();
            System.out.print("Email: ");
            String email = readerString.nextLine();
            System.out.print("Room: ");
            int room = readerNumb.nextInt();

            rooms[i] = new Hostel(name, email, room);

            countRooms++;
        }

        System.out.println("\nBusy rooms: ");

        for (int i = 0; i < numbOfStudents; i++) {
            System.out.println(rooms[i].getRoom()
                    + ": "
                    + rooms[i].getName()
                    + ", "
                    + rooms[i].getEmail());
        }

        readerString.close();
        readerNumb.close();

    }

}

