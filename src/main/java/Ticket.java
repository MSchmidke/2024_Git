public class Ticket {

  private final String typ;
  private final double preis;
  private boolean gültig;

  public Ticket(final String typ, final double preis, final boolean gültig) {
    this.typ = typ;
    this.preis = preis;
    this.gültig = gültig;
  }

  // Getter und Setter
  public String getTyp() {
    return typ;
  }

  public double getPreis() {
    return preis;
  }

  public boolean istGültig() {
    return gültig;
  }

  public void entwerteTicket() {
    if (gültig) {
      gültig = false;
      System.out.println("Das " + typ + " Ticket wurde entwertet.");
    }
    else {
      System.out.println("Das Ticket ist bereits entwertet.");
    }
  }
}
