package P13.Iteratorius.Automobiliai;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Uzdavinys {

//  Sukurkite automobilių klasę su laukais: numeris, marke,
//  savininkas (vardas, pavarde)
//  Išveskite automobilius sulygiuotus pagal savininko pavardę,
//  vardą ir automobilio numerį

  public static void main(String[] args) {

    List <Automobiliai> AutoInfo = new ArrayList<>() ;
    AutoInfo.add ( new Automobiliai("YTM771", "Mazda", "Juozas Juozukas"));
    AutoInfo.add ( new Automobiliai("OKJ789", "Audi", "Petras Petraitis"));
    AutoInfo.add ( new Automobiliai("EGJ456", "Ferrari", "Ona Onute"));
    AutoInfo.add ( new Automobiliai("CGM123", "Opel", "Romas Romutis"));
    AutoInfo.add ( new Automobiliai("FUC753", "BMW", "Egle Eglute"));
  }
}

class Automobiliai {
  String numeris;
  String marke;
  String savininkas;

  public Automobiliai(String numeris, String marke, String savininkas) {
    this.numeris = numeris;
    this.marke = marke;
    this.savininkas = savininkas;
  }
}