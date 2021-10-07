package hu.petrik;

public class Cappuccino extends Kávé{
    private boolean tejszínhab;

    public Cappuccino(String nev, int ar, int cukortartalom, boolean tej, boolean tejszínhab) {
        super(nev, ar, cukortartalom, tej);
        this.tejszínhab = tejszínhab;
    }

    @Override
    public String toString() {
        String s = "";
        if (tejszínhab) {
            s = ", van rajta tejszínhab.";
        } else {
            s = ", nincs rajta tejszínhab.";
        }
        return "Forróital neve: " + nev + ", ára: " + ar + ", cukortartalma: " + cukortartalom +  s;
    }
}
