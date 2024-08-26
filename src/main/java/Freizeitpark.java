import java.util.ArrayList;
import java.util.List;

public class Freizeitpark {

  private final String name;
  private final List<Attraktion> attraktionen;

  public Freizeitpark(final String name) {
    this.name = name;
    this.attraktionen = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void fügeAttraktionHinzu(final Attraktion attraktion) {
    attraktionen.add(attraktion);
  }

  public void listeAttraktionenAuf() {
    System.out.println("Attraktionen im " + name + ":");
    for (Attraktion attraktion : attraktionen) {
      System.out.println(attraktion);
    }
  }

  @Override
  public String toString() {
    return "Park {\nname=" + name + ", \nAttraktionen=" + attraktionen + "\n}";
  }

}
