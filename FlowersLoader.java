import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class FlowersLoader {
    static FileWriter fileWriter;

    static {
        try {
            fileWriter = new FileWriter("MyFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static ArrayList<Flowers> bouquet = new ArrayList<>();

    public static void load(ArrayList bouquet, Path path) throws IOException {
        File file = new File(String.valueOf(path));
        BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
        if (bouquet.get(0) != null) {
            out.write(bouquet.get(0).toString()+ "\n");
        }
        out.flush();
        for (int i = 1; i < bouquet.size() - 1; i++) {
            String s = bouquet.get(i)+ "\n";
            out.write(s);
            out.flush();
        }
        String b = bouquet.get(bouquet.size()-1).toString();
        out.write(b);
        out.close();
    }

}
