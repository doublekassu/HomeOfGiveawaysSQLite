package com.homeofgiveawayssqlite;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class test {
    public static void main(String[] args) {
        // Assuming you have a SQL date
        Date sqlDate = Date.valueOf("2022-01-01");

        // Current date
        LocalDate currentDate = LocalDate.now();

        // Convert SQL date to LocalDate
        LocalDate localDate = sqlDate.toLocalDate();

        // Calculate the difference in days and represent past dates as negative
        long daysDifference = ChronoUnit.DAYS.between(currentDate, localDate);

        // Print the result
        System.out.println("The difference is " + daysDifference + " days");
    }
}
