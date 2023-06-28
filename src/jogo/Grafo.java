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

    public String imprimirNome(int id) {
        String nome = "";
        for(int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getCidade().getId() == id) {
                nome = vertices.get(i).getCidade().getNome();
            }
        }

        return nome;
    }
    
    public Vertice imprimirVertice(int id) {
        Vertice vertice = new Vertice();
            for (int i = 0; i < vertices.size(); i++) {
                if (vertices.get(i).getCidade().getId() == id) {
                    vertice = vertices.get(i);
                }
            }
        return vertice;
    }

    public boolean verificarMissao(int id) {
        for(int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getCidade().getId() == id) {
                if(vertices.get(id).getCidade().getMissao() == null){
                    return false;
                }
                break;    
            }
        }

        return true;
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