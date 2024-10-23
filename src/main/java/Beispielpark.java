import java.util.List;

public class Beispielpark {

  public static void main(final String[] args) {
    var park = new Freizeitpark("Phantasialand");
    var besucher = List.of(//
        new Parkbesucher("Tim", 22, 175, true)//
        , new Parkbesucher("Anna", 28, 160, true)//
        , new Parkbesucher("Leon", 35, 185, false)//
        , new Parkbesucher("Ben", 41, 177, true)//
        , new Parkbesucher("Lisa", 30, 164, false)//
        , new Parkbesucher("Ole", 19, 173, true)//
        , new Parkbesucher("Lukas", 43, 186, false)//
        , new Parkbesucher("Elena", 29, 165, true)//
        , new Parkbesucher("Jakob", 24, 179, true)//
    );
    System.out.println(park);
    System.out.println(besucher);
  }

}
