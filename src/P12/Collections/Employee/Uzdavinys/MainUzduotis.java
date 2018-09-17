package P12.Collections.Employee.Uzdavinys;

import P12.Collections.Employee.Darbuotojai;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainUzduotis {

  public static void main(String[] args) {


    Collection<Darbuotojas> darbuotojai = new ArrayList<>();
    darbuotojai.add(new Darbuotojas("Kazys",BigDecimal.valueOf(123.50)));
    darbuotojai.add(new Darbuotojas("Maryte",BigDecimal.valueOf (500.00)));
    darbuotojai.add(new Darbuotojas("Petrute",BigDecimal.valueOf (425.25)));
    darbuotojai.add(new Darbuotojas("Valius",BigDecimal.valueOf (367.15)));
    darbuotojai.add(new Darbuotojas("Antanina",BigDecimal.valueOf (235.75)));

    print("Pradiniai: ", darbuotojai);

    // + 50 eur
    //DarbMod m1 = new M1();
    DarbMod m1 = new DarbMod(){
      @Override
      public void modifikuoti(Darbuotojas d) {
        d.atlyginimas = d.atlyginimas.add(BigDecimal.valueOf(50));
      }
    };
    //    for(Darbuotojas d: darbuotojai){
//      d.atlyginimas = d.atlyginimas.add(BigDecimal.valueOf(50));
//      m1.modifikuoti(d);
//   }
    modifikuoti(darbuotojai, m1);
    print("+50.00: ", darbuotojai);



    // DarbMod m2 = new M2() {
    DarbMod m2 = new DarbMod() {
      @Override
      public void modifikuoti(Darbuotojas d) {
        d.atlyginimas =d.atlyginimas.add(BigDecimal.valueOf(1.1));
      }
    };
   modifikuoti(darbuotojai, m2);
    print("+10 proc: ", darbuotojai);
    //        for (Darbuotojas d : darbuotojai) {
//           // d.atlyginimas = d.atlyginimas.multiply(BigDecimal.valueOf(1.1));
//            m2.modifikuoti(d);
//        }




    }
  static void modifikuoti (Collection < Darbuotojas > darbuotojai, DarbMod m){
    for (Darbuotojas d : darbuotojai) {
      m.modifikuoti(d);
    }
  }



  static void print (String title, Collection < Darbuotojas > darbuotojai){
    System.out.println(title);
    for (Darbuotojas d : darbuotojai) {
      System.out.println(d.vardas + " " + d.atlyginimas);
    }
  }

  }



  interface DarbMod {
    void modifikuoti(Darbuotojas d);
  }

  class M1 implements DarbMod {
    @Override
    public void modifikuoti(Darbuotojas d) {
      d.atlyginimas = d.atlyginimas.add(BigDecimal.valueOf(50));

    }
  }

  class M2 implements DarbMod {

    @Override
    public void modifikuoti(Darbuotojas d) {
      d.atlyginimas =d.atlyginimas.add(BigDecimal.valueOf(1.1));
    }
  }


  class Darbuotojas {

  String vardas;
  BigDecimal atlyginimas;

  public Darbuotojas(String vardas, BigDecimal atlyginimas) {
    this.vardas = vardas;
    this.atlyginimas = atlyginimas;
  }
}
