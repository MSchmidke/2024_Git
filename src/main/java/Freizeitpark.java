public class Freizeitpark {

  private final String name;

  public Freizeitpark(final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Park {name=" + name + "}";
  }

}
