package src.jogo;

public class Teste {
    public static void main(String[] args) {
        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();
        System.out.println(MapaGrafo.grafo.imprimirDestinos(0).get(0).getCidade().getNome());

    }
}
