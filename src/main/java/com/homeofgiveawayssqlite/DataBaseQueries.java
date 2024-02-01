//THIS CLASS IS ONLY USED TO EDIT THE DATABASE. PLEASE IGNORE THIS CLASS!
/*
package com.homeofgiveawayssqlite;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class DataBaseQueries {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:giveaways.db";

        try (Connection connection = DriverManager.getConnection(url)) {
            String link = "https://twitter.com/jxsCS/status/1751975731523940577";
            String organizer = "jxscs";
            String type = "CS2SKIN";
            String startDate = "2024-01-29";
            String endDate = "2024-02-06";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dddd");
            String startDateFormat = sdf.format(null)

            String insertSql = "INSERT INTO GIVEAWAY(Link, Organizer, Type, StartDate, EndDate) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSql)) {
                preparedStatement.setString(1, link);
                preparedStatement.setString(2, organizer);
                preparedStatement.setString(3, type);
                preparedStatement.setDate(4, startDate);
                preparedStatement.setDate(5, endDate);
                
                //Exec the insertion
                preparedStatement.executeUpdate();
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
 */
