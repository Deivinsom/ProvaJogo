package src.jogo;

public class ListaEncadeafaCidades {
    private No head;
    private No tail;

    public ListaEncadeafaCidades(No head, No tail){
        this.head = null;
        this.tail = null;
    }

    public boolean vazia(){
        return head == null;
    }

    public void addNo(Cidade cidade, int id){
        No novo = new No(cidade, id);
        if (vazia()){
            head = novo;
            tail = novo;
        } else {
            tail.setNext(novo);
            tail = novo;
        }
    }

    public Vertice pesquisarCidade(int id){
        No atual = head;
        if(atual.getId() != id){
            pesquisarCidade(head.getNext().getId());
        }
        return atual.getArestas().get(id).getDestino();
    }
}
