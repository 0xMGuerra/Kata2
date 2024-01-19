import java.util.List;
import java.util.Map;

public interface NetflixUserbaseProcessor {
    Map<String, Integer> process(List<NetflixUserbase> list);
}
