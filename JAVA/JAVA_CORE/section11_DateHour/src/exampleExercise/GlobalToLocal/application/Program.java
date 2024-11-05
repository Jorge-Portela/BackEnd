package exampleExercise.GlobalToLocal.application;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args){

        LocalDate d01 = LocalDate.parse("2024-02-25");
        LocalDateTime d02 = LocalDateTime.parse("2024-02-25T15:44:37");
        Instant d03 = Instant.parse("2024-02-25T15:45:18Z");

        LocalDate r1 = LocalDate.ofInstant(d03,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03,ZoneId.of("Europe/Berlin"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03,ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03,ZoneId.of("Europe/Berlin"));


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("\nd01 day = " + d01.getDayOfMonth());
        System.out.println("d01 day of week = " + d01.getDayOfWeek());
        System.out.println("d01 month =  " + d01.getMonth());
        System.out.println("d01 month value = " + d01.getMonthValue() );

        System.out.println("\nd02 hour = " + d02.getHour());
        System.out.println("d02 minutes = " + d02.getMinute());
        System.out.println("d02 seconds = " + d02.getSecond());
        System.out.println("\nd02 FullTime = " + d02.getHour() + ":" + d02.getMinute() + ":" + d02.getSecond());



    }
}
