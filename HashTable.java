public abstract class HashTable {
    protected int size = 32;
    protected Node[] table;
    protected int collisions = 0;

    public HashTable() {
        table = new Node[size];
    }

    protected abstract int hash(String key);

    public void insert(String key) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new Node(key);
        } else {
            collisions++;
            Node current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(key);
        }
    }

    public boolean search(String key) {
        int index = hash(key);
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int getCollisions() {
        return collisions;
    }

    public void printDistribution() {
        for (int i = 0; i < size; i++) {
            int count = 0;
            Node current = table[i];
            while (current != null) {
                count++;
                current = current.next;
            }
            System.out.println("Posicao " + i + ": " + count + " elemento(s)");
        }
    }

    static class Node {
        String key;
        Node next;

        Node(String key) {
            this.key = key;
            this.next = null;
        }
    }
}
