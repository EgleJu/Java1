package P12.Collections.Employee;
//    UŽDAVINYS
//   *** Tarkime turime klasę Employee ir jos vidinę klasę Address.
//       Tegul klasėje Employee turime du laukus - String name ir Address address,
//       o Address klasė turi laukus - String city, String street, String number.
//       Sukurkite keletą darbuotojų su vardu ir adresu ir pabandykit nustatyti
//       iš kelių skirtingų miestų yra darbuotojai.

//   ***Nustatykite iš kelių skirtingų miestų ir gatvių yra darbuotojai




public class Darbuotojai {

  String name;
  Address address;

  public Darbuotojai(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  static class Address {

    String city;
    String street;
    String number;

    public Address(String city, String street, String number) {
      this.city = city;
      this.street = street;
      this.number = number;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


}

//DESTYTOJO

//public class DarbuotojuAtlyginimai {
//
//  public static void main(String[] args) {
//
//    List<Employee> zmones = new ArrayList<>();
//    zmones.add(new Employee("Jonas", "Babtai", "Lygioji", "1"));
//    zmones.add(new Employee("Ona", "Vilnius", "Lenku", "13"));
//    zmones.add(new Employee("Petras", "Vilnius", "Vytauto", "9"));
//    zmones.add(new Employee("Kazys", "Vilnius", "Vytauto", "1"));
//
//    System.out.println("Viso zmoniu " + zmones.size());
//
//    Set<String> miestai = new HashSet<>();
//    for (Employee e : zmones) {
//      miestai.add(e.address.city);
//    }
//    System.out.println("Viso skirtingu miestu " + miestai.size());
//
//    miestai.clear();
//    for (Employee e : zmones) {
//      miestai.add(e.address.city + e.address.street);
//    }
//    System.out.println("Viso skirtingu miestu + gatviu " + miestai.size());
//
//    Employee.Address a = new Employee.Address("Kaunas", "Kranto 12", "13");
//
//  }
//}
//class Employee {
//  String name;
//  Address address;
//
//  public Employee(String name, String city, String street, String number) {
//    this.name = name;
//    this.address = new Address(city, street, number);
//  }
//
//  static class Address {
//    String city;
//    String street;
//    String number;
//
//    public Address(String city, String street, String number) {
//      this.city = city;
//      this.street = street;
//      this.number = number;
//    }
//  }
//}