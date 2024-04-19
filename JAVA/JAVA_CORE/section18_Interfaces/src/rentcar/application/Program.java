package rentcar.application;

import rentcar.model.entities.CarRental;
import rentcar.model.entities.Vehicle;
import rentcar.model.services.BrazilTaxService;
import rentcar.model.services.RentalService;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the rentals data: ");
        System.out.println("Car Model: ");
        String carModel = reader.nextLine();
        System.out.println("Pick up (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(reader.nextLine(),fmt);
        System.out.println("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(reader.nextLine(),fmt);

        CarRental carRental = new CarRental(start,finish,new Vehicle(carModel));

        System.out.print("Enter the price per hour: ");
        double pricePerHour = reader.nextDouble();
        System.out.println("Enter the price per day: ");
        double pricePerDay = reader.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour,pricePerDay,new BrazilTaxService());

        reader.close();
    }
}
