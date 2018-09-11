package P05.Mokiniai;

public class MokiniaiUzdavinys {


  // 1. Tarkime Mokinys klasės trimestras laukas turi kažkokias
  //reikšmes (masyvą sveikų skaičių), pvz.:
  //{8, 9, 8, 10}
  //Parašykite klasei Mokinys metodą kuris grąžintų trimestro
  //vidurkį kaip skaičių su kableliu, t.y. duotu atveju grąžintų 8.75
  //Atspausdinkite mokinių vardus, pavardes ir vidurkius.

//    2. Tarkime turime masyvą objektų Mokinys. Reikia atspausdinti
//    mokinių klasės numerį bei vardus ir pavardes su jų trimestro
//    vidurkiu pagal klases vidurkio mažėjimo tvarka.

//    3.  Modifikuokite klasę Mokinys taip, kad galėtumėt suskaičiuoti
//    kiek mokinių yra konkrečioje klasėje.
//    Primenu, kad mokinio klasė tai paprastas sveikas skaičius nuo
//    1 iki 12, tad galima susikurti masyvą ir ten viską laikyti.

  static class Mokinys {
    String vardas;
    String pavarde;
    int klase;
    int[] trimestras;

    static int[] klasesMokiniai = new int[12];

    static int kiekMokiniu(int sk) {
      return klasesMokiniai[sk - 1];
    }

    Mokinys(String v, String p, int kl, int[] tr) {
      vardas = v;
      pavarde = p;
      klase = kl;
      this.trimestras = tr;

      Mokinys.klasesMokiniai[klase - 1]++;

    }

    double vidurkis() {
      if (trimestras == null) return 0;
      int sum = 0;
      for (int pzm : trimestras) {
        sum += pzm;
      }
      return (double) sum / trimestras.length;
    }


  }

  public static void main(String[] args) {

    Mokinys[] mokiniai = new Mokinys[]{
            new Mokinys("Jonas", "Petraitis", 10, new int[]{10, 9, 8, 9}),
            new Mokinys("Maryte", "Jonikaite", 10, new int[]{7, 9, 6, 5}),
            new Mokinys("Vytukas", "Vytauskas", 8, new int[]{10, 5, 9, 6}),
            new Mokinys("Stasys", "Kresnauskas", 7, new int[]{4, 10, 7, 5}),
            new Mokinys("Kaze", "Vytautaite", 7, new int[]{10, 10, 10, 9}),

    };

    for (int k = 1; k <= 12; k++) {
      int x = Mokinys.kiekMokiniu(k); //TODO turime suskaiciuoti
      System.out.println(k + " klaseje yra " + x + " mokiniu");
    }


    for (int i = 0; i < mokiniai.length - 1; i++) {

      for (int j = i + 1; j < mokiniai.length; j++) {
        if (mokiniai[i].vidurkis() < mokiniai[j].vidurkis()) {
          Mokinys y = mokiniai[i];
          mokiniai[i] = mokiniai[j];
          mokiniai[j] = y;
        }

      }
    }

        System.out.println("Mokinio vardas, pavarde, klase ir pazymiu vidurkis : ");
        for (Mokinys m : mokiniai) {
          System.out.println(m.vardas + " " + m.pavarde + " " + m.klase + " kl. " + m.vidurkis());
        }


  }
}


