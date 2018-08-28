public class Trikampiai {
  public static void main(String[] args) {



    trikampis(1, 2, 4);

    double[][] a = {
            {8, 10, 2},
            {8, 2, 10},
            {2, 8, 10},
            {-8, 10, 3},
            {8, -10, 3},
            {8, 10, -3},
            {4, 4, 4},
            {8, 10, 8},
            {4, 3, 5}
    };

    for (double[] e : a) {
      trikampis(e[0], e[1], e[2]);
    }

  }

  static void trikampis(double a, double b, double c) {
    System.out.print(a + " " + b + " " + c);

    if (a >= b + c || b >= a + c || c >= a + b) {
      System.out.println(" nera trikampis");
    } else {
      System.out.print(" yra ");

      if (a == b && a == c) {
        System.out.println("lygiakrastis");
      } else if (a == b || a == c || b == c) {
        System.out.println("lygiasonis");
      } else {
        System.out.println("belenkoks");
      }
    }



  int[] skaiciukai = {5, 10, 6, 8, 3, 4};

  boolean arKazkaKeitem = true;
  int zingsniai = 0;

        while (arKazkaKeitem) {

                arKazkaKeitem = false;

                for (int i = 0; i < skaiciukai.length - 1; i++) {

        zingsniai++;

        if (skaiciukai[i] > skaiciukai[i + 1]) {
        arKazkaKeitem = true;

        int x = skaiciukai[i];
        skaiciukai[i] = skaiciukai[i + 1];
        skaiciukai[i + 1] = x;
        }
        }
        }

        System.out.println("Viso zingsniu: " +  zingsniai);
        for (int e : skaiciukai) {
        System.out.println(" " + e);
        }




//    double[][] a = {
//            {8, 10, 2},
//            {3, 4, 5},
//            {5, 5, 5},
//            {5, 6, 5},
//            {8, 10, 2},
//    };
//    //for (int i = 0; i < a.length)
//    for (double[] e : a) {
//      System.out.println(e[0] + " " + e[1] + " " + e[2]);
//      if (e[0] >= e[1] + e[2] || e[1] >= e[0] + e[2] || e[2] >= e[0] + e[1]) {
//        System.out.println(" Nera trikampis");
//      } else {
//        System.out.println(" yra ");
//
//        if (e[0] == e[1] && e[0] == e[2]) {
//          System.out.println(" Lygiakrastis");
//        } else if (e[0] == e[1] || e[0] == e[2] || e[1] == e[2]) {
//          System.out.println("lygiasonis");
//        } else {
//          System.out.println("belenkoks");
//        }
//      }




//             double[] b = {10, -2, 3.5, 46, 555, 6.25};
//
//             for (int i = 0; i < b.length; i++) {
//               System.out.println(" elemento su indeksu " + i + " reiksme yra " + b[i]);
//             }
//
//             for (double x : b ) {
//               System.out.println("Elemento reiksme " + x);
//             }

//    }
//
//    int[] skaiciukai = {5, 10, 6, 8, 3, 4};
//
//    boolean arKazkaKeitem = true;
//    int zingsniai = 0;
//
//    while (arKazkaKeitem) {
//
//      arKazkaKeitem = false;
//
//      for (int i = 0; i < skaiciukai.length - 1; i++) {
//
//        zingsniai++;
//
//        if(skaiciukai[i] > skaiciukai[i + 1]) {
//          arKazkaKeitem = true;
//
//          int x = skaiciukai[i];
//          skaiciukai[i] = skaiciukai[i + 1];
//          skaiciukai[i + 1] = x;
//        }
//      }
//    }
//    System.out.println("Viso zingsniai " + zingsniai);
//    for (int e : skaiciukai) {
//      System.out.println(" " + e);
//    }
  }
}
