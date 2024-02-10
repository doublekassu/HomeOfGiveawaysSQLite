package com.homeofgiveawayssqlite;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderByDBMethods {
    private DatabaseMethods databaseMethods;

    public OrderByDBMethods() {
        this.databaseMethods = new DatabaseMethods();
    }

    public void orderEndingSoonestDB(String type) {
        try {
            ResultSet resultSet = databaseMethods.getStatement().executeQuery("SELECT * FROM GIVEAWAY WHERE TYPE = " + type + "ORDER BY ENDDATE");
            databaseMethods.iterateQuery(resultSet);
        }
        catch (SQLException e ) {
            e.printStackTrace();
        }
    }

    public void orderStartedFirstDB(String type) {
        try {
            ResultSet resultSet = databaseMethods.getStatement().executeQuery("SELECT * FROM GIVEAWAY WHERE TYPE = " + type + "ORDER BY STARTDATE");
            databaseMethods.iterateQuery(resultSet);
        }
        catch (SQLException e ) {
            e.printStackTrace();
        }
    }
}
