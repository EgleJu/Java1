package P08.Figura;

public class Trikampis extends Figura {

  double a,b,c;


  public Trikampis(String color, double a, double b, double c) {
    super(color);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public double Plotas() {
    double pp = Perimetras() / 2;
    return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
  }

  @Override
  public double Perimetras() {
    return a + b + c;
  }
}
