package src.jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Viagem {
    public static Vertice mostrarDestinos(int peso) {
        Scanner sc = new Scanner(System.in);
        boolean verificador = false;
        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();
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
                verificador = true;

            } else {
                System.out.println("Digite um número válido");
                for (int i = 0; i < destinos.size(); i++) {
                    System.out.println(i + 1 + ") " + destinos.get(i).getCidade().getNome());

                }
                peso = sc.nextInt();
            }
        }
        return destinos.get(peso-1);

    }

    public static void fazerViagem(Maxwell max, Vertice destino) {
        System.out.println("antes"+max.getRota());
        max.setRota(destino.getCidade().getValorRota());
        System.out.println("dps"+max.getRota());
    }

}
