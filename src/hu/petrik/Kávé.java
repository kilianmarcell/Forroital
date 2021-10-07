package hu.petrik;

public class Kávé extends Forróital {
    private boolean tej;

    public Kávé(String nev, int ar, int cukortartalom, boolean tej) {
        super(nev, ar, cukortartalom);
        this.tej = tej;
    }

    @Override
    public String toString() {
        String s = "";
        if (tej) {
            s = "van benne tej";
        } else {
            s = "nincs benne tej";
        }
        return "Forróital neve: " + nev + ", ára: " + ar + ", cukortartalma: " + cukortartalom +  s;
    }
}
