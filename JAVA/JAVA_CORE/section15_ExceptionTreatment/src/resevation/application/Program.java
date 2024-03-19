package resevation.application;

import resevation.model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int numbRoom = reader.nextInt();
        reader.nextLine();
        System.out.print("Check-In date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(reader.next(),fmt);
        System.out.print("Check-Out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(reader.next(),fmt);

        Reservation reservation = new Reservation(numbRoom,checkIn,checkOut);

        System.out.println(reservation);

        System.out.println("\nEnter data to update the reservation: ");
        System.out.print("Check-In date (dd/MM/yyyy): ");
        LocalDate updatedCheckIn = LocalDate.parse(reader.next(),fmt);
        System.out.print("Check-Out date (dd/MM/yyyy): ");
        LocalDate updatedCheckOut = LocalDate.parse(reader.next(),fmt);


        reservation.updateDates(updatedCheckIn,updatedCheckOut);

        System.out.println(reservation);




        reader.close();
    }
}
