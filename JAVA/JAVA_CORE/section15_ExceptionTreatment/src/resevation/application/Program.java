package resevation.application;

import resevation.model.entities.Reservation;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int numbRoom = reader.nextInt();
        System.out.print("Check-In date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(reader.next(), fmt);
        System.out.print("Check-Out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(reader.next(), fmt);

        while (!checkIn.isBefore(checkOut) || checkIn.isBefore(LocalDate.now())) {
            System.out.println("Error in reservation: Check-out date must be equal or after check-in date" +
                    " and checkIn date must be equal or after actual date");
            System.out.println("Please, Enter the Reservation Dates:");
            System.out.print("\nCheck-In date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(reader.next(), fmt);
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(reader.next(), fmt);
        }
        Reservation reservation = new Reservation(numbRoom, checkIn, checkOut);
        System.out.println(reservation);



        System.out.println("\nEnter data to update the reservation: ");
        System.out.print("Check-In date (dd/MM/yyyy): ");
        LocalDate updatedCheckIn = LocalDate.parse(reader.next(), fmt);
        System.out.print("Check-Out date (dd/MM/yyyy): ");
        LocalDate updatedCheckOut = LocalDate.parse(reader.next(), fmt);


        while(!updatedCheckIn.isBefore(updatedCheckOut) && (updatedCheckIn.isBefore(LocalDate.now()))){
            System.out.println("Error in reservation: Check-out date must be equal or after check-in date" +
                    " and checkIn date must be equal or after actual date");
            System.out.print("Check-In date (dd/MM/yyyy): ");
            updatedCheckIn = LocalDate.parse(reader.next(), fmt);
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            updatedCheckOut = LocalDate.parse(reader.next(), fmt);
        }
        reservation.updateDates(updatedCheckIn, updatedCheckOut);

        System.out.println(reservation);


        reader.close();
    }
}
