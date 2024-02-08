package com.homeofgiveawayssqlite;

public class Giveaway {
    private String link;
    private String organizer;
    private String type;
    private String startDate;
    private String endDate;
    
    public Giveaway(String link, String organizer, String type, String startDate, String endDate) {
        this.link = link;
        this.organizer = organizer;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public String getLink() {
        return link;
    }

    public void setLink(String linkki) {
        this.link = linkki;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String jarjestaja) {
        this.organizer = jarjestaja;
    }

    public String getType() {
        return type;
    }

    public void setType(String tyyppi) {
        this.type = tyyppi;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String alkamispaiva) {
        this.startDate = alkamispaiva;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String paattymispaiva) {
        this.endDate = paattymispaiva;
    }

    //Tulostaa monta päivää päättymispäivän ja alkamispäivän välissä on
    /*
    public void tulostaArvonnankesto() {
        System.out.println("Arvonta kestää " + Paivamaarafunktiot.arvonnanKesto(alkamispaiva, paattymispaiva) + " päivää");
    }

    //Tulostaa monta päivää arvontaa on jäljellä tästä päivästä eteenpäin
    public void tulostaPaljonJaljella() {
        System.out.println("Arvontaa on jäljellä " + Paivamaarafunktiot.arvontaaJaljella(paattymispaiva) + " päivää");
    }
    
    //Arvonnan toString muutettu, jotta arvontakokoelman tulostaminen mahdollista
    @Override
    public String toString() {
        return "Linkki: " + linkki + ", Järjestejä: " + jarjestaja + ", Tyyppi: " + tyyppi;
    }
    */
}