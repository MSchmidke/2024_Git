public class Veranstaltung {

  private final String name;
  private final String datum;

  public Veranstaltung(final String name, final String datum) {
    this.name = name;
    this.datum = datum;
  }

  public String getName() {
    return name;
  }

  public String getDatum() {
    return datum;
  }

}
