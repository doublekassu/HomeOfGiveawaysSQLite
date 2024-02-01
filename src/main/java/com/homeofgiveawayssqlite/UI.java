package com.homeofgiveawayssqlite;

import java.util.Scanner;

public class UI{
    private Scanner scanner;

    public UI() {
        scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        while (true) {
            System.out.print("\n MAIN MENU \n 1. Ongoing giveaways \n 2. Ended giveaways \n 0. Exit the program \n Choose the option by typing the number and pressing ENTER: ");
            String option = scanner.nextLine();
            if (option.equals("0")) {
                break;
            }
            else if (option.equals("1")) {
                giveawayTypeUI typeUI = new giveawayTypeUI();
                typeUI.giveawayTypeMenu();
            }
            else if (option.equals("2")) {
                //printEndedGiveaways();
            }
            else {
                System.out.println("There was a typo, please try again!");
            }
        }
    }
}
