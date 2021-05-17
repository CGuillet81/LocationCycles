package fr.eni.LocationCycles;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cycle[] aLouer = new Cycle[6];
        Velo lapierre = new Velo("Lapierre", "speed 400", LocalDate.of(2020, 05,17), 27);
        aLouer[0] = lapierre;
        Velo btwin = new Velo("Btwin", "riverside 900", LocalDate.of(2021, 05,17),10);
        aLouer[1] = btwin;
        Gyropode segway = new Gyropode("Segway", "Ninebot Elite", LocalDate.of(2021, 05,17), 40,150);
        aLouer[2] = segway;
        Gyropode weebot = new Gyropode("Weebot", "Echo", LocalDate.of(2018, 05,17), 35,160);
        aLouer[3] = weebot;
        Gyroroue immotion = new Gyroroue("Immotion", "V8", LocalDate.of(2021, 05,17), 40);
        aLouer[4] = immotion;
        Gyroroue segwayG = new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2021, 05,17), 30);
        aLouer[5] = segwayG;
        /*
        for (int i = 0; i < aLouer.length; i++) {
            if (aLouer[i] != null) {
                System.out.println(aLouer[i]);
            }

        }*/
/*
        for (int i = 0; i < aLouer.length; i++) {
                System.out.println(aLouer[i] != null ? aLouer[i] : "");
        }
*/
        for (Cycle cycle : aLouer) {
            if (cycle != null) {
                System.out.println(cycle);
            }
        }

    }
/*
    public static void main(String[] args) {
        Cycle[] aLouer = {
        new Velo("Lapierre", "speed 400", LocalDate.of(2020, 05,17), 27);
        aLouer[0] = lapierre;
        new Velo("Btwin", "riverside 900", LocalDate.of(2021, 05,17),10);
        new Gyropode("Segway", "Ninebot Elite", LocalDate.of(2021, 05,17), 40,150);
        new Gyropode("Weebot", "Echo", LocalDate.of(2020, 05,17), 35,160);
        new Gyroroue("Immotion", "V8", LocalDate.of(2021, 05,17), 40);
        new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2021, 05,17), 30);

    }*/
}
