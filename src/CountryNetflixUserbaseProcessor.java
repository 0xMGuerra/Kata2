import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryNetflixUserbaseProcessor implements NetflixUserbaseProcessor{
    @Override
    public Map<String, Integer> process(List<NetflixUserbase> list) {
        HashMap<String, Integer> res = new HashMap<>();

        for(NetflixUserbase nUserbase : list) {
            String country = nUserbase.getCountry();
            res.put(country, res.getOrDefault(country, 0) + 1);
        }
        return res;
    }
}
