public abstract class HashTable {

    protected int size = 25;

    protected MyLinkedList[] tabela;

    protected int colisoes = 0;

    public HashTable() {
        tabela = new MyLinkedList[size];
        for (int i = 0; i < size; i++) {
            tabela[i] = new MyLinkedList(); // Inicializa cada posição com uma lista encadeada
        }
    }

    // Método para definir a função de hash
    protected abstract int hash(String chave);

    // Insere uma chave na tabela hash
    public void insert(String chave) {
        int indice = hash(chave); // Calcula o índice com a função hash
        if (!tabela[indice].isEmpty()) { 
            colisoes++;
        }
        tabela[indice].insert(chave); // Insere a chave na lista correspondente
    }

    public boolean search(String chave) {
        int indice = hash(chave); 
        return tabela[indice].search(chave); // Busca a chave na lista correspondente
    }

    public int getCollisions() {
        return colisoes;
    }

    // Imprime a distribuição de elementos nas posições da tabela
    public void printDistribution() {
        for (int i = 0; i < size; i++) {
            int quantidade = tabela[i].countElements(); // Conta os elementos na lista da posição i
            System.out.println("Posicao " + i + ": " + quantidade + " elemento(s)");
        }
    }
}
