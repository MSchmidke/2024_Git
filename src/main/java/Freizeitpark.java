import java.util.ArrayList;
import java.util.List;

public class Freizeitpark {

  private final String name;
  private final List<Imbissstand> imbissstaende;

  public Freizeitpark(final String name) {
    this.name = name;
    this.imbissstaende = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void fuegeImbissstandHinzu(final Imbissstand imbissstand) {
    imbissstaende.add(imbissstand);
  }

  public void listeImbissstaendeAuf() {
    System.out.println("Imbissstände im " + name + ":");
    for (Imbissstand imbissstand : imbissstaende) {
      System.out.println(imbissstand);
    }
  }

  @Override
  public String toString() {
    return "Park {\nname=" + name + ", \nImbissstände=" + imbissstaende + "\n}";
  }

}
