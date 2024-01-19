import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        NetflixUserbaseLoader loader = new CsvFileNetflixUserbaseLoader(new File("Netflix Userbase.csv"));
        List<NetflixUserbase> list = loader.load();
        Map<String, Integer> process = new CountryNetflixUserbaseProcessor().process(list);

        for(String key : process.keySet()) {
            System.out.println(key + " -> " + process.get(key));
        }
    }
}