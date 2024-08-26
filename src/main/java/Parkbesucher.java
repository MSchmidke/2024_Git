public class Parkbesucher {

  private final String name;
  private final int alter;
  private final int groesse; // in Zentimetern
  private final boolean hatTicket;

  public Parkbesucher(final String name, final int alter, final int groesse, final boolean hatTicket) {
    this.name = name;
    this.alter = alter;
    this.groesse = groesse;
    this.hatTicket = hatTicket;
  }

  public String getName() {
    return name;
  }

  public int getAlter() {
    return alter;
  }

  public int getGroesse() {
    return groesse;
  }

  public boolean hatTicket() {
    return hatTicket;
  }

  @Override
  public String toString() {
    return "Parkbesucher{" + "name='" + name + '\'' + ", alter=" + alter + ", größe=" + groesse + ", hatTicket=" + hatTicket + '}';
  }
}
