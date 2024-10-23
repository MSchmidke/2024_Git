public class Veranstaltung {

  private final String name;
  private final String datum;
  private final String beschreibung;

  public Veranstaltung(final String name, final String datum, final String beschreibung) {
    this.name = name;
    this.datum = datum;
    this.beschreibung = beschreibung;
  }

  // Getter und Setter
  public String getName() {
    return name;
  }

  public String getDatum() {
    return datum;
  }

  public String getBeschreibung() {
    return beschreibung;
  }

  public void starteVeranstaltung() {
    System.out.println("Die Veranstaltung '" + name + "' findet am " + datum + " statt.");
    System.out.println("Beschreibung: " + beschreibung);
  }
}
