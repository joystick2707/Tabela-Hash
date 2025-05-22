import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> names = FileReaderUtil.readNames("/home/bryan/IdeaProjects/Tabela Hash/src/female_names.txt");

        HashTable table1 = new HashTable1();
        HashTable table2 = new HashTable2();

        long start1 = System.nanoTime();
        for (String name : names) table1.insert(name);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        for (String name : names) table2.insert(name);
        long end2 = System.nanoTime();

        System.out.println("--- Hash 1 ---");
        System.out.println("Colisoes: " + table1.getCollisions());
        System.out.println("Tempo de insercao: " + (end1 - start1) + " ns");
        table1.printDistribution();

        System.out.println("\n--- Hash 2 ---");
        System.out.println("Colisoes: " + table2.getCollisions());
        System.out.println("Tempo de insercao: " + (end2 - start2) + " ns");
        table2.printDistribution();
    }
}
