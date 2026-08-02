package queue;

public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Queue(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void Enqueue(T value){
        Node<T> node = new Node(value);

        if(head == null){
            head = new Node<T>();
            tail = new Node<T>();
        }else{
            tail.setNext(node);
            tail = node;
        }
    }

    public T Deque() throws IllegalAccessException {
        if(head == null){
            throw new IllegalAccessException("A lista esta vazia.");
        }else{
            T data = head.getData();
            head = head.getNext();
            if(head == null){
                tail = null;
            }
            size--;
            return data;
        }
    }

}
