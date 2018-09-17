package P12.Collections.Employee.Demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AnoniminesKlases2 {



    public static void main(String[] args) {

      List<Double> skaiciai = Arrays.asList(2., 5., 8., 9.);

      skaiciai = action(skaiciai, new MyAction());

      System.out.println(skaiciai);

      skaiciai = action(skaiciai, new MyAction2());

      System.out.println(skaiciai);

      skaiciai = action(skaiciai, new IMyAction() {
        @Override
        public Double execute(Double x) {
          return x / 3;
        }
      });

      System.out.println(skaiciai);

      skaiciai = action(skaiciai, new IMyAction() {
        @Override
        public Double execute(Double x) {
          return x * 3;
        }
      });

      System.out.println(skaiciai);

    }

    static List<Double> action(List<Double> skaiciai, IMyAction action) {
      List<Double> naujas = new ArrayList<>();
      for (Double d : skaiciai) {
        naujas.add(action.execute(d));
      }
      return naujas;
    }
  }

  interface IMyAction {
    Double execute(Double x);
  }


  class MyAction implements IMyAction {

    public Double execute(Double x) {
      return x * x;
    }
  }

  class MyAction2 implements IMyAction {

    public Double execute(Double x) {
      return x + 2;
    }
  }


