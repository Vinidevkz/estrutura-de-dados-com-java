package linkedlists;

public class List<T> {

    private Node head;

    public void add(T value){
        Node node = new Node();
        node.setDado(value);
        node.setNext(head);
        head = node;
    }

    public void addInIndex(T value, int index){
        Node preNode = head;

        Node node = new Node();
        node.setDado(value);

        if(index == 0){
            node.setNext(preNode);
            head = node;
        }else{
            for(int i = 1; i != index; i++){
                preNode = preNode.getNext();
            }

            node.setNext(preNode.getNext());
            preNode.setNext(node);

        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[ ");

        Node p = head;
        while(p != null){
            sb.append(p.getDado() + " ");
            p = p.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
