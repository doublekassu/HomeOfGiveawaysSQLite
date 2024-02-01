package com.homeofgiveawayssqlite;

public class ArvontaLuonti {
    private DatabaseMethods databaseMethods;
    private String option;

    public ArvontaLuonti(String option){
        this.databaseMethods = new DatabaseMethods();
        this.option = option;
    }

    public void arvontojenLuontiLisaysTulostus(String option) {
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
