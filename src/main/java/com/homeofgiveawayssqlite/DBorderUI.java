package com.homeofgiveawayssqlite;
import java.util.Scanner;

public class DBorderUI {
    private Scanner scanner;

    public DBorderUI() {
        scanner = new Scanner(System.in);
    }

    public void orderTypeMenu(String type) {
        while (true) {
            System.out.print("\n How would you like to order the giveaways by? \n 0. Dont change the order \n 1. Ending soonest \n 2. Start date \n Type your choice and press ENTER: ");
            String option = scanner.nextLine();
            if (option.equals("0")) {
                System.out.println("The order wasn't changed.");
                break;
            }
            else if (option.equals("1") || option.equals("2")) {
                OrderByDBMethods orderDBMethods = new OrderByDBMethods();
                if (option.equals("1")) {
                    orderDBMethods.orderEndingSoonestDB(type);
                    System.out.println("The giveaways are now ordered by the soonest ending!");
                    break;
                }
                else {
                    orderDBMethods.orderStartedFirstDB(type);
                    System.out.println("The giveaways are now ordered by their start dates!");
                    break;
                }
            }
            else {
                System.out.println("Incorrect input, please try again!");
            }
        }
    }
}
