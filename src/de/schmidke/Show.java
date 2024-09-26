package de.schmidke.uebungen;
public class Show {

  private final String titel;

  public Show(final String titel) {
    this.titel = titel;
  }

  public String getTitel() {
    return titel;
  }

  @Override
  public String toString() {
    return "Show " + titel;
  }
}
