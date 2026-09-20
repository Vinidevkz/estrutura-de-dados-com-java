package doublycirclelinkedlist;

public class CircleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public CircleLinkedList(){}

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    //

    //append
    public void append(T value){
        Node<T> buffer = new Node(value);

        if(head == null){
            buffer.setNext(this.head);
            head = buffer;
            tail = buffer;
        }else{
            this.tail.setNext(buffer);
            this.tail = buffer;
            this.tail.setNext(head);
        }
        size++;
    }

    //ver lista
    @Override
    public String toString(){
        if(size == 0){
            return "[]";
        }

        StringBuilder stringBuilder = new StringBuilder("[");

        Node buffer = this.head;

        stringBuilder.append(buffer.getValue());

        while(buffer.getNext() != null && buffer.getNext() != this.head){
            stringBuilder.append(", ");

            stringBuilder.append(buffer.getNext().getValue());
            buffer = buffer.getNext();
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
