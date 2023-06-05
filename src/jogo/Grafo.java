package src.jogo;

import java.util.ArrayList;

public class Grafo {
    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;

    public Grafo() {
        this.arestas = new ArrayList<>();
        this.vertices = new ArrayList<>();
    }

    public void addVertice(Vertice vertice) {
        vertices.add(vertice);
    }

    public void addAresta(int peso, Vertice origem, Vertice destino) {
        Aresta aresta = new Aresta(peso, origem, destino);
        origem.addAresta(aresta);
        destino.addAresta(aresta);
        arestas.add(aresta);
    }

    public void imPrimirMapa() {
        for (Vertice vertice : vertices) {
            System.out.println("Conexões do Vértice " + vertice.getCidade().getNome() + ":");
            for (Aresta aresta : vertice.getArestas()) {
                Vertice destino = aresta.getDestino();
                int peso = aresta.getPeso();
                System.out.println();
                System.out.println(destino.getCidade().getNome() + "(" + peso + ")");
                System.out.println();
            }
            System.out.println();
        }
    }

    public void imprimirVertices() {
        for (Vertice vertice : vertices) {
            System.out.println(vertice.getCidade().getNome());
        }
    }

    public void imprimirArestas(Cidade cidade) {
        for (int i = 0; i <= arestas.size(); i++) {
            if (vertices.get(i).getCidade().equals(cidade)) {
                System.out.println(arestas.get(i).getOrigem().getCidade().getNome() + " ----> "
                        + arestas.get(i).getDestino().getCidade().getNome());
                System.out.println();
            }
        }
    }

}
