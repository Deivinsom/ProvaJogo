package src.jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Viagem {
    Scanner sc = new Scanner(System.in);
    //Mostrar os destinos possíveis
    public Vertice mostrarDestinos(int peso) {

        boolean verificador = false;
        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();

        ArrayList<Integer> escolhas = new ArrayList<>();
        ArrayList<Vertice> destinos = MapaGrafo.grafo.imprimirDestinos(peso);

        for (int i = 0; i < destinos.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + destinos.get(i).getCidade().getNome());
            escolhas.add(i + 1);
        }
        System.out.println("\n 9. Voltar.");
        Menu me = new Menu();
        me.criarLinhas();

        peso = sc.nextInt();
        while (verificador == false) {
            if (escolhas.contains(peso)) {
                verificador = true;
            } else {
                System.out.println("Digite um número válido");
                for (int i = 0; i < destinos.size(); i++) {
                    System.out.println(i + 1 + ") " + destinos.get(i).getCidade().getNome());
                    System.out.println(" " + (i + 1) + ". " + destinos.get(i).getCidade().getNome());
                }

                peso = sc.nextInt();
            }
        }

        return destinos.get(peso-1);
    }

    //Fazer viagem para a cidade escolhida.
    public void fazerViagem(Maxwell max, Vertice destino) {
        max.setCidadeAtual(destino.getCidade().getId());
        max.setMoedas(max.getMoedas()-1);
    }
}
