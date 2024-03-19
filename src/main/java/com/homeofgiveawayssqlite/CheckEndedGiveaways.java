package com.homeofgiveawayssqlite;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class CheckEndedGiveaways {
    private DatabaseMethods databaseMethods;
    public CheckEndedGiveaways() {
        this.databaseMethods = new DatabaseMethods();
    }
    //This method checks all the endDates of the ongoing giveaways. If the endDate is in the past, the program asks if you want to delete the giveaway from the database
    public void checkEndedGiveawaysDB() {
        LocalDate dateToday = LocalDate.now();
        LocalDateTime dateTodayTime = dateToday.atStartOfDay();
        Instant instant = dateTodayTime.toInstant(ZoneOffset.UTC);
        //The dates are in unix timestamps in the database (in milliseconds). If ENDDATE < unixTimeStampMilliseconds it means the giveaway has ended.
        long unixTimestampSeconds = instant.getEpochSecond();
        long unixTimestampMilliseconds = unixTimestampSeconds * 1000;
        try {
            ResultSet resultSet = databaseMethods.getStatement().executeQuery("SELECT * FROM GIVEAWAY WHERE ENDDATE < " + unixTimestampMilliseconds);
            databaseMethods.iterateQuery(resultSet);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
