import java.util.Arrays;

public class UzdaviniaiKintamieji {
  public static void main(String[] args) {

    // Duoti trys skaičiai: a, b, c. Nustatykite ar šie skaičiai gali būti
    //trikampio kraštinių ilgiai ir jei gali tai kokio trikampio:
    //lygiakraščio, lygiašonio ar įvairiakraščio. Atspausdinkite
    //atsakymą. Kaip pradinius duomenis panaudokite tokius skaičius:
    //3, 4, 5
    //2, 10, 8
    //5, 6, 5
    //5, 5, 5


    int a = 3;
    int b = 4;
    int c = 5;
    if (a < b + c && b < a + c && c < a + b && a == b && b == c && a == c) {
      System.out.println("Gali būti trikampiu" + " lygiakraščiu");
    } else if (a < b + c && b < a + c && c < a + b && (a == b || a == c || b == c)) {
      System.out.println("Gali būti trikampiu" + " lygiašoniu");
    } else if (a < b + c && b < a + c && c < a + b) {
      System.out.println("Gali būti trikampiu" + " įvairiakraščiu");
    } else {
      System.out.println(" Negali būti trikampiu");
    }

    int p = (a + b + c) / 2;
    double plotas = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    System.out.println("Plotas = " + plotas);

    //Duotas masyvas {-10, 0, 2, 9, -5}. Surūšiuokit masyvo
    //elementus mažėjimo tvarka ir atspausdinkite.

    int[] Masyvas = {-10, 0, 2, 9, -5};

    System.out.println("Masyvas: " + Arrays.toString(Masyvas));
    for (int i = 0; i < Masyvas.length; i++)
      for (int j = 0; j < Masyvas.length; j++) {
        if (Masyvas[j] < Masyvas[i]) {
          Masyvas[i] = Masyvas[i] + Masyvas[j];
          Masyvas[j] = Masyvas[i] - Masyvas[j];
          Masyvas[i] = Masyvas[i] - Masyvas[j];
        }
      }
    System.out.println("Surikiuotas Masyvas:" + Arrays.toString(Masyvas));

    // Turime du masyvus int[] a = {5, 6, 10, 15, 8, 4} ir int[] b = {8,
    //5, 3}. Raskite kiekvieno masyvo skaičių vidurkį ir
    //atspausdinkite jų skirtumą. Rezultatas turi gautis:
    //2.66666…


    int[] e = {5, 6, 10, 15, 8, 4};
    int[] f = {8, 5, 3};
    double sumaeMasyvo = 0;
    double sumafMasyvo = 0;
    for (int i = 0; i < e.length; i++) {
      sumaeMasyvo += e[i];
    }
    for (int j = 0; j < f.length; j++) {
      sumafMasyvo += f[j];

    }
    System.out.println(sumaeMasyvo / e.length - sumafMasyvo / f.length);

    // Tobuluoju skaičiumi vadinamas natūralusis skaičius, lygus
    //visų savo daliklių, mažesnių už save patį, sumai.
    //pvz 28 = 1 + 2 + 4 + 7 + 14
    //Suraskite visus tokius skaičius iš intervalo 1…1000.

    int z = 1000; int i = 1;
    for (i = 1; i <= z; i++) {
     int dalikliuSuma = 0;
      for (int k = 1; k < i; k++) {
        if ((i % k) == 0) {
          dalikliuSuma += k;
        }
      }
          if (dalikliuSuma == i) {
            System.out.println("Tobulas skaičius yra " + dalikliuSuma);
          }
        }

// 1) Suraskite duotame intervale visus pirminius skaičius ir juos atspausdinkite


      int j = 0;
    int num = 0;

    String pirminiaiSkaiciai = "";

    for (j = 1; j <= 50; j++) {
      int skaitiklis = 0;
      for (num = j; num >= 1; num--) {
        if (j % num == 0) {
          skaitiklis = skaitiklis + 1;
        }

      }
      if (skaitiklis == 2) {
        pirminiaiSkaiciai = pirminiaiSkaiciai + j + " ";
      }
    }
    System.out.println("Pirminiai skaiciai nuo 1 iki 50 yra : ");
    System.out.println(pirminiaiSkaiciai);

    // Parašykite programą, kuri mokėtų suapvalinti
    // double tipo skaičius pagal nurodytą tikslumą.
    // Panaudokite matematinę funkciją Math.floor(…).

    double x = 1234.69;
    double y = -497.99;

    System.out.println("Math.floor(" + x + ")=" + Math.floor(x * 10.0 + 0.5)/10.0);
    System.out.println("Math.floor(" + y + ")=" + Math.floor(y));
    System.out.println("Math.floor(0)="+ Math.floor(0));
    System.out.println("Math.floor(52.366)="+ Math.floor(52.366 * 100.0 + 0.5)/100.0);
    System.out.println("Math.floor(5697.10)="+ Math.floor(5697.10 * 10.0 + 0.5)/10.0);
    System.out.println("Math.floor(999.061)="+ Math.floor(999.061 * 100.0 + 0.5)/100.0);






  }

}
