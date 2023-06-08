package src.jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Viagem {
    public static void mostrarDestinos() {
        Scanner sc = new Scanner(System.in);
        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();
        Maxwell max = new Maxwell();
        int peso = max.getRota();
        boolean verificador = false;
        ArrayList<Integer> escolhas = new ArrayList<>();
        ArrayList<Vertice> destinos = MapaGrafo.grafo.imprimirDestinos(peso);
        System.out.println("Escolha o caminho:");
        for (int i = 0; i < destinos.size(); i++) {
            System.out.println(i + 1 + ") " + destinos.get(i).getCidade().getNome());
            escolhas.add(i + 1);
        }
        peso = sc.nextInt();
        
        while (verificador == false) {
            if (escolhas.contains(peso)) {
                max.setRota(peso);
                verificador = true;
            } else {
                System.out.println("Digite um local válido");
                peso = sc.nextInt();
            }
        }

        sc.close();
    }
}
