package com.homeofgiveawayssqlite;
//This class is for adding or deleting giveaways from the database more easily

import java.util.Scanner;

public class AdminDatabaseMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseMethods databaseMethods = new DatabaseMethods();
        System.out.print("1. Add a giveaway. 2. Delete a giveaway: ");
        String option = scanner.nextLine();
        if (option.equals("1")) {
            AddGiveaway addGiveaway = new AddGiveaway();
            addGiveaway.AddGiveawayDB(databaseMethods, scanner);
        }
        else if (option.equals("2")) {
            DeleteGiveaway deleteGiveaway = new DeleteGiveaway();
            deleteGiveaway.DeleteGiveawayDB(databaseMethods, scanner);
        }
        /*
        else if (option.equals("3")) {
            //CheckEndedGiveaways CheckEndedGiveawaysDB = new CheckEndedGiveaways(databaseMethods, scanner) {
            }
        }
        else {
            System.out.println("Incorrect input, try again!");
        }
        */
    }
}
