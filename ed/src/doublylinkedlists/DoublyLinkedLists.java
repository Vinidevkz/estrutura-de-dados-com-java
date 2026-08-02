package doublylinkedlists;

public class DoublyLinkedLists<T> {

    private Node<T> head;
    private Node<T> tail;

    private  int tamanho;

    public DoublyLinkedLists(){
        this.head = null;
        this.tail = null;
        this.tamanho = 0;
    }

    public void addFim(T valor){
        Node<T> novoNo = new Node<>();

        if(head == null){
            head = novoNo;
            tail = novoNo;
        }else{
            tail.setProximo(novoNo);
            novoNo.setAnterior(tail);
            tail = novoNo;
        }
    }

    public void addInicio(T valor){
        Node<T> novoNo = new Node<>();

        if(head == null){
            head = novoNo;
            tail = novoNo;
        }else{
            novoNo.setProximo(head);
            head.setAnterior(novoNo);
            head = novoNo;
        }
        tamanho++;
    }

}
