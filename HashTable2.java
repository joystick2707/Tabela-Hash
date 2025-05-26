public class HashTable2 extends HashTable {
    @Override
    protected int hash(String key) {
        int hash = 5381; // Valor inicial usado no algoritmo DJB2
        for (int i = 0; i < key.length(); i++) {
            hash = ((hash << 5) + hash) ^ key.charAt(i); // hash * 33 ^ c
        }
        return Math.abs(hash) % size;
    }
}
