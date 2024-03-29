package com.homeofgiveawayssqlite;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddGiveaway {
    public void AddGiveawayDB(DatabaseMethods databaseMethods, Scanner scanner) {
        while (true) {
            System.out.print("link (type 0 to stop adding giveaways): ");
            String link = scanner.nextLine();
            if (link.equals("0")) {
                break;
            }
            System.out.print("organizer: ");
            String organizer = scanner.nextLine();
            System.out.print("type (CS2SKIN OR TECH): ");
            String type = scanner.nextLine();
            System.out.print("Startdate (yyyy-mm-dd): ");
            String startDate = scanner.nextLine();
            System.out.print("Enddate (yyyy-mm-dd): ");
            String endDate = scanner.nextLine();

            String insertSql = "INSERT INTO GIVEAWAY(Link, Organizer, Type, StartDate, EndDate) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = databaseMethods.getConnection().prepareStatement(insertSql)) {
                preparedStatement.setString(1, link);
                preparedStatement.setString(2, organizer);
                preparedStatement.setString(3, type);
                preparedStatement.setString(4, startDate);
                preparedStatement.setString(5, endDate);
                
                //Exec the insertion
                preparedStatement.executeUpdate();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
