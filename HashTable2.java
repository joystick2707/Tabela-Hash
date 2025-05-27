public class HashTable2 extends HashTable {

    @Override
    protected int hash(String key) {
        int hash = 5381; // Valor inicial usado no algoritmo DJB2

        // Percorre cada caractere da chave
        for (int i = 0; i < key.length(); i++) {
            // Atualiza o hash aplicando a operação: hash * 33 XOR caractere
            hash = ((hash << 5) + hash) ^ key.charAt(i);
        }
        
// Garante que o valor do hash seja positivo e ajustado ao tamanho da tabela
        // 'size' é presumivelmente definido na classe pai HashTable
        return Math.abs(hash) % size;
    }
}
