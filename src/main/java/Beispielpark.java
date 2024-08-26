public class Beispielpark {

  public static void main(final String[] args) {
    var park = new Freizeitpark("Phantasialand");
    park.fuegeImbissstandHinzu(new Imbissstand("Restaurant Uhrwerk", "Burger", 24.50));
    park.fuegeImbissstandHinzu(new Imbissstand("Törtchen & Co.", "Patisserie", 6.00));
    park.fuegeImbissstandHinzu(new Imbissstand("Restaurante Cocorico", "Tapas", 17.50));
    park.fuegeImbissstandHinzu(new Imbissstand("Rutmor's Taverne", "Gutbürgerlich", 17.50));
    park.fuegeImbissstandHinzu(new Imbissstand("Eis-Café Annie Himmelreich", "Eis", 3.80));
    park.fuegeImbissstandHinzu(new Imbissstand("Restaurant Mandschu", "Asiatisch", 15.50));
    park.fuegeImbissstandHinzu(new Imbissstand("La Cantina Tacana", "Wraps und Tortillas", 8.00));
    park.fuegeImbissstandHinzu(new Imbissstand("Lilli's Café", "Kaffee & Brötchen-Konfekt", 6.50));
    park.fuegeImbissstandHinzu(new Imbissstand("Zum Kohleschipper", "Sandwiches", 11.50));
    park.fuegeImbissstandHinzu(new Imbissstand("Emilie's Chocoladen- & Candy-Werkstatt", "Schokolade", 3.80));
    System.out.println(park);
  }

}
