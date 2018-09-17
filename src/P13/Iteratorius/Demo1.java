package P13.Iteratorius;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Demo1 {

  public static void main(String[] args) {

    ManoKolekcija daiktai = new ManoKolekcija();
    daiktai.add(new P13Daiktai("A", 120));
    daiktai.add(new P13Daiktai("X", 99));
    daiktai.add(new P13Daiktai("X", 12));
    daiktai.add(new P13Daiktai("Y", 13));

//    Iterator<P13Daiktai> it = daiktai.iterator();
//    while (it.hasNext()) {
//      P13Daiktai obj = it.next();
//      if (obj.name.equals("X")) it.remove();
//    }

    for (P13Daiktai obj : daiktai) {
      System.out.println((obj.name + " " + obj.length));
    }

    System.out.println("Reverse:");
//        Iterator<P13Daiktai> reverse = daiktai.reverseIterator();
//        while (reverse.hasNext()) {
//            P13Daiktai obj = reverse.next();
//            System.out.println(obj.name + " " + obj.length);
//        }

    for (P13Daiktai obj : daiktai.r()) {
      System.out.println(obj.name + " " + obj.length);
    }

  }
}
  class P13Daiktai {
    String name;
    int length;

    public P13Daiktai(String name, int length) {
      this.name = name;
      this.length = length;
    }
  }

  class ManoKolekcija implements Iterable<P13Daiktai> {

    List<P13Daiktai> listas = new ArrayList<>();

    public void add(P13Daiktai elementas) {
      listas.add(elementas);
    }

  //  class A implements Iterable<P13Daiktai> {

 //     @Override
//        public Iterator<P13Daiktai> iterator() {
//            return ManoKolekcija.this.reverseIterator();
//        }
//    }
//
//    public A r() {
//        return new A();
//    }
//    }

    public Iterable<P13Daiktai> r() {
      return new Iterable<P13Daiktai>() {
        @Override
        public Iterator<P13Daiktai> iterator() {
          return ManoKolekcija.this.reverseIterator();
        }
      };
    }
    @Override
    public Iterator<P13Daiktai> iterator() {
      return listas.iterator();
    }

    public Iterator<P13Daiktai> reverseIterator() {
      return new AA(listas);

          //        return new Iterator<P13Daiktai>() {
//
//            int index = listas.size();
//
//            @Override
//            public boolean hasNext() {
//                return index > 0;
//            }
//
//            @Override
//            public P13Daiktai next() {
//                return listas.get(--index);
//            }
//        };
        }
    }

    class AA implements Iterator <P13Daiktai> {

      List<P13Daiktai> listas;
      int index;

      public AA(List<P13Daiktai> listas) {
        this.listas = listas;
        this.index = listas.size();
      }


        @Override
        public boolean hasNext() {

          return index > 0;
        }

        @Override
        public P13Daiktai next() {

          return listas.get(--index);
        }

    }