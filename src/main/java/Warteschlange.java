import java.util.LinkedList;
import java.util.Queue;

import de.mtrail.marcus.git.Parkbesucher;

public class Warteschlange {

  private final Queue<Parkbesucher> besucherQueue;
  private final Attraktion attraktion;

  public Warteschlange(final Attraktion attraktion) {
    this.attraktion = attraktion;
    this.besucherQueue = new LinkedList<>();
  }

  public void fügeBesucherHinzu(final Parkbesucher besucher) {
    besucherQueue.add(besucher);
    System.out.println(besucher.getName() + " steht jetzt in der Warteschlange für " + attraktion.getName());
  }

  public void lasseBesucherEin() {
    if (!besucherQueue.isEmpty()) {
      Parkbesucher besucher = besucherQueue.poll();
      System.out.println(besucher.getName() + " betritt die Attraktion " + attraktion.getName());
    }
    else {
      System.out.println("Die Warteschlange für " + attraktion.getName() + " ist leer.");
    }
  }

  public int getWarteschlangenLänge() {
    return besucherQueue.size();
  }
}
