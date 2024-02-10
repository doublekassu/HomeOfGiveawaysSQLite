package com.homeofgiveawayssqlite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMethods {
    private final String url;
    private Connection connection;
    private Statement statement;

    public DatabaseMethods() {
        this.url = "jdbc:sqlite:giveaways.db";

        //Create the connection to the database and use table GIVEAWAYS
        try {
            this.connection = DriverManager.getConnection(url);
            this.statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printTypeGiveawaysDB(String type) {
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM GIVEAWAY WHERE TYPE = " + type);
            iterateQuery(resultSet);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void iterateQuery(ResultSet resultSet) {
        try {
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            //While the table has a next row, execute it
            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    String columnValue = resultSet.getString(i);
                    if (i == 1) {
                        System.out.print("Link for the giveaway: " + columnValue);
                    }
                    else if (i == 2) {
                        System.out.print(" Giveaway organizer: " + columnValue);
                    }
                    else if (i == 3) {
                        System.out.print(" Product: " + columnValue);
                    }
                    else if (i == 4) {
                        System.out.print(" Start date: " + formatUnixDate(columnValue));
                    }
                    else {
                        System.out.print(" End date: " + formatUnixDate(columnValue));
                    }
                }
                System.out.println("");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Thankfully this works. Without this the date would be in non-readable unix syntax
    private String formatUnixDate(String unixDate) {
        // SQL query to format Unix timestamp to "YYYY-MM-DD"
        String sqlQuery = "SELECT strftime('%Y-%m-%d', datetime(? / 1000, 'unixepoch')) AS FormattedDate";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            preparedStatement.setString(1, unixDate);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("FormattedDate");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return unixDate;
    }
    public Connection getConnection() {
        return connection;
    }
    public Statement getStatement() {
        return statement;
    }
}
