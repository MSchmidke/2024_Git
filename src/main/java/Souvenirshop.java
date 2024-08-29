import java.util.List;

public class Souvenirshop {

  private final String name;
  private final List<String> artikel;
  private final double preis;

  public Souvenirshop(final String name, final List<String> artikel, final double preis) {
    this.name = name;
    this.artikel = artikel;
    this.preis = preis;
  }

  // Getter und Setter
  public String getName() {
    return name;
  }

  public List<String> getArtikel() {
    return artikel;
  }

  public double getPreis() {
    return preis;
  }

  public void zeigeAngebote() {
    System.out.println("Im " + name + " gibt es folgende Souvenirs:");
    for (String artikel : artikel) {
      System.out.println("- " + artikel + " für " + preis + " Euro");
    }
  }
}
