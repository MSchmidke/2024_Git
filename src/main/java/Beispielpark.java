public class Beispielpark {

  public static void main(final String[] args) {
    var park = new Freizeitpark("Phantasialand");
    System.out.println(park);
    var familie = List.of(//
        new Parkbesucher("Lukas Müller", 15, 160, true), //
        new Parkbesucher("Sophie Müller", 12, 150, true));
    System.out.println(familie);
  }

}
