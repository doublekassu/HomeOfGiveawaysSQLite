package com.homeofgiveawayssqlite;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
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
        //Resultset is the query for the database. Example Resultset resultSet = "SELECT * FROM GIVEAWAY"; iterateQuery(resultSet);
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
                        System.out.print(" Start date: " + columnValue);
                    }
                    else {
                        System.out.print(" End date: " + columnValue);
                    }
                }
                System.out.println("");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
    public Statement getStatement() {
        return statement;
    }
}
