package src.jogo;

import java.util.Scanner;

public class Menu {
    Main main = new Main();
    private Mercador mercador = new Mercador();
    static Viagem viagem = new Viagem();
    private Vertice missaoAtual = new Vertice();

    private boolean temMissao = false;
    private int escolha = -1;
    private Vertice cidadeAtual = MapaGrafo.grafo.imprimirVertice(main.max.getCidadeAtual());

    Scanner scanner = new Scanner(System.in);

    public void dialogoInicial() { // apenas para entretenimento.
        MenuUtil.limparConsole();

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
            System.out.println("\nPressione <ENTER> para continuar");
            scanner.nextLine();

            menuPrincipal();
        } catch (InterruptedException e) {

        }
    }

    public void menuPrincipal() { // Menu Principal do jogo, aparece após as perguntas do mercador.
        MenuUtil.limparConsole();

        if (MapaGrafo.grafo.verificarMissao(main.max.getCidadeAtual())) {
            MenuUtil.criarLinhas();
            System.out.println("        ~ Essa cidade tem uma missão! ~");
            MenuUtil.criarLinhas();
            System.out.println();
        }

        MenuUtil.criarLinhas();
        System.out.println("                Menu Principal");
        MenuUtil.criarLinhas();
        System.out.println(" 1. Viajar para a próxima cidade.");
        System.out.println(" 2. Ver missão.");
        System.out.println(" 3. Ver mapa.\n");
        System.out.println(" 9. Sair do jogo.\n");
        System.out.println(" Cidade atual: " + MapaGrafo.grafo.imprimirNome(main.max.getCidadeAtual()));
        System.out.println("----------------------------------------------"); 

        // Mostra as moedas atuais que o jogador tem, poder atual da joia e limiar atual da joia.
        System.out.println(" Moedas: " + main.max.getMoedas() + " Poder da Joia: " + main.joia.getPoderJoia() + 
                " | Limiar: " + main.max.getLimitador());
        MenuUtil.criarLinhas();
    
        escolha = scanner.nextInt(); // recebe a escolha do usuário e previne alguns erros.
        while (escolha < 1 || escolha > 3 && escolha != 9) {
            System.out.println("Escolha um opção válida.");
            escolha = scanner.nextInt();
        }

        MenuUtil.limparConsole();
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

    public void trocaCidade() { // Chamado quando o Maxwell troca de cidade
        MenuUtil.limparConsole();

        MenuUtil.verificarNargumun(cidadeAtual, main.max);
        
        mercador.respostasMercador(main.max);

        MenuUtil.limparConsole();

        Object[] array = MenuUtil.concluirMissao(temMissao, missaoAtual, cidadeAtual, main.max);
        if (array != null) {
            temMissao = (boolean) array[0];
            missaoAtual = (Vertice) array[1];
        }

        MenuUtil.verificarMoedas(main.max);

        menuPrincipal();
    }

    public void menuViagem(){ // Menu de escolhas para viagem
        MapaGrafo mapa = new MapaGrafo();
        Vertice destino = new Vertice();
        
        MenuUtil.criarLinhas();
        System.out.println("        1. Viajar para a próxima cidade.");
        MenuUtil.criarLinhas();
        destino = viagem.mostrarDestinos(main.max.getCidadeAtual(), mapa);

        if (destino.getCidade().getId() != cidadeAtual.getCidade().getId()) {
            viagem.fazerViagem(main.max, destino, main.joia);
        } else {
            menuPrincipal();
        }

        // Maxwell so morre quando ele não tem mais dinheiro para fazer a viagem e ainda sim tenta faze-la.
        MenuUtil.verificarMoedas(main.max);
        MenuUtil.verificarJoia(main.max, main.joia);

        cidadeAtual = destino;

        trocaCidade();
    }

    public void menuMissao() { // Menu de escolhas para missão
        Vertice cidadeAtual = new Vertice();
        cidadeAtual = MapaGrafo.grafo.imprimirVertice(main.max.getCidadeAtual());

        if (temMissao == true) {
            int opcaoEscolhida = 0;
            
            MenuUtil.criarLinhas();
            System.out.println("                2. Ver missão.");
            MenuUtil.criarLinhas();
            System.out.println("\n       Você tem uma missão ativa.\n");
            System.out.println(missaoAtual.getCidade().getMissao().getText());
            System.out.println("\n ~ Deseja desistir dela? ~" + 
                    "\n 1. Sim" + 
                    "\n 2. Não" + 
                    "\n\n 9. Voltar");
            MenuUtil.criarLinhas();

            opcaoEscolhida = scanner.nextInt();
            while (opcaoEscolhida < 1 || opcaoEscolhida > 2 && opcaoEscolhida != 9) {
                System.out.println("Escolha um opção válida.");
                opcaoEscolhida = scanner.nextInt();
            }

            if (opcaoEscolhida == 1) {
                try {
                    temMissao = false;
                    missaoAtual = null;
                    cidadeAtual.getCidade().setMissao(null);

                    System.out.println("\n ~ Missão Abortada! ~");
                    Thread.sleep(2000);
                    menuPrincipal();
                } catch (Exception e) {

                }
            } else {
                menuPrincipal();
            }

        } else if (MapaGrafo.grafo.verificarMissao(main.max.getCidadeAtual())) {
            int opcaoEscolhida = 0;

            MenuUtil.criarLinhas();
            System.out.println("                2. Ver missão.");
            MenuUtil.criarLinhas();

            System.out.println(cidadeAtual.getCidade().getMissao().getText());
            System.out.println("\n -> Prêmio por aceitar:\n  - " + cidadeAtual.getCidade().getMissao().getRecomAceitar() + 
                    " Moedas de Transporte");
            System.out.println("\n -> Prêmio por concluir:\n  - " + 
                    cidadeAtual.getCidade().getMissao().getRecomCompletar() + " Moedas de transporte\n  - O limiar da jóia aumenta em " + 
                    cidadeAtual.getCidade().getMissao().getAlterarJoia() + " pontos");

            System.out.println("\n ~ Você aceita a missão? ~" + "\n 1. Sim" + "\n 2. Não" + "\n\n 9. Voltar");
            MenuUtil.criarLinhas();

            opcaoEscolhida = scanner.nextInt();
            while (opcaoEscolhida < 1 || opcaoEscolhida > 2 && opcaoEscolhida != 9) {
                System.out.println("Escolha um opção válida.");
                escolha = scanner.nextInt();
            }

            if (opcaoEscolhida == 1) {
                try {
                    temMissao = true;
                    missaoAtual = cidadeAtual;
                    main.max.setMoedas(main.max.getMoedas() + missaoAtual.getCidade().getMissao().getRecomAceitar());

                    System.out.println("\n ~ Missão Aceita! ~");
                    Thread.sleep(2000);
                    menuPrincipal();
                } catch (Exception e) {
            
                }
            } else {
                menuPrincipal();
            }
        } else {
            int voltar = 0;

            MenuUtil.criarLinhas();
            System.out.println("                2. Ver missão.");
            MenuUtil.criarLinhas();
            System.out.println("\n      ~ Essa cidade não tem missão ~\n");
            System.out.println(" 9. Voltar");
            MenuUtil.criarLinhas();

            voltar = scanner.nextInt();
            if (voltar != 9) {
                try {
                    System.out.println("Você so tinha uma opção e ainda assim... Voltando ao menu...");
                    Thread.sleep(2300);
                    menuPrincipal();
                } catch (Exception e) {

                }
            } else {
                menuPrincipal();
            }
        }
    }
}