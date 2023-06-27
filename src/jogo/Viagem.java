package src.jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Viagem {
    //Mostrar os destinos possíveis
    public Vertice mostrarDestinos(int peso) {
        Scanner sc = new Scanner(System.in);

        boolean verificador = false;
        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();

        ArrayList<Integer> escolhas = new ArrayList<>();
        ArrayList<Vertice> destinos = MapaGrafo.grafo.imprimirDestinos(peso);

        System.out.println("Escolha o caminho:");
        for (int i = 0; i < destinos.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + destinos.get(i).getCidade().getNome());
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
                    System.out.println(" " + (i + 1) + ". " + destinos.get(i).getCidade().getNome());

                }

                peso = sc.nextInt();
            }
        }

        sc.close();
        return destinos.get(peso-1);

    }

    //Fazer Viagem
    public void fazerViagem(Maxwell max, Vertice destino) {
        max.setCidadeAtual(destino.getCidade().getId());
        max.setMoedas(max.getMoedas()-1);
        if (max.getMoedas() == 0) {
            try {
                Menu me = new Menu();
                me.limparConsole();
                System.out.println("~ Max ficou sem moedas! O jogo acabou. ~");
                Thread.sleep(2300);
                System.exit(0);
            } catch (Exception e) {

            }
        }
    }
}
