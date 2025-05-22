public class HashTableHash2 extends HashTable {
    @Override
    protected int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = 31 * hash + key.charAt(i); // método de Horner
        }
        return Math.abs(hash % size);
    }
}
