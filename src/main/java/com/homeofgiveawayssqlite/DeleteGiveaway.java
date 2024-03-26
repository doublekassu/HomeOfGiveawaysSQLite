package com.homeofgiveawayssqlite;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteGiveaway {
    public void DeleteGiveawayDB(DatabaseMethods databaseMethods, Scanner scanner) {
        while (true) {
            System.out.print("Link of the giveaway you want to delete (type 0 to stop deleting giveaways): ");
            String link = scanner.nextLine();
            if (link.equals("0")) {
                break;
            }
            //Query to get the information of the giveaway
            String selectSql = "SELECT * FROM GIVEAWAY WHERE link = ?";
            try (PreparedStatement selectStatement = databaseMethods.getConnection().prepareStatement(selectSql)) {
                selectStatement.setString(1, link);
                ResultSet resultSet = selectStatement.executeQuery();
                databaseMethods.iterateQuery(resultSet);

                //Confirmation of the deletion
                System.out.print("Are you sure you want to delete this giveaway? (y/n): ");
                String confirmation = scanner.nextLine();

                if (confirmation.equals("y")) {
                    String deleteSql = "DELETE FROM GIVEAWAY WHERE link = ?";
                    try (PreparedStatement deletionStatement = databaseMethods.getConnection().prepareStatement(deleteSql)) {
                        deletionStatement.setString(1, link);
                        deletionStatement.executeUpdate();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                else if (confirmation.equals("n")) {
                    System.out.println("Deletion canceled!");
                }
                else {
                    System.out.println("Incorrect input!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
