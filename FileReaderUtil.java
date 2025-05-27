import java.io.*;

public class FileReaderUtil {
      // Define uma classe pública chamada FileReaderUtil. 
    // Utilitária: normalmente usada para agrupar métodos auxiliares estáticos.

    public static MyArrayList<String> readNames(String filePath) throws IOException {
        MyArrayList<String> names = new MyArrayList<>(10); // capacidade inicial arbitrária
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            names.adicionar(line.trim());
        }
        reader.close();
        return names;
    }
}
