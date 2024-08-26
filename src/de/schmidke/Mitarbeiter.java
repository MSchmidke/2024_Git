public class Mitarbeiter {

  private final String name;
  private final Rolle rolle;
  private final int schichtdauer; // in Stunden

  public Mitarbeiter(final String name, final Rolle rolle, final int schichtdauer) {
    this.name = name;
    this.rolle = rolle;
    this.schichtdauer = schichtdauer;
  }

  public String getName() {
    return name;
  }

  public Rolle getRolle() {
    return rolle;
  }

  public int getSchichtdauer() {
    return schichtdauer;
  }

  @Override
  public String toString() {
    return name + " arbeitet als " + rolle + " für " + schichtdauer + " Stunden.";
  }
}