package exampleExercise.dateTimeOperation.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        LocalDate d01 = LocalDate.parse("2024-02-25");
        LocalDateTime d02 = LocalDateTime.parse("2024-02-25T21:42:17");
        Instant d03 = Instant.parse("2024-02-25T21:43:29Z");

        //Subtract days by 'minusDays' method
        System.out.print("Enter the days subtracted: ");
        LocalDate pastWeekLocalDate = d01.minusDays(reader.nextInt());

        //Add days by 'plusDays' method
        System.out.print("\nEnter the days to add: ");
        LocalDate nextWeekLocalDate = d01.plusDays(reader.nextInt());

        System.out.println("\nDate with days subtracted: " + pastWeekLocalDate);
        System.out.println("Date Month: " + pastWeekLocalDate.getMonth());
        System.out.println("Day of Week this Date: " +pastWeekLocalDate.getDayOfWeek() );

        System.out.println("\nDate with days adds: " + nextWeekLocalDate);
        System.out.println("Date month: " + nextWeekLocalDate.getMonth());
        System.out.println("Days week of this Date: " + nextWeekLocalDate.getDayOfWeek());

        reader.close();

    }

}
