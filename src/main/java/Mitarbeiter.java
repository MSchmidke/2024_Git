public class Mitarbeiter {

  private String name;
  private Rolle rolle;
  private int schichtdauer; // in Stunden

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

  public void setName(final String name) {
    this.name = name;
  }

  public void setRolle(final Rolle rolle) {
    this.rolle = rolle;
  }

  public void setSchichtdauer(final int schichtdauer) {
    this.schichtdauer = schichtdauer;
  }

  @Override
  public String toString() {
    return name + " arbeitet als " + rolle + " für " + schichtdauer + " Stunden.";
  }
}