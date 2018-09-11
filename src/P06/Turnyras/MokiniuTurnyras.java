package P06.Turnyras;

public class MokiniuTurnyras {
  public static void main(String[] args) {



//    Mokykla organizuoja mokinių turnyrą. Turnyras bus rengiamas taurės principu, t.y.
// susitinka du ir tik laimėtojas išeina į kitą ratą ir t.t.
// Atspausdinkite turnyro susitikimų lentelę, t.y. kuriame rate kas su kuo žaidžia.
// Kiekvienai porai suteikite eilės numerį, kad galėtumėt jas identifikuoti,
// pvz, jei turim 7 vaikus, tai 6 žaidžia pirmame rate, o vienas (Petras) papuola iš kart į antrą ratą,
// nes neturi poros pirmame rate:

//    1 ratas - 1/4:
//    1) Jonas - Ona
//    2) Marytė - Ilona
//    3) Juozas - Marius
//    2 ratas - pusfinalis:
//    4) 1 poros laimėtojas - Petras
//    5) 2 poros laimėtojas - 3 poros laimėtojas
//    3 ratas - finalas:
//    4 poros laimėtojas - 5 poros laimėtojas
//    Išbandykite programą su įvairiu mokinių skaičiumi: 2, 3, 4, 5, 6, 33

    class Pretendentai {
      String vardas;
      String pavarde;


      public Pretendentai(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;

      }
    }

     int numerioSkaitliukas = 1;

    Pretendentai [] dalyviai = new Pretendentai [] {
            new Pretendentai("Jonas", "Petraitis"),
            new Pretendentai("Maryte", "Jonikaite"),
            new Pretendentai("Vytukas", "Vytauskas"),
            new Pretendentai("Stasys", "Kresnauskas"),
            new Pretendentai("Kaze", "Vytautaite"),
            new Pretendentai("Nikas", "Nikauskas"),
            new Pretendentai("Petras", "Kazlauskas"),
    };

    System.out.println("Dalyvauja: ");
    for (Pretendentai p : dalyviai) {
      System.out.println(p.vardas + " " + p.pavarde);
    }


//    System.out.println("Dalyvauja: ");
//    for (Pretendentai p : dalyviai) {
//      System.out.println(p.getPavadinimas());
//    }

//    int numerioSkaitliukas = 1;
//
//    Pretendentai[] dalyviai = {
//            new Pretendentai(numerioSkaitliukas++: 1, vardas: "Antanas 1"),
//            new Pretendentai(numerioSkaitliukas++: 1, vardas: "Antanas 2"),
//            new Pretendentai(numerioSkaitliukas++: 1, vardas: "Antanas 3"),
//            new Pretendentai(numerioSkaitliukas++: 1, vardas: "Antanas 4"),
//            new Pretendentai(numerioSkaitliukas++: 1, vardas: "Antanas 5"),
//            new Pretendentai(numerioSkaitliukas++: 1, vardas: "Antanas 6"),
//            new Pretendentai(numerioSkaitliukas++: 1, vardas: "Antanas 7"),
//    };
//
//    System.out.println("Dalyvauja: ");
//    for (Pretendentai p : dalyviai) {
//      System.out.println(p.getPavadinimas());
//    }
//
//    int ratuSk = 1;
//    int dalyviuSk = 2;
//    while (dalyviai.length > dalyviuSk)
//
//    class Dalyvis {
//      int numeris;
//      String getPavadinimas() { return""; }
//    }
//
//    class Pretendentai extends Dalyvis {
//      String vardas;




  }
}
