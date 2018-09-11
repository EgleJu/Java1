package P10.UzdavinysPVM;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {

    // Tarkime yra parduota kažkiek prekių (x) už kažkokią kainą (y) ir tai
    //sudaro kažkokią sumą (z). Visos šitos sumos yra su PVM 21%.
    //Parašykite metodą/funkciją kurią iškvietus su parametrais: kiekis, suma
    //su PVM - ta funkcija atspausdintų pardavimo įrašą tokiu formatu:
    //1. prekės kaina be PVM (tikslumas ? ženklai po kablelio)
    //2. kiekis
    //3. suma be PVM (tikslumas 2 ženklai po kablelio)
    //4. PVM suma (tikslumas 2 ženklai po kablelio)
    //5. viso suma su PVM (tikslumas 2 ženklai po kablelio)

    Prekes [] prekiuSuma = new Prekes [] {
            new Prekes("Rašiklis",  2.5, 10, 0.21),
            new Prekes("Žirklės",  3.0, 27, 0.21),
            new Prekes("Sąsiuvinis",  1.0, 100, 0.21),
            new Prekes("Pieštukas",  0.5, 25.5, 0.21),
            new Prekes("Trintukas",  0.6, 12, 0.21),

    };

    for (Prekes p : prekiuSuma) {
      System.out.println("Prekes pavadinimas: " + p.preke + "  (1) Prekes kaina be PVM: " + p.KainaBePVM() + " (2) Prekiu kiekis: " + p.Kiekis() + " (3) Suma be PVM: "
             + p.SumaBePVM() + " (4) PVM suma: " + p.PVMSuma() + " (5) Viso suma su PVM: " + p.VisoSumaSuPVM());
    }

    BigDecimal a1 = BigDecimal.valueOf(1234,2);
    System.out.println(a1);

  }
}
