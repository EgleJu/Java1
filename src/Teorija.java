public class Teorija {
  public static void main(String[] args) {

    int[] m;

    m = new int[]{2,3,4};

    m[2] = 12;
    //...
    m = new int[10];
    m[0] = 10;
    m[1] = 22;

    int suma = 0;
    for(int k = 0; k < m.length; k++) {
      suma += m[k];

    }
    System.out.println("masyvo elementu suma = " + suma);
    System.out.println("masyvo elementu vidurkis = " + 1.0 * suma/m.length);
  }
}
