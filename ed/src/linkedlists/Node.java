package linkedlists;

public class Node<T> {

    private T dado;
    private Node next;

    public Node(){};

    public Node(T dado, Node next) {
        this.dado = dado;
        this.next = next;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
