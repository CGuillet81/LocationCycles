package fr.eni.LocationCycles;

import java.time.LocalDate;

public abstract class Cycle {
    protected String marque;
    protected String modele;
    protected LocalDate dateAchat;

    public Cycle(String marque, String modele, LocalDate dateAchat) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
    }

    public abstract double getTarif();{

    }

    public int age(){
        return this.dateAchat.until(LocalDate.now()).getYears();
    }
}
