package src.jogo;

public class Aresta {
    private Vertice origem;
    private Vertice destino;
    private int peso;

    public Aresta(int peso, Vertice origem, Vertice destino) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }

}
