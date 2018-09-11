package P11.Collections.Zodyno;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kolekcija {

  public static void main(String[] args) {

//    Sukurkite žodyno tipo kolekciją saugoti žmonių klasės objektus
//    (su tokiais laukais: vardas, pavardė, asmens kodas), o kaip
//    raktą naudokite asmens kodą.
//    Įdėkite keletą žmonių į kolekciją ir atspausdinkite žmones
//    asmens kodo didėjimo tvarka.
//    Pabandykite įdėti į kolekciją du skirtingus žmones bet su tuo
//    pačiu asmens kodu. Patikrinkite kas atsitiks?
//            Pagalvokite kaip saugoti žmones jei norime turėti kelis su tuo
//    pačiu asmens kodu.


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

    Zmogus z1 = new Zmogus ("Petras", "Jonaitis", 37894561448L);
    Zmogus z2 = new Zmogus ("Jonas", "Jonaitis", 37123561278L);
    Zmogus z3 = new Zmogus ("Antanas", "Jonaitis", 37878961245L);
    Zmogus z4 = new Zmogus ("Juozas", "Jonaitis", 38524561248L);
    Zmogus z5 = new Zmogus ("Vytautas", "Jonaitis", 31594561275L);


    Map<Long, Zmogus> map = new HashMap<>();

    map.put(37894561448L, z1);
    map.put(37123561278L, z2);
    map.put(37878961245L, z3);
    map.put(38524561248L, z4);
    map.put(31594561275L, z5);




  }
}
