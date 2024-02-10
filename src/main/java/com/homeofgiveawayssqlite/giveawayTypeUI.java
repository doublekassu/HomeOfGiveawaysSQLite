package com.homeofgiveawayssqlite;
import java.util.Scanner;

public class GiveawayTypeUI {
    private Scanner scanner;

    public GiveawayTypeUI() {
        scanner = new Scanner(System.in);
    }
    public void giveawayTypeMenu() {
        while (true) {
            System.out.print("\n Select the type of giveaway you want to join! \n 1. CS2 skins \n 2. Tech \n 0. Back to main menu \n Choose the option by typing the number and pressing ENTER: ");
            String option = scanner.nextLine();
            if (option.equals("0")) {
                break;
            }
            else if (option.equals("1") || option.equals("2")) {
                GiveawayTypeSelection giveawayTypeSelection = new GiveawayTypeSelection(option);
                giveawayTypeSelection.typeSelection(option);
                System.out.print("Would you like to organize the giveaways? Type yes or no: ");
                String option2 = scanner.nextLine();
                if (option2.equals("yes")) {
                    DBorderUI DBorderUI = new DBorderUI();
                    DBorderUI.orderTypeMenu(giveawayTypeSelection.returnOption());
                }
                else if (option2.equals("no")) {
                    System.out.println("\n Giveaways are currently organized by when they were added to the database.");
                }
            }
            else {
                System.out.println("Invalid input, please try again!");
            }
        }
    }
}
