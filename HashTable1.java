public class HashTable1 extends HashTable {
    @Override
    protected int hash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += c;
        }
        return hash % size;
    }
}
