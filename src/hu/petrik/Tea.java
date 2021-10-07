package hu.petrik;

public class Tea extends Forróital {
    private boolean citrom;

    public Tea(String nev, int ar, int cukortartalom, boolean citrom) {
        super(nev, ar, cukortartalom);
        this.citrom = citrom;
    }

    @Override
    public String toString() {
        String s = "";
        if (citrom) {
            s = ", van benne citrom.";
        } else {
            s = ", nincs benne citrom.";
        }
        return "Forróital neve: " + nev + ", ára: " + ar + ", cukortartalma: " + cukortartalom +  s;
    }
}
