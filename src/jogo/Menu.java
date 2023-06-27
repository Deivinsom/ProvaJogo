package src.jogo;

import java.util.Scanner;

public class Menu {
    static Main main = new Main();
    static Viagem viagem = new Viagem();
    private int escolha = -1;

    Scanner scanner = new Scanner(System.in);

    public void dialogoInicial() { // apenas para entretenimento, nenhum processamento de nada aqui.
        try {
        System.out.println("\n      DEATH STRANDING 3" + "\n------------------------------");
        System.out.println("Pressione <ENTER> para começar...");
        scanner.nextLine();

        System.out.println("\n~ Voz desconhecida ~\n 'EI! ACORDA!!'");
        Thread.sleep(2000);

        System.out.println("\n* Maxwell abre os olhos assustado e vê quem estava chamando-o *");
        Thread.sleep(2000);

        System.out.println("\n~ Jorat ~\n 'A bela adormecida finalmente resolveu despertar pra vida?\n" +
                "Então, hoje mais cedo vieram pessoas importantes da Parte Alta querendo teus serviços.\n" +
                "É uma joia, parece ser alguma coisa mágica que você deve entregar lá em Nargumun.'");
        Thread.sleep(5000);
        
        System.out.println("\n* Jorat lhe entrega a joia e 3 moedas de transporte. Você sente um \n" + 
                "suave tapa em suas costas empurrando-o pra saída *");
        Thread.sleep(3000);

        System.out.println("\n~ Jorat ~\n 'Bem, se realmente for algo importante, o pagamento será um belo montante.\n" +
                "Vai lá, muleque. Tome cuidado na sua jornada. Rogo para que tome boas escolhas.'");
        Thread.sleep(4000);

        System.out.println("\n* Saindo da ferraria de Jorat, Max dirige-se a saída de Ubud *");
        Thread.sleep(2000);

        System.out.println("\n* Ao chegar, ele deve tomar uma decisão, ele so poderá ir para cidades que fazem fronteira \n" +
                "com sua cidade atual *");
        Thread.sleep(2000);

        System.out.println("\n* Ubud possui apenas duas fronteiras com outras cidades, Kingdom of Legmod e Principality \n" + 
                "of Nekika. Para ir de uma cidade a outra você deve ter no mínimo 1 moeda de transporte *");
        Thread.sleep(2000);

        } catch (InterruptedException e) {

        }
    }

    public void menuPrincipal() { // Menu Principal do jogo, aparece após as perguntas do mercador.
        // Mercador
        
        limparConsole();

        // Apenas para melhorar a experiência do usuário.
        criarLinhas();
        System.out.println("                Menu Principal");
        criarLinhas();
        System.out.println(" 1. Viajar para a próxima cidade.");
        System.out.println(" 2. Ver missão.");
        System.out.println(" 3. Ver mapa.\n");
        System.out.println(" 9. Sair do jogo.");

        // Linha que não é utilizada em nenhuma outra parte.
        System.out.println("----------------------------------------------"); 

        // Mostra as moedas atuais que o jogador tem, poder atual da joia e limiar atual da joia.
        System.out.println(" Moedas: " + main.max.getMoedas() + " Poder da Joia: " + main.joia.getPoderJoia() + 
                " | Limiar: " + main.joia.getPoderJoia());
        criarLinhas();
       
        escolha = scanner.nextInt(); // recebe a escolha do usuário e previne alguns erros.
        while (escolha < 1 || escolha > 3 && escolha != 9) {
            System.out.println("Escolha um opção válida.");
            escolha = scanner.nextInt();
        }

        limparConsole();

        if (escolha == 1) {
            menuViagem();
        } else if (escolha == 2) {
            menuMissao();
        } else if (escolha == 3){
            // Mostra a imagem e retorna ao menu principal ao fechar o mapa.
            try {
                ExibirImagem imagem = new ExibirImagem(); 
                imagem.mostrarImagem();
                Thread.sleep(2000);

                menuPrincipal();
            } catch (InterruptedException e) {

            }
        } else {
            System.exit(0); // Finaliza o programa.
        }       
    }

    public void menuViagem(){
        MapaGrafo mapa = new MapaGrafo();
        Vertice destino = new Vertice();

        criarLinhas();
        System.out.println("        1. Viajar para a próxima cidade.");
        criarLinhas();
        destino = viagem.mostrarDestinos(main.max.getCidadeAtual(),mapa);

        viagem.fazerViagem(main.max, destino);
        
        // Maxwell so morre quando ele não tem mais dinheiro para fazer a viagem e ainda sim tenta faze-la.
        if (main.max.getMoedas() == -1) { 
            try {
                limparConsole();
                System.out.println("~ Max ficou sem moedas! O jogo acabou. ~");
                Thread.sleep(2300);
                System.exit(0);
            } catch (Exception e) {

            }
        }
        menuPrincipal();
    }

    public void menuMissao() {
        //if (main.max.getCidadeAtual().getMissao() != null) {

        //}

    }

    public void limparConsole() { // Limpa o console ¯\_(ツ)_/¯
        final String sistemaOperacional = System.getProperty("os.name");

        try {
            if (sistemaOperacional.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {

        }
    }

    public void criarLinhas() { // Linhas padronizadas do menu.
        System.out.println("+--------------------------------------------+");
    }
}
