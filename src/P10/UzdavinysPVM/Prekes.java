package P10.UzdavinysPVM;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prekes {

  // Tarkime yra parduota kažkiek prekių (x) už kažkokią kainą (y) ir tai
  //sudaro kažkokią sumą (z). Visos šitos sumos yra su PVM 21%.
  //Parašykite metodą/funkciją kurią iškvietus su parametrais: kiekis, suma
  //su PVM - ta funkcija atspausdintų pardavimo įrašą tokiu formatu:
  //1. prekės kaina be PVM (tikslumas ? ženklai po kablelio)
  //2. kiekis
  //3. suma be PVM (tikslumas 2 ženklai po kablelio)
  //4. PVM suma (tikslumas 2 ženklai po kablelio)
  //5. viso suma su PVM (tikslumas 2 ženklai po kablelio)

  String preke;

  double kaina;

  double suma;

  double PVM;


  public Prekes(String preke, double kaina, double suma, double PVM) {
    this.preke = preke;
    this.kaina = kaina;
    this.suma = suma;
    this.PVM = PVM;

  }

  BigDecimal KainaBePVM() {
    BigDecimal KainaBePVM = new BigDecimal(kaina - (kaina * PVM));
    KainaBePVM = KainaBePVM.setScale(2, RoundingMode.CEILING);
    return KainaBePVM;
  };

  double Kiekis() {
    return suma/kaina;
  };

  BigDecimal SumaBePVM() {
    BigDecimal SumaBePVM = new BigDecimal (suma - (suma * PVM));
    SumaBePVM = SumaBePVM.setScale(2, RoundingMode.CEILING);
    return SumaBePVM;
  };

  BigDecimal PVMSuma() {
    BigDecimal PVMSuma = new BigDecimal(suma * PVM);
    PVMSuma = PVMSuma.setScale(2,RoundingMode.CEILING);
    return PVMSuma;
  };

  BigDecimal VisoSumaSuPVM() {
    BigDecimal VisoSumaSuPVM = new BigDecimal((suma * PVM) + suma);
    VisoSumaSuPVM = VisoSumaSuPVM.setScale(2, RoundingMode.CEILING);
    return VisoSumaSuPVM;
  };

  // BigDecimal kainSuPVM = kainaSuPVM.divide(BigDecimal.valueOf(1.21, RoundingMode.HALF_UP;
  //BigDecimal pvmSuma = kainaSuPVM.substract(kainaBePVM);

}
