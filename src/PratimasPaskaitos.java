import java.sql.Array;
import java.util.Arrays;

public class PratimasPaskaitos {
  public static void main(String[] args) {


      class Zmogus {
        String vardas;
        String pavarde;
        int[] trimestras;


    Zmogus(String v, String p) {
        vardas = v;
        pavarde = p;
    }
  }
   Zmogus zmogus1 = new Zmogus("Jonas","Jonaitis");

      Zmogus[] zmones = new Zmogus[] {
              zmogus1,
              new Zmogus( "Petras","Petraitis"),
              new Zmogus("Antanas", "Antaninas"),
              new Zmogus("Bertas", "Bertulis"),
              new Zmogus("Vytas", "Vytauskas"),
      };




      for (int i = 0; i < zmones.length - 2; i++) {
        //Zmogus min = zmones[i];

        for (int j = i + 1; j < zmones.length; j++) {
          // lyginame i su j zmogumi
          Zmogus iZmogus = zmones[i];
          Zmogus jZmogus = zmones[j];
          // jei lyginam pagal amziu:
          // if iZmogus.amzius > jZmogus.amzius)
          if (iZmogus.vardas.compareTo(jZmogus.vardas) > 0) {
            Zmogus x = zmones[i];
            zmones[i] = zmones[j];
            zmones[j]= x;
          }
        }
      }
//      System.out.println("Sulygiuoti");
//      for (Zmogus z : zmones) {
//      System.out.println(z.vardas + " " + z.pavarde);
//    }


//    class Mokinys {
//      String vardas;
//      String pavarde;
//      int klase;
//
//
//      Mokinys(String v, String p, int k) {
//        vardas = v;
//        pavarde = p;
//        this.klase = k;
//      }
//    }
//
//    Mokinys[] mokiniai = new Mokinys[] {
//            new Mokinys("Ona", "Kazlauskaite", 10),
//            new Mokinys("Ana", "Vladaite", 5),
//            new Mokinys("Jonas", "Antanaitis", 6),
//            new Mokinys("Petriukas", "Kukaitis", 9),
//            new Mokinys("Stasiukas", "Kukaitis", 9 ),
//            new Mokinys("Stasiukas", "Antanaitis", 4 ),
//            new Mokinys("Maryte", "Kazlauskaite", 10 ),
//
//    };
//
//    // TODO: cia reikes surusiuoti
//
//    for (int i = 0; i < mokiniai.length - 1; i++) {
//
//      for (int j = i + 1; j < mokiniai.length; j++) {
//        Mokinys iMokinys = mokiniai[i];
//        Mokinys jMokinys = mokiniai[j];
//        if (mokiniai[i].klase > mokiniai[j].klase) {
//          Mokinys y = mokiniai[i];
//          mokiniai[i] = mokiniai[j];
//          mokiniai[j] = y;
//        } else if (mokiniai[i].klase < mokiniai[j].klase) {
//          //nieko nedarom
//        } else if (mokiniai[i].pavarde.compareTo(mokiniai[j].pavarde) > 0) {
//          Mokinys y = mokiniai[i];
//          mokiniai[i] = mokiniai[j];
//          mokiniai[j] = y;
//        } else if (mokiniai[i].pavarde.compareTo(mokiniai[j].pavarde) < 0) {
//          { else if (mokiniai[i].vardas.compareTo(mokiniai[j].vardas) > 0) {
//            Mokinys y = mokiniai[i];
//            mokiniai[i] = mokiniai[j];
//            mokiniai[j] = y;
//          }
//          if (mokiniai[i].klase > mokiniai[j].klase ||
//                  mokiniai[i].klase == mokiniai[j].klase &&
//                          mokiniai[i].pavarde.compareTo(mokiniai[j].pavarde) > 0 ||
//                  mokiniai[i].klase == mokiniai[j].klase &&
//                          mokiniai[i].pavarde.compareTo(mokiniai[j].pavarde) == 0 ||
//                          mokiniai[i].vardas.compareTo(mokiniai[j].vardas) > 0
//          ) {
//            Mokinys y = mokiniai[i];
//            mokiniai[i] = mokiniai[j];
//            mokiniai[j] = y;
//          }
//          }
//      }
//    }

//    System.out.println("Mokinių sąrašas: ");
//      for (Mokinys m : mokiniai) {
//        System.out.println(m.klase + " " + m.pavarde + " " + m.vardas);
//      }




//    for (int i = 0; i < mokiniai.length - 2; i++) {
//
//      for (int j = i + 1; j < mokiniai.length; j++) {
//        Mokinys iMokinys = mokiniai[i];
//        Mokinys jMokinys = mokiniai[j];
//        if (iMokinys.pavarde.compareTo(jMokinys.pavarde) > 0 ) {
//          Mokinys y = mokiniai[i];
//          mokiniai[i] = mokiniai[j];
//          mokiniai[j] = y;
//        }
//      }
//    }
//    System.out.println("Pagal klase ir pavarde sulygiuota: ");
//    for (Mokinys m : mokiniai) {
//      System.out.println(m.klase + " " + m.pavarde + " " + m.vardas);
//    }

  }
}
