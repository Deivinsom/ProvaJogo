package src.jogo;

public class No extends Vertice {
    private No next;
    private int id;

    public No(Cidade cidade, int id) {
        super(cidade);
        this.next = null;
        this.id = id;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
