package P11.Collections.Zodyno;
import java.util.*;
public class Destytojo1 {

  public static void main(String[] args) {
    List<Adresas> adresai = new ArrayList<>();
    adresai.add(new Adresas("Vilnius", "Sv.Petro"));
    adresai.add(new Adresas("Vilnius", "Gedimino pr."));
    adresai.add(new Adresas("Lentvaris", "Gedimino pr."));
    adresai.add(new Adresas("Babtai", "Vytauto g."));

    Set<String> miestai = new TreeSet<>();
    for (Adresas a : adresai) {
      miestai.add(a.miestas);
    }

    System.out.println("Viso skirtingu miestu yra " + miestai.size());
    for (String m : miestai) {
      System.out.println(m);
    }
  }
}

class Adresas {
  String miestas;
  String gatve;

  public Adresas(String miestas, String gatve) {
    this.miestas = miestas;
    this.gatve = gatve;
  }
}




