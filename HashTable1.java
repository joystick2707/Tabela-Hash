// HashTableHash1.java
public class HashTable1 extends HashTable {
    @Override
    protected int hash(String key) {
        int hash = 0;
        int prime = 31; // número primo comum usado em funções de hash
        for (int i = 0; i < key.length(); i++) {
            hash = prime * hash + key.charAt(i);
        }
        // Evita números negativos e garante que o hash esteja dentro dos limites da tabela
        return Math.abs(hash) % size;
    }
}
