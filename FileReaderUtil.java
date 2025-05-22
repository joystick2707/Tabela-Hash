import java.io.*;
import java.util.*;

public class FileReaderUtil {
    public static List<String> readNames(String filePath) throws IOException {
        List<String> names = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            names.add(line.trim());
        }
        reader.close();
        return names;
    }
}
