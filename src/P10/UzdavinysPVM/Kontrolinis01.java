package P10.UzdavinysPVM;

public class Kontrolinis01 {
  public static void main(String[] args) {

//    Kontrolinis #1. Parašykite Java programą (metodą),
//    kuri surastų kiek duotame tekste (tekstas perduodamas kaip parametras)
//    yra simbolių „a“, po kurių neina simbolis „b“. Pvz. tekste „baba“ yra vienas toks simbolis
//


    int yraA = KiekA("baba");
    System.out.println("baba yra: " + yraA);

    yraA = KiekA("abra kadabra");
    System.out.println("abra kadabra - " + yraA);

    }

    static int KiekA(String tekstas) {
    int kiek = 0;
    for (int i = 0; i < tekstas.length(); i++) {
      if (tekstas.charAt(i) == 'a' &&
        (i == tekstas.length() - 1 ||
              tekstas.charAt(i + 1) !='b')) {
        kiek++;
      }
      }

      return kiek;
    }


  }

