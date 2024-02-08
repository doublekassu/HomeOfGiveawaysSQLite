package com.homeofgiveawayssqlite;

public class GiveawayTypeSelection {
    private DatabaseMethods databaseMethods;
    private String option;

    public GiveawayTypeSelection(String option){
        this.databaseMethods = new DatabaseMethods();
        this.option = option;
    }

    //Database query depends on the user's prompt. GiveawayTypeMenu uses this method when choosing the type of giveaway to join.
    public void typeSelection(String option) {
        if (option.equals("1")) {
            databaseMethods.printTypeGiveawaysDB("'CS2SKIN'");
            this.option = "'CS2SKIN'";
        }
        else if (option.equals("2")){
            databaseMethods.printTypeGiveawaysDB("'TECH'");
            this.option = "'TECH'";
        }
        else {
            System.out.println("Invalid input, please try again!");
        }
    }

    public String returnOption() {
        return option;
    }
}
