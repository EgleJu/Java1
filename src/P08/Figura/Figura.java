package P08.Figura;

public abstract class Figura {

    String color;

    public Figura(String color) {
      this.color = color;
    }

    public String getColor() {
      return color;
    }

    public void setColor(String color) {
      this.color = color;
    }


  public abstract double Perimetras();

  public abstract double Plotas();

  public double pusplotis() {
    return Plotas()/2;
  }


}

