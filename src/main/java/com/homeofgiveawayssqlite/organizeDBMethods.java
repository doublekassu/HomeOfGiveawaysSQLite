package com.homeofgiveawayssqlite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class OrganizeDBMethods {
    private String url;
    private String userName;
    private String password;

    public OrganizeDBMethods() {
        this.url = "jdbc:mysql://localhost:3306/";
        this.userName = "root";
        this.password = "n09KKJa11117GQ0OoPmV7:,5tU(";
    }

    public void orderEndingSoonestDB(String type) {
        try {
            //Create the connection to the database and use table GIVEAWAYS
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            String connectionquery = "USE GIVEAWAYS";
            statement.executeUpdate(connectionquery);

            //Create the query for the method parameter giveaways ordered by end date
            ResultSet resultSet = statement.executeQuery("SELECT * FROM GIVEAWAYDATE WHERE TYYPPI = " + type + "ORDER BY PAATTYMISPAIVA");
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            //While the table has a next row, execute it
            //Fix the if statements later
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void orderStartDateDB(String type) {
        
    }
}
