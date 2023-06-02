package src.jogo;

public class No {
    private Cidade cidade;
    private No next;
    private No preveus;

    public No(Cidade cidade) {
        this.cidade = cidade;
        this.next = null;
        this.preveus = null;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public No getPreveus() {
        return preveus;
    }

    public void setPreveus(No preveus) {
        this.preveus = preveus;
    }

}
