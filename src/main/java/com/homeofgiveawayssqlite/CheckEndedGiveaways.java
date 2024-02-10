/*package com.homeofgiveawayssqlite;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class CheckEndedGiveaways {
    //This method checks all the endDates of the ongoing giveaways. If the endDate is in the past, the program asks if you want to delete the giveaway from the database
    public void CheckEndedGiveawaysDB(DatabaseMethods databaseMethods, Scanner scanner, ResultSet resultSet) {
        LocalDate currentDate = LocalDate.now();
        try {
            ResultSetMetaData rsmd = resultSet.getMetaData();
            while (resultSet.next()) {

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
*/