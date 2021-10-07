package hu.petrik;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Kávé k1 = new Kávé("Fekete", 350, 20, true);
        Tea t1 = new Tea("Gyümölcsös", 300, 15, false);
        Cappuccino c1 = new Cappuccino("Ilyenolyan", 400, 10, true, true);
        List<Forróital> forroital = new ArrayList<>();
        forroital.add(k1);
        forroital.add(t1);
        forroital.add(c1);
        for (Forróital f : forroital) {
            System.out.println(f);
            f.megadottArEmeles(50);
            System.out.println("50-nel emelt: " + f);
            f.randomArEmeles(10, 100);
            System.out.println("Random 10 és 100 között: " + f);
            f.ertekkelEmeles(50);
            System.out.println("50%-kal növelt: " + f + "\n\n");
        }
    }
}
