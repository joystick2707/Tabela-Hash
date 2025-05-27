import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Lê os nomes de um arquivo e armazena em uma lista personalizada do tipo MyArrayList
        MyArrayList<String> names = FileReaderUtil.readNames("/home/bryan/IdeaProjects/Tabela Hash/src/female_names.txt");

        // Cria duas tabelas hash diferentes para fins de comparação
        HashTable table1 = new HashTable1(); // Primeira implementação de tabela hash
        HashTable table2 = new HashTable2(); // Segunda implementação de tabela hash

        long start1 = System.nanoTime();
        for (int i = 0; i < names.tamanho(); i++) {
            table1.insert(names.pegar(i));
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        for (int i = 0; i < names.tamanho(); i++) {
            table2.insert(names.pegar(i));
        }
        long end2 = System.nanoTime();

          // Exibe os resultados da tabela 1
        System.out.println("--- Hash 1 ---");
        System.out.println("Colisões: " + table1.getCollisions());
        System.out.println("Tempo de inserção: " + (end1 - start1) + " ns");
        table1.printDistribution();

        // Exibe os resultados da tabela 2
        System.out.println("\n--- Hash 2 ---");
        System.out.println("Colisões: " + table2.getCollisions());
        System.out.println("Tempo de inserção: " + (end2 - start2) + " ns");
        table2.printDistribution();
    }
}
