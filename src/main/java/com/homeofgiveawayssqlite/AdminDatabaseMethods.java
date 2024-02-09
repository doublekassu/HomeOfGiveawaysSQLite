package com.homeofgiveawayssqlite;
//This class is for adding or deleting giveaways from the database more easily

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminDatabaseMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseMethods databaseMethods = new DatabaseMethods();
        System.out.print("1. Add a giveaway. 2. Delete a giveaway: ");
        String option = scanner.nextLine();
        if (option.equals("1")) {
            System.out.print("link: ");
            String link = scanner.nextLine();
            System.out.print("organizer: ");
            String organizer = scanner.nextLine();
            System.out.print("type (CS2SKIN OR TECH): ");
            String type = scanner.nextLine();
            System.out.print("Startdate (yyyy-mm-dd): ");
            Date startDate = Date.valueOf(scanner.nextLine());
            System.out.print("Enddate (yyyy-mm-dd): ");
            Date endDate = Date.valueOf(scanner.nextLine());

            String insertSql = "INSERT INTO GIVEAWAY(Link, Organizer, Type, StartDate, EndDate) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = databaseMethods.getConnection().prepareStatement(insertSql)) {
                preparedStatement.setString(1, link);
                preparedStatement.setString(2, organizer);
                preparedStatement.setString(3, type);
                preparedStatement.setDate(4, startDate);
                preparedStatement.setDate(5, endDate);
                
                //Exec the insertion
                preparedStatement.executeUpdate();
            } catch (SQLException e){
                e.printStackTrace();
            }
        } 
    }
}
