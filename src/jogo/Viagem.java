package src.jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Viagem {
    Scanner sc = new Scanner(System.in);
    Menu me = new Menu();

    //Mostrar os destinos possíveis
    public Vertice mostrarDestinos(int peso, MapaGrafo mapa) {

        boolean verificador = false;

        ArrayList<Integer> escolhas = new ArrayList<>();
        ArrayList<Vertice> destinos = MapaGrafo.grafo.imprimirDestinos(peso);

        for (int i = 0; i < destinos.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + destinos.get(i).getCidade().getNome() + " | " + 
                    destinos.get(i).getCidade().getAlterarJoia() + " Poder de Joia");
            escolhas.add(i + 1);
        }
        System.out.println("\n 9. Voltar.");
        me.criarLinhas();

        int id = sc.nextInt();
        while (verificador == false) {
            if (id == 9) {
                me.menuPrincipal();
            } else if (escolhas.contains(id)) {
                verificador = true;
            } else {
                System.out.println("Digite um número válido");
                for (int i = 0; i < destinos.size(); i++) {
                    System.out.println(i + 1 + ". " + destinos.get(i).getCidade().getNome());
                }

                id = sc.nextInt();
            }
        }

        return destinos.get(id-1);
    }

    //Fazer viagem para a cidade escolhida.
    public void fazerViagem(Maxwell max, Vertice destino) {
        max.setCidadeAtual(destino.getCidade().getId());
        max.setMoedas(max.getMoedas()-1);
        me.verificarMoedas();

        me.main.joia.alterarJoia(MapaGrafo.grafo.imprimirVertice(max.getCidadeAtual()).getCidade().getAlterarJoia());
        me.verificarJoia();
    }
}
