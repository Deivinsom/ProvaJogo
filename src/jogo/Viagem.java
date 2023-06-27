package src.jogo;

import java.util.ArrayList;

public class Viagem {

    // Mostrar os destinos possíveis
    public ArrayList<Vertice> mostrarDestinos(int peso) {

        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();

        ArrayList<Vertice> destinos = MapaGrafo.grafo.imprimirDestinos(peso);
        ArrayList<Vertice> fronteirasAtuais = new ArrayList<>();

        for (int i = 0; i < destinos.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + destinos.get(i).getCidade().getNome());
            fronteirasAtuais.add(destinos.get(i));
        }
        return fronteirasAtuais;
    }

    // Fazer Viagem
    public void fazerViagem(Maxwell max, Vertice destino) {
        max.setcidadeAtual(destino.getCidade().getId());
        max.setMoedas(max.getMoedas() - 1);
    }
}
