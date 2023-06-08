package src.jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Viagem {
    public static void mostrarDestinos() {
        Scanner sc = new Scanner(System.in);
        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();
        int peso = Maxwell.getRota();
        ArrayList<Integer> escolhas = new ArrayList<>();
        ArrayList<Vertice> destinos = MapaGrafo.grafo.imprimirDestinos(peso);
        System.out.println("Escolha o caminho:");
        for (int i = 0; i < destinos.size(); i++) {
            System.out.println(i + 1 + ") " + destinos.get(i).getCidade().getNome());
            escolhas.add(i + 1);
        }
        peso = sc.nextInt();
        

        sc.close();
    }
}
