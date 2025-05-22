// HashTable.java
public abstract class HashTable {
    protected int size = 32;
    protected MyLinkedList[] tabela;
    protected int colisoes = 0;

    public HashTable() {
        tabela = new MyLinkedList[size];
        for (int i = 0; i < size; i++) {
            tabela[i] = new MyLinkedList();
        }
    }

    protected abstract int hash(String chave);

    public void insert(String chave) {
        int indice = hash(chave);
        if (!tabela[indice].isEmpty()) {
            colisoes++;
        }
        tabela[indice].insert(chave);
    }

    public boolean search(String chave) {
        int indice = hash(chave);
        return tabela[indice].search(chave);
    }

    public int getCollisions() {
        return colisoes;
    }

    public void printDistribution() {
        for (int i = 0; i < size; i++) {
            int quantidade = tabela[i].countElements();
            System.out.println("Posicao " + i + ": " + quantidade + " elemento(s)");
        }
    }
}
