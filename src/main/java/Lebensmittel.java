import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Builder
@ToString
public class Lebensmittel {

  private final int id;
  private final String name;

}
