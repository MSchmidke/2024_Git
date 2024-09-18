import java.util.List;

public class Beispielpark {

  public static void main(final String[] args) {
    var park = new Freizeitpark("Phantasialand");
    var besucher = List.of(//
        new Parkbesucher("Tim", 22, 175, true)//
        , new Parkbesucher("Anna", 28, 160, true)//
        , new Parkbesucher("Leon", 35, 185, false)//
    );
    System.out.println(park);
    System.out.println(besucher);
  }

}
