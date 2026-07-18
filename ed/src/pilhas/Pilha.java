package pilhas;

public class Pilha<T> {
    private T[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }




}
