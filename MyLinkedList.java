public class MyLinkedList {
    private Node head; // Referência para o primeiro nó da lista

    public MyLinkedList() {
        this.head = null;
    }

    public void insert(String key) {
        if (head == null) {
            head = new Node(key);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(key); // Adiciona o novo nó ao final da lista
        }
    }

    public boolean search(String key) {
        Node current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int countElements() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
