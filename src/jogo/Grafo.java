package src.jogo;

import java.util.ArrayList;

public class Grafo {
    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;

    public Grafo() {
        this.arestas = new ArrayList<>();
        this.vertices = new ArrayList<>();
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
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
        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();
        for (Vertice vertice : vertices) {
            System.out.println("Conexões de " + vertice.getCidade().getNome() + ":");
            for (Aresta aresta : arestas) {
                if(vertice.getCidade().getValorRota() == aresta.getPeso()){
                    System.out.println(aresta.getDestino().getCidade().getNome());

                }
            }
            System.out.println();
        }
    }

    public void imprimirVertices() {
        for (Vertice vertice : vertices) {
            System.out.println(vertice.getCidade().getNome());
        }
    }

    public ArrayList<Vertice> imprimirDestinos(int peso) {
        ArrayList<Vertice> cidadesVizinhas = new ArrayList<>();
        for (Aresta aresta : arestas) {
            if (peso == aresta.getPeso()) {
                cidadesVizinhas.add(aresta.getDestino());
            }
        }
        return cidadesVizinhas;
    }

}