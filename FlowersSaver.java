import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class FlowersSaver {
    static FileReader fileReader;

    static ArrayList<Flowers> bouquet = new ArrayList<>();

    public static ArrayList save(Path path) throws IOException, NullPointerException {
        File file = new File(String.valueOf(path));
        BufferedReader br = new BufferedReader(new FileReader(file));
        for (; ; ) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            switch (line) {
                case ("Rose"):
                    bouquet.add(new Rose());
                    break;
                case ("Tulip"):
                    bouquet.add(new Tulip());
                    break;
                case ("Chamomile"):
                    bouquet.add(new Chamomile());
                    break;
            }
        }
        return bouquet;
    }
}
