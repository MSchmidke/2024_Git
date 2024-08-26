public class Imbissstand {

  private final String name;
  private final String essensart;
  private final double preis;

  public Imbissstand(final String name, final String essensart, final double preis) {
    this.name = name;
    this.essensart = essensart;
    this.preis = preis;
  }

  public String getName() {
    return name;
  }

  public String getEssensart() {
    return essensart;
  }

  public double getPreis() {
    return preis;
  }

  public void verkaufeEssen(final Parkbesucher besucher) {
    if (besucher.hatTicket()) {
      System.out.println(besucher.getName() + " hat " + essensart + " von " + name + " für " + preis + " Euro gekauft.");
    }
    else {
      System.out.println(besucher.getName() + " kann ohne Ticket kein Essen kaufen.");
    }
  }

  @Override
  public String toString() {
    return "Imbissstand{" + "name='" + name + '\'' + ", essensart='" + essensart + '\'' + ", preis=" + preis + '}';
  }
}
