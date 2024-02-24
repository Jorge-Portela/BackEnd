package exampleExercise.Application;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args){


        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Reports the local date at this moment
        LocalDate d01 = LocalDate.now();
        //Reports the local date with time at this moment
        LocalDateTime d02 = LocalDateTime.now();
        //Reports the Global Date at this moment
        Instant d03 = Instant.now();

        //Report date through input of String format
        LocalDate d04 = LocalDate.parse("2024-02-24");
        //Report date and time through input of String format
        LocalDateTime d05 = LocalDateTime.parse("2024-02-24T17:30:20");
        //Report Global date and time through input of String format
        Instant d06 = Instant.parse("2024-02-24T17:30:20Z");
        //Report Global date and time through input of Local time on String format
        Instant d07 = Instant.parse("2024-02-24T17:30:20-03:00");

        //Report Local Date with parameter to format the output entered by String
        LocalDate d08 = LocalDate.parse("24/02/2024",fmt1);
        //Report Local Date Time with parameter to format the output entered by String
        LocalDateTime d09 = LocalDateTime.parse("24/02/2024 18:07",fmt2);

        //Report Date entered by parameter
        LocalDate d10 = LocalDate.of(2024, 02, 24);
        //Report Date Time entered by parameter
        LocalDateTime d11 = LocalDateTime.of(2024, 02, 24, 18, 15, 20);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}
