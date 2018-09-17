package P12.Collections.Employee.Demo3;

public class AnoniminesKlases {


  /**
   * HelloWorld
   * Created by valdas on 2018-09-12.
   */


    public static void main(String[] args) {

      IA o = new A();
      System.out.println(o.a());
      {
        class R0 implements IA {
          public String a() { return "OK"; }
        };
        o = new R0();
      }
      System.out.println(o.a());

      // is interfeiso
//        {
//            class X implements IA {
//                @Override
//                public String a() {
//                    return "NO";
//                }
//            }
//            o = new X();
//        }
      o = new IA() {
        @Override
        public String a() {
          return "NO";
        }
      };
      System.out.println(o.a());

      // is klases
//        {
//            class X extends B {
//                @Override
//                public String a() {
//                    return "YES-YES";
//                }
//            }
//            B o1 = new X();
//        }
      B o1 = new B() {
        @Override
        public String a() {
          return "YES-YES";
        }
      };
      System.out.println(o1.a());

      o1 = new B() {
        @Override
        public String a() {
          return "NO-NO";
        }
      };
      System.out.println(o1.a());
    }
  }

  interface IA {
    String a();
  }

  abstract class B implements IA {
    @Override
    public String a() {
      return "MAYBE";
    }
  }

  class A implements IA {

    @Override
    public String a() {
      return "YES";
    }
  }








