package fr.eni.LocationCycles;

import java.time.LocalDate;

public class Velo extends Cycle {
    private static final double TARIF_VELO = 4.9;
    private int nbreVitesse;

    public Velo(String marque, String modele, LocalDate dateAchat, int nbreVitesse) {
        super(marque, modele, dateAchat);
        this.nbreVitesse = nbreVitesse;
    }

    @Override
    public String toString() {
        return "Velo{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", age= " + super.age() + "an" + (super.age() > 1 ? "s" : "") +
                ", nbreVitesse=" + nbreVitesse +
                '}';
    }

    @Override
    public double getTarif() {
        return TARIF_VELO;
    }
}
