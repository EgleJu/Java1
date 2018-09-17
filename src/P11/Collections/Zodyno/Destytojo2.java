package P11.Collections.Zodyno;
import java.util.*;

public class Destytojo2 {
  public class Uzdavinys {

    public void main(String[] args) {

      ManoMapas collection = new ManoMapas();

      Z z1 = new Z("12345678", "Ona");
      collection.put(z1.getAk(), z1);

      z1 = new Z("1111", "Mare");
      collection.put(z1.ak, z1);

      collection.put("8888", new Z("888", "Kaze"));
      collection.put("555", new Z("555", "Elvyrka"));
      collection.put("555", new Z("555", "Bumbabumba"));

      System.out.println("Values:");
      for (List<Z> z : collection.values()) {
        for (Z zmogus : z) {
          System.out.println(zmogus.ak + " " + zmogus.vardas);
        }
      }

//        System.out.println("Keys:");
//        for (String key : collection.keySet()) {
//            Z zmogus = collection.get(key);
//            System.out.println(zmogus.ak + " " + zmogus.vardas);
//        }
//
//        System.out.println("Entries:");
//        for (Map.Entry<String, Z> entry : collection.entrySet()) {
//            System.out.print("key: " + entry.getKey());
//            System.out.println(", value: " + entry.getValue().ak + " " + entry.getValue().vardas);
//        }
    }


  }


  class Z {
    String ak;
    String vardas;

    public Z(String ak, String vardas) {
      this.ak = ak;
      this.vardas = vardas;
    }

    public String getAk() {
      return ak;
    }

    public void setAk(String ak) {
      this.ak = ak;
    }

    public String getVardas() {
      return vardas;
    }

    public void setVardas(String vardas) {
      this.vardas = vardas;
    }
  }

//class ManoMapas extends TreeMap<String, List<Z>> {
//
//    public void put(String key, Z value) {
//        if (this.containsKey(key)) {
//            List<Z> listas = this.get(key);
//            listas.add(value);
//        } else {
//            List<Z> listas = new ArrayList<>();
//            listas.add(value);
//            this.put(key, listas);
//        }
//    }
//}

  class ManoMapas {

    Map<String, List<Z>> map;

    public ManoMapas() {
      map = new TreeMap<>();
    }

    public void put(String key, Z value) {
      if (map.containsKey(key)) {
        List<Z> listas = map.get(key);
        listas.add(value);
      } else {
        List<Z> listas = new ArrayList<>();
        listas.add(value);
        map.put(key, listas);
      }
    }

    public Collection<List<Z>> values() {
      return map.values();
    }
  }
}
