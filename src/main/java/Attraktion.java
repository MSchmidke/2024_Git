public class Attraktion {

  private final String name;
  private final String typ;
  private final int mindestgröße; // in Zentimetern
  private final int maximaleKapazität;

  public Attraktion(final String name, final String typ, final int mindestgröße, final int maximaleKapazität) {
    this.name = name;
    this.typ = typ;
    this.mindestgröße = mindestgröße;
    this.maximaleKapazität = maximaleKapazität;
  }

  public String getName() {
    return name;
  }

  public String getTyp() {
    return typ;
  }

  public int getMindestgröße() {
    return mindestgröße;
  }

  public int getMaximaleKapazität() {
    return maximaleKapazität;
  }

  public void starteFart() {
    System.out.println(name + " startet jetzt. Viel Spaß bei der Fahrt!");
  }

  @Override
  public String toString() {
    return "Attraktion{" + "name='" + name + '\'' + ", typ='" + typ + '\'' + ", mindestgröße=" + mindestgröße + ", maximaleKapazität="
        + maximaleKapazität + '}';
  }
}
