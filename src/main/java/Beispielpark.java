import java.util.List;

public class Beispielpark {

  public static void main(final String[] args) {
    var park = new Freizeitpark("Phantasialand");
    park.fügeAttraktionHinzu(new Attraktion("Taron", "Achterbahn", 130, 28));
    park.fügeAttraktionHinzu(new Attraktion("Black Mamba", "Achterbahn", 140, 28));
    park.fügeAttraktionHinzu(new Attraktion("Chiapas", "Wildwasserbahn", 120, 40));
    park.fügeAttraktionHinzu(new Attraktion("Raik", "Familien-Achterbahn", 100, 20));
    park.fügeAttraktionHinzu(new Attraktion("Mystery Castle", "Drop Tower", 130, 20));
    park.fügeAttraktionHinzu(new Attraktion("Crazy Bats", "VR-Achterbahn", 100, 18));
    park.fügeAttraktionHinzu(new Attraktion("Wakobato", "Wasserfahrt", 0, 30));
    System.out.println(park);
    var familie = List.of(//
        new Parkbesucher("Hans Müller", 45, 180, true), //
        new Parkbesucher("Anna Müller", 42, 165, true), //
        new Parkbesucher("Lukas Müller", 15, 160, true), //
        new Parkbesucher("Sophie Müller", 12, 150, true));
    System.out.println(familie);
  }

}
