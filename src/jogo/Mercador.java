package src.jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mercador {
    Scanner scanner = new Scanner(System.in);

    public List<Integer> perguntasMercador() {
        List<Integer> lista = new ArrayList<>();

        System.out.println("\n* Maxwell chega na cidade e é abordado por um mercador *");

        System.out.println("\n~ Mercador ~\n 'Olá querido viajante, essas estradas pela quais vóis passas estão muito perigosas.\n" +
                "Quantas de suas moedas estão a salvo?'");
        lista.add(scanner.nextInt());

        System.out.println("\n~ Mercador ~\n 'SHISHISHI! ... Deveras intrigante, seus pés parecem cansados, de onde vens?'" + 
                "\n1. Ubud");
        lista.add(scanner.nextInt());

        System.out.println("\n~ Mercador ~\n 'Definitivamente foi uma caminhada SHISHISHI!, mas para onde vosmecê pretendes ir?'");
        lista.add(scanner.nextInt());

        System.out.println("\n~ Mercador ~\n 'Uma última pergunta grande cavalheiro, vóis não tem interesse em trocar algumas de suas \n" +
                "moedas para aumentar o limiar da poderosa jóia em sua posse?'\n1. Sim\n2. Não ");
        lista.add(scanner.nextInt());

        return lista;
    }

    public void decisoesMercador() {
        List<Integer> listaRespostas = perguntasMercador();

        Integer elemento = listaRespostas.get(0);
        Integer distancia = listaRespostas.get(1);
        Integer escolha = listaRespostas.get(3);

        if(elemento < 5) {
            if(distancia < 3) {
                if(escolha == 1) {

                }
            }
        }
    }
}