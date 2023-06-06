 package src.jogo;

public class Teste {
    public static void main(String[] args) {
        MapaGrafo.addCidades();
        MapaGrafo.addCaminhos();
        System.out.println(MapaGrafo.grafo.imprimirArestas(0));
    }
}
