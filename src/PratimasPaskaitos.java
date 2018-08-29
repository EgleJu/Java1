import java.sql.Array;
import java.util.Arrays;

public class PratimasPaskaitos {
  public static void main(String[] args) {


      class Zmogus {
        String vardas;
        String pavarde;


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
      System.out.println("Sulygiuoti");
      for (Zmogus z : zmones) {
      System.out.println(z.vardas + " " + z.pavarde);
    }


    class Mokinys {
      String vardas;
      String pavarde;
      String klase;


      Mokinys(String v, String p, String k) {
        vardas = v;
        pavarde = p;
        klase = k;
      }
    }

    Mokinys[] mokiniai = new Mokinys[] {
            new Mokinys("Ona", "Kazlauskaite", "10"),
            new Mokinys("Ana", "Vladaite", "5"),
            new Mokinys("Jonas", "Antanaitis", "6"),
            new Mokinys("Petriukas", "Kukaitis", "9"),
            new Mokinys("Stasiukas", "Kukaitis", "4" ),

    };

    System.out.println("Mokinių sąrašas: ");
      for (Mokinys m : mokiniai) {
        System.out.println(m.vardas + " " + m.pavarde + " " + m.klase);
      }
  }
}
