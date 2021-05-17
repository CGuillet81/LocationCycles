package fr.eni.LocationCycles;

import java.time.LocalDate;

public abstract class CycleElectrique extends Cycle {
    protected int autonomie;

    public CycleElectrique(String marque, String modele, LocalDate dateAchat, int autonomie) {
        super(marque, modele, dateAchat);
        this.autonomie = autonomie;
    }
}
