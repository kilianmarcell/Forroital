package hu.petrik;

import java.util.Random;

public class Forróital {
    public String nev;
    public int ar;
    public int cukortartalom;
    Random rnd = new Random();

    public Forróital(String nev, int ar, int cukortartalom) {
        this.nev = nev;
        this.ar = ar;
        this.cukortartalom = cukortartalom;
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

    public int megadottArEmeles(int megadottInt) {
        return ar += megadottInt;
    }

    public int randomArEmeles(int minErtek, int maxErtek) {
        return ar += rnd.nextInt(maxErtek - minErtek) + minErtek;
    }

    public double ertekkelEmeles(double szazalek) {
        return ar *= (1 + szazalek / 100);
    }

    @Override
    public String toString() {
        return "Forróital neve: " + nev + ", ára: " + ar + ", cukortartalma: " + cukortartalom;
    }
}
