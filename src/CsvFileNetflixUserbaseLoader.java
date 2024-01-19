import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CsvFileNetflixUserbaseLoader implements NetflixUserbaseLoader{
    private final File file;

    public CsvFileNetflixUserbaseLoader(File file) {
        this.file = file;
    }

    @Override
    public List<NetflixUserbase> load() {
        try {
            return load(new FileReader(file));
        } catch (FileNotFoundException e) {
            return Collections.emptyList();
        }
    }

    private List<NetflixUserbase> load(FileReader fileReader) {
        return load(new BufferedReader(fileReader));
    }

    private List<NetflixUserbase> load(BufferedReader bufferedReader) {
        return bufferedReader.lines().skip(1).map(this::toNetflixUserbase).collect(Collectors.toList());
    }

    private NetflixUserbase toNetflixUserbase(String s) {
        return toNetflixUserbase(s.split(","));
    }

    private NetflixUserbase toNetflixUserbase(String[] split) {
        return new NetflixUserbase(
                Integer.parseInt(split[0]),
                split[1],
                split[2],
                split[3],
                split[4],
                split[5],
                Integer.parseInt(split[6]),
                split[7],
                split[8],
                split[9]
        );
    }
}
