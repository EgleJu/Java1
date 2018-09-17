package P12.Collections.Employee.Uzd.SvorisTurisSpalva;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

//Uzdavinys - pataisyti programa, kad sort metodas butu universalus, t.t.
// galima butu rusiuoti ir pagal svori, ir pagal turi ir pagal spalva + svori.

public class Demo5 {
  public static void main(String[] args) {

    List<Daiktas> daiktai = new ArrayList<>();
    daiktai.add(new Daiktas("baltas", 25, 1.5));
    daiktai.add(new Daiktas("baltas", 60, 1.5));
    daiktai.add(new Daiktas("juodas", 20, 3));
    daiktai.add(new Daiktas("mėlynas", 35, 2));
    daiktai.add(new Daiktas("žalias", 12, 0.9));
    print(daiktai, "Pradiniai:");

    daiktai = sort(daiktai, new Rusiuoti() {
      public boolean lyginti (Daiktas d1, Daiktas d2){
        return d1.svoris > d2.svoris;

        }
    });
    print(daiktai, "Surušiuota pagal svori: ");



    daiktai = sort(daiktai, new Rusiuoti() {
      @Override
      public boolean lyginti(Daiktas d1, Daiktas d2) {
        return (d1.turis > d2.turis);
      }
    });
    print(daiktai, "Surušiuota pagal tūrį: ");



    daiktai = sort(daiktai, new Rusiuoti() {
      @Override
      public boolean lyginti(Daiktas d1, Daiktas d2) {
        int cmp = d1.spalva.compareTo(d2.spalva);
       if (cmp < 0) return false;
        if (cmp > 0) return true;
       return d1.svoris > d2.svoris;

// DESTYTOJO
//        return cmp < 0 ? false :
//                cmp > 0 ? true :
//                        d1.svoris > d2.svoris;

       // return cmp != 0 ? cmp > 0 : d1.svoris > d2.svoris;

 //   MANO
//        if ((d1.spalva + d2.svoris).compareTo(d2.spalva + d2.svoris) > 1) {
//          return true;
//        } else {
//          return false;
//        }
      }
    });
    print(daiktai, "Surušiuota pagal spalva + svoris: ");


  }

  static void print(Collection<Daiktas> daiktai, String title) {
    System.out.println(title);
    for (Daiktas d : daiktai) {
      System.out.println(d.numeris + " " + d.spalva + " " + d.svoris + " " + d.turis);
    }
  }

  static List<Daiktas> sort(List<Daiktas> daiktai, Rusiuoti daiktas) {

    List<Daiktas> resultatas = new ArrayList<>();

    while (daiktai.size() > 0) {
      int index = 0;
      if (daiktai.size() == 1) {
        resultatas.add(daiktai.get(0));
        daiktai.clear();

      } else {
        for (int i = 1; i < daiktai.size(); i++) {
          if (daiktai.get(index).svoris > daiktai.get(i).svoris) {
            index = i;
          }
        }
        resultatas.add(daiktai.get(index));
        daiktai.remove(index);
      }
    }
    return resultatas;
  }
}

interface Rusiuoti {
  boolean lyginti(Daiktas d1, Daiktas d2);
}

class Daiktas {

  private static int skaitliukas = 1;

  int numeris;
  String spalva;
  double svoris;
  double turis;

  public Daiktas(String spalva, double svoris, double turis) {
    this.spalva = spalva;
    this.svoris = svoris;
    this.turis = turis;
    this.numeris = skaitliukas++;
  }
}


