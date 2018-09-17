package P11.Collections.Zodyno;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Kolekcija {

  public static void main(String[] args) {


    class Zmogus {
      String vardas;
      String pavarde;
      long asmens_kodas;

      public Zmogus(String vardas, String pavarde, long asmens_kodas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.asmens_kodas = asmens_kodas;
      }
    }

    Zmogus z1 = new Zmogus("Petras", "Jonaitis", 37894561448L);
    Zmogus z2 = new Zmogus("Jonas", "Jonaitis", 37123561278L);
    Zmogus z3 = new Zmogus("Antanas", "Jonaitis", 37878961245L);
    Zmogus z4 = new Zmogus("Juozas", "Jonaitis", 38524561248L);
    Zmogus z5 = new Zmogus("Vytautas", "Jonaitis", 31594561275L);


    Map<Long, String> unsortmap = new HashMap<>();

    unsortmap.put(37894561448L, "Petras");
    unsortmap.put(37123561278L, "Jonas");
    unsortmap.put(37878961245L, "Antanas");
    unsortmap.put(38524561248L, "Juozas");
    unsortmap.put(31594561275L, "Vytautas");


    System.out.println("Neišrikiuotas sąrašas: ");
    for (Map.Entry<Long, String> surikiuojam : unsortmap.entrySet()) {
      System.out.println("Asmens kodas: " + surikiuojam.getKey() + " Asmuo: " + surikiuojam.getValue());
    }

    System.out.println("Išrikiuotas sąrašas pagal a.k. : ");
    Map<Long, String> TreeMap = new TreeMap<Long, String>(unsortmap);{
      for (Map.Entry<Long, String> surikiuojam : TreeMap.entrySet()) {
        System.out.println("Asmens kodas: " + surikiuojam.getKey() + " Asmuo: " + surikiuojam.getValue());
      }
      }


    }
  }
