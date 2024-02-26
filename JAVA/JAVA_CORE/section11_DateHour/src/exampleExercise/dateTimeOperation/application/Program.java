package exampleExercise.dateTimeOperation.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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
        int dateDaysSubtracted = reader.nextInt();
        LocalDate nextWeekLocalDate = d01.plusDays(dateDaysSubtracted);


        LocalDateTime pastWeekLocalDateTime = d02.minusDays(dateDaysSubtracted);

        //Add years by 'plusYear' method
        System.out.print("\nEnter year value to add: ");
        int nextDaysAdd = reader.nextInt();
        LocalDate addWeekLocalDate = d01.plusYears(nextDaysAdd);
        Instant addDaysInstant = d03.plus(nextDaysAdd, ChronoUnit.DAYS);




        System.out.println("\nDate Time with days subtracted: " + pastWeekLocalDateTime);
        System.out.println("Date with days subtracted: " + pastWeekLocalDate);
        System.out.println("Date Month: " + pastWeekLocalDate.getMonth());
        System.out.println("Day of Week this Date: " +pastWeekLocalDate.getDayOfWeek() );

        System.out.println("\nDate Time with days adds: " + nextWeekLocalDate);
        System.out.println("Date with days adds: " + nextWeekLocalDate);
        System.out.println("Date month: " + nextWeekLocalDate.getMonth());
        System.out.println("Days week of this Date: " + nextWeekLocalDate.getDayOfWeek());
        System.out.println("\nYears adds to the Date: " + addWeekLocalDate);

        System.out.println("\n ISO-8601 Global Time: " + addDaysInstant);


        //Date Duration
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(),d01.atTime(0,0));


        //Date Time Duration
        Duration t2 = Duration.between(pastWeekLocalDateTime,d02);

        //Global Date Time Duration
        Duration t3 = Duration.between(addDaysInstant,d03);

        //Global Date Time Inverse Duration
        Duration t4 = Duration.between(d03,addDaysInstant);

        System.out.println("t1 days = " + t1.toDays());
        System.out.println("t2 days = " + t2.toDays());
        System.out.println("t3 days = " + t3.toDays());
        System.out.println("t4 days = " + t4.toDays());

        reader.close();

    }

}
