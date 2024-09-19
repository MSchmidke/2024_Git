public class Freizeitpark {

  private final String name;
  private String oeffnungszeiten;

  public Freizeitpark(final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getOeffnungszeiten() {
    return this.oeffnungszeiten;
  }

  public void setOeffnungszeiten(final String oeffnungszeiten) {
    this.oeffnungszeiten = oeffnungszeiten;
  }

  @Override
  public String toString() {
    return "Park {name=" + name + "}";
  }

}
