package src.jogo;

import java.util.ArrayList;

public class Vertice {
    private Cidade cidade;
    private ArrayList<Aresta> arestas;

    public Vertice(Cidade cidade) {
        this.cidade = cidade;
        this.arestas = new ArrayList<>();
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void addAresta(Aresta aresta) {
        arestas.add(aresta);
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }
}
