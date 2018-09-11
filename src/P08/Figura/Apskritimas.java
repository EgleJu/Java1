package P08.Figura;

public class Apskritimas extends Figura {

  double d;

  public Apskritimas(String color, double d) {
    super(color);
    this.d = d;
  }

  @Override
  public double Plotas() {
    return Math.PI * d * d / 4;
  }

  @Override
  public double Perimetras() {
    return Math.PI * d;
  }

  // plotas = pi * d * d / 4
  // 1 = pi * d * d / 4 / plotas
  // 1 /(d*d) = pi / 4 / plotas
  // d*d = 1 / (pi / 4 / plotas)

  static Apskritimas pagalPlota(double plotas) {
    double d = Math.sqrt(1.0 / (Math.PI / 4.0 / plotas));
    return new Apskritimas(null, d);

  }

}
