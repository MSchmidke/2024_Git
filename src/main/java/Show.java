public class Show {

  private final String titel;
  private final String ort;
  private final String zeit; // z.B. "15:00 Uhr"

  public Show(final String titel, final String ort, final String zeit) {
    this.titel = titel;
    this.ort = ort;
    this.zeit = zeit;
  }

  public String getTitel() {
    return titel;
  }

  public String getOrt() {
    return ort;
  }

  public String getZeit() {
    return zeit;
  }

  @Override
  public String toString() {
    return "Show " + titel + " findet im " + ort + " um " + zeit + " statt.";
  }
}
