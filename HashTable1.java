public class HashTable1 extends HashTable {

    // função de hash com número primo
    @Override
    protected int hash(String key) {
        int hash = 0;
        int primo = 31; 

        // Calcula o valor hash somando os códigos dos caracteres da chave multiplicados pelo primo
        for (int i = 0; i < key.length(); i++) {
            hash = primo * hash + key.charAt(i); // Acumula o valor usando multiplicação e adição
        }

        // Garante que o valor do hash seja positivo e dentro do tamanho da tabela (size)
        return Math.abs(hash) % size;
    }
}
