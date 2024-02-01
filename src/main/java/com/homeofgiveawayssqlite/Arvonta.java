package com.homeofgiveawayssqlite;

public class Arvonta {
    private String linkki;
    private String jarjestaja;
    private String tyyppi;
    private String alkamispaiva;
    private String paattymispaiva;
    
    public Arvonta(String linkki, String jarjestaja, String tyyppi, String alkamispaiva, String paattymispaiva) {
        this.linkki = linkki;
        this.jarjestaja = jarjestaja;
        this.tyyppi = tyyppi;
        this.alkamispaiva = alkamispaiva;
        this.paattymispaiva = paattymispaiva;
    }
    
    public String getLinkki() {
        return linkki;
    }

    public void setLinkki(String linkki) {
        this.linkki = linkki;
    }

    public String getJarjestaja() {
        return jarjestaja;
    }

    public void setJarjestaja(String jarjestaja) {
        this.jarjestaja = jarjestaja;
    }

    public String getTyyppi() {
        return tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    public String getAlkamispaiva() {
        return alkamispaiva;
    }

    public void setAlkamispaiva(String alkamispaiva) {
        this.alkamispaiva = alkamispaiva;
    }

    public String getPaattymispaiva() {
        return paattymispaiva;
    }

    public void setPaattymispaiva(String paattymispaiva) {
        this.paattymispaiva = paattymispaiva;
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