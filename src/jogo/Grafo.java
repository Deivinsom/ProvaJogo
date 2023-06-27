package src.jogo;

import java.util.ArrayList;

public class Grafo {
    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;
    private ArrayList<Vertice> cidadesVizinhas = new ArrayList<>();

    // Criando Objeto Grafo
    public Grafo() {
        this.arestas = new ArrayList<>();
        this.vertices = new ArrayList<>();
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    // Adiocionar vertices
    public void addVertice(Vertice vertice) {
        vertices.add(vertice);
    }

    // Adicionar arestas
    public void addAresta(int peso, Vertice origem, Vertice destino) {
        Aresta aresta = new Aresta(peso, origem, destino);
        origem.addAresta(aresta);
        destino.addAresta(aresta);
        arestas.add(aresta);
    }

    public void imprimirVertices() {
        for (Vertice vertice : vertices) {
            System.out.println(vertice.getCidade().getNome());
        }
    }

    public ArrayList<Vertice> imprimirDestinos(int peso) {
        cidadesVizinhas.clear();
        for (Aresta aresta : arestas) {
            if (peso == aresta.getPeso()) {
                cidadesVizinhas.add(aresta.getDestino());
            }
        }
        return cidadesVizinhas;
    }

}