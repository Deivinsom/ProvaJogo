package src.jogo;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void dialogoInicial() {
        System.out.println("\nMaxwell, The Game");
        System.out.println("Pressione <ENTER> para começar...");
        scanner.nextLine();

        System.out.println("\n~ Voz desconhecida ~\n 'EI! ACORDA!!'");

        System.out.println("\n* Maxwell abre os olhos assustado e vê quem estava chamando-o *");

        System.out.println("\n~ Jorat ~\n 'A bela adormecida finalmente resolveu despertar pra vida?\n" +
                "Então, hoje mais cedo vieram pessoas importantes da Parte Alta querendo teus serviços.\n" +
                "É uma joia, parece ser alguma coisa mágica que você deve entregar lá em Nargumun.'");
        
        System.out.println("\n* Jorat lhe entrega a joia e 3 moedas de transporte. Você sente um \n" + 
                "suave tapa em suas costas empurrando-o pra saída *");

        System.out.println("\n~ Jorat ~\n 'Bem, se realmente for algo importante, o pagamento será um belo montante.\n" +
                "Vai lá, muleque. Tome cuidado na sua jornada. Rogo para que tome boas escolhas.'");
    }

    public int menuInical() {
        int escolha = 0;
        System.out.println("\n* Saindo da ferraria de Jorat, Max dirige-se a saída de Ubud *");
        System.out.println("\n* Ao chegar, ele deve tomar uma decisão, ele so poderá ir para cidades que fazem fronteira \n" +
                "com sua cidade atual *");
        System.out.println("\n* Ubud possui apenas duas fronteiras com outras cidades, Kingdom of Legmod e Principality \n" + 
                "of Nekika. Para ir de uma cidade a outra você deve ter no mínimo 1 moeda de transporte *");

        while(escolha < 1 || escolha > 2){
            System.out.println("\n< Para qual cidade você escolhe ir? >\n" + 
                    "1- Kingdom of Legmod\n2- Principality of Nekika\n");
            escolha = scanner.nextInt();
        }

        return escolha;
    }

    public int menuPrincipal() {
        Mercador mercador = new Mercador();
        
        mercador = mercador.perguntasMercador();

        //if(missaoAtual == true) {
        //    System.out.println("Deseja desistir da missao atual?");
        //    String resposta = scanner.nextLine();
        //}

        //if(missao == true) {
        //    System.out.println("Aceitas?");
        //    String resposta = scanner.nextLine();
        //}

        //System.out.println(this.cidade.possibilidades());
        //Cidade decisao = scanner.Next();

        return 0;
    }
}
