public class Show {

  private final String titel;
  private final String zeit; // z.B. "15:00 Uhr"

  public Show(final String titel, final String zeit) {
    this.titel = titel;
    this.zeit = zeit;
  }

  public String getTitel() {
    return titel;
  }

  public String getZeit() {
    return zeit;
  }

  @Override
  public String toString() {
    return "Show " + titel + " findet um " + zeit + " statt.";
  }
}
