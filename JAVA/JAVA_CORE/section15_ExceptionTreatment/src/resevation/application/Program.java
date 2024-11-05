package resevation.application;

import resevation.model.entities.Reservation;
import resevation.model.exceptions.DomainException;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{
            System.out.print("Room number: ");
            int numbRoom = reader.nextInt();
            System.out.print("Check-In date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(reader.next(), fmt);
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(reader.next(), fmt);

            Reservation reservation = new Reservation(numbRoom, checkIn, checkOut);
            System.out.println(reservation);


            System.out.println("\nEnter data to update the reservation: ");
            System.out.print("Check-In date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(reader.next(), fmt);
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(reader.next(), fmt);

            reservation.updateDates(checkIn, checkOut);

            System.out.println(reservation);


        }
        catch(DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        reader.close();
    }
}
