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
      };

      for (Zmogus z : zmones) {
        System.out.println(z.vardas + " " + z.pavarde);
      }





  }
}
