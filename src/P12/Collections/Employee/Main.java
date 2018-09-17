package P12.Collections.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    List<Darbuotojai> darbuotojai = new ArrayList<>();
    darbuotojai.add(new Darbuotojai("Petras", new Darbuotojai.Address("Vilnius", "Gedimino pr. ", "165")));
    darbuotojai.add(new Darbuotojai("Eglute", new Darbuotojai.Address("Vilnius", "Vytauto g. ", "173")));
    darbuotojai.add(new Darbuotojai("Kazys", new Darbuotojai.Address("Kaunas", "Laisves al. ", "15")));
    darbuotojai.add(new Darbuotojai("Ona", new Darbuotojai.Address("Kaunas", "Laisves al. ", "73")));
    darbuotojai.add(new Darbuotojai("Stasys", new Darbuotojai.Address("Klaipeda", "Baltijos g. ", "95")));
    darbuotojai.add(new Darbuotojai("Leukadija", new Darbuotojai.Address("Klaipeda", "Baltijos g. ", "98")));
    darbuotojai.add(new Darbuotojai("Anabele", new Darbuotojai.Address("Mažeikiai", "Gamyklos g. ", "86")));
    darbuotojai.add(new Darbuotojai("Juozapas", new Darbuotojai.Address("Mažeikiai", "Žemaitijos g. ", "187")));
    darbuotojai.add(new Darbuotojai("Jezus", new Darbuotojai.Address("Kintai", "Versmes g. ", "12")));
    darbuotojai.add(new Darbuotojai("Marija", new Darbuotojai.Address("Kintai", "Versmes g. ", "16")));

    System.out.println("Darbuotoju skaičius: " + darbuotojai.size());


    Set<String> miestai = new TreeSet<>();
    for (Darbuotojai a : darbuotojai) {
      miestai.add(a.getAddress().city);
    }
    Set<String> gatves = new TreeSet<>();
    for (Darbuotojai s : darbuotojai) {
      gatves.add(s.getAddress().street + s.getAddress().city);
    }

    System.out.println("Viso skirtingu miestų yra: " + miestai.size());
    for (String m : miestai) {
      System.out.println(m);
    }

    System.out.println("Viso skirtingu gatvių yra: " + gatves.size());
    for (String g : gatves) {
      System.out.println(g);
    }
  }
}
