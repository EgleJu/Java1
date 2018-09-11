package P09.Mokejimas;

public interface Mokejimai {

  String getVardas();

  String getBankoSaskait();

  double getSaskaita();

//  default String makeString() {
//    return ""
//  }


//  Aprašykite interfeisą Mokėjimas (Payment) su šiais metodais:
//          ‣ banko sąskaita (bank account) - grąžina banko sąskaitos
//          numerį
//‣ sąskaitos turėtojas (account owner) - fizinio ar juridinio asmens
//  pavadinimas
//‣ suma (amount) - pervedama suma
//  Sukurkite klases Darbuotojas (Employee) ir Klientas (Client), kurios
//  implementuoja Mokėjimas interfeisą. Sukurkite masyvą iš keleto
//  darbuotojų ir klientų objektų ir cikle išveskite jų mokėjimo informaciją

//  Papildomas uzdavinys:
//  Modifikuokite klasę Klientas (Client), kad joje galima būtų kaupti atliktų mokėjimų sumas (naudokite masyvą).
//          2) Atspausdinkite klientus, su kuriais buvo atlikta daugiausia mokėjimų
//3) Atspausdinkite klientus kurių bent vienas mokėjimas viršija visų mokėjimų vidurkį bent 2 kartus
}
