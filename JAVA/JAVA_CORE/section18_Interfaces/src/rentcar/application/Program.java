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
        System.out.print("Car Model: ");
        String carModel = reader.nextLine();
        System.out.print("Pick up (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(reader.nextLine(), fmt);
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(reader.nextLine(), fmt);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter the price per hour: ");
        double pricePerHour = reader.nextDouble();
        System.out.print("Enter the price per day: ");
        double pricePerDay = reader.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("\n========================================\n");

        System.out.println("INVOICE: ");
        System.out.println("Basic Payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Taxes: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total Payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        reader.close();
    }
}
