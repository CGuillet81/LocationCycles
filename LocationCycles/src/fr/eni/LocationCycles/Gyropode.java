package fr.eni.LocationCycles;

import java.time.LocalDate;

/*
* Gyropode
* taille en centimètres
*
 */

public class Gyropode extends CycleElectrique {
    private static final double TARIF_GYROPODE = 24.9;
    private int taille;

    public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, int taille) {
        super(marque, modele, dateAchat, autonomie);
        this.taille = taille;
    }

    @Override
    public double getTarif() {
        return TARIF_GYROPODE;
    }

    @Override
    public String toString() {
        return "Gyropode{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", age= " + super.age() + "an" + (super.age() > 1 ? "s" : "") +
                ", autonomie=" + autonomie +
                ", taille=" + taille +
                '}';
        // return String.format("%s %n %s %s,this.marque...);
    }
}
