public class Show {

  private final String titel;
  private final String ort;

  public Show(final String titel, final String ort) {
    this.titel = titel;
    this.ort = ort;
  }

  public String getTitel() {
    return titel;
  }

  public String getOrt() {
    return ort;
  }

  @Override
  public String toString() {
    return "Show " + titel + " findet im " + ort + " statt.";
  }
}
