package src.jogo;

public class MenuUtil extends Menu{

    public static void limparConsole() { // Limpa o console ¯\_(ツ)_/¯
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

    public static void criarLinhas() { // Linhas padronizadas do menu.
        System.out.println("+--------------------------------------------+");
    }

    public static void verificarMoedas(Maxwell max) { // Verifica a quantidade de moedas do Maxwell
        if (max.getMoedas() <= -1) { 
            try {
                limparConsole();
                System.out.println("  ~ Max ficou sem moedas e acabou sendo vendido como um escravo por suas dívidas! ~\n\n" + 
                        "                           ~ O jogo acabou. ~");
                Thread.sleep(6000);
                System.exit(0);
            } catch (Exception e) {

            }
        }
    }

    public static void verificarJoia(Maxwell max, Joia joia) { // Verifica se a quantidade de poder irá matar o Maxwell
        if (joia.getPoderJoia() < 0 || joia.getPoderJoia() > max.getLimitador()) { 
            if (joia.getPoderJoia() < 0) {
                try {
                    limparConsole();
                    System.out.println("  ~ O poder da jóia diminuiu ao ponto de ficar negativo, ela começa a acumular energia\n" + 
                            "  negra e profana, absorvendo Maxwell para um mundo mágico cheio de sofrimento pela eternidade. ~\n\n" +
                            "                               ~ O jogo acabou. ~");
                    Thread.sleep(10000);
                    System.exit(0);
                } catch (Exception e) {

                }
            } else {
                try {
                    limparConsole();
                    System.out.println("  ~ O poder da jóia aumentou ao ponto de Maxwell não conseguir controlá-la. Com a joia\n" + 
                            "  instável, ele resolve que a melhor decisão é jogá-la para longe e tentar salvar a si mesmo.\n" +
                            "  Ao cair, ela explode levando toda a região... e Maxwell também. ~\n\n" +
                            "                               ~ O jogo acabou. ~");
                    Thread.sleep(13000);
                    System.exit(0);
                } catch (Exception e) {

                }
            }
        }
    }

    public static void verificarNargumun(Vertice cidadeAtual, Maxwell max) { // Verifica se Maxwell chegou a Nargumun
        if (cidadeAtual.getCidade().getNome() == "Nargumun") { // Finaliza o jogo ao chegar em Nargumun.
            criarLinhas();
            System.out.println("                 NARGUMUN");
            criarLinhas();
            System.out.println("\n      * Maxwell chegou em Nargumun *\n");
            System.err.println("    ~ Você tem " + max.getMoedas() + " Moedas de Transporte ~\n");
            
            if (max.getMoedas() < 4) {
                System.out.println(" * Maxwell é acolhido como servo da coroa\n               de Nargumun *\n");
            } else if (max.getMoedas() >= 4 && max.getMoedas() <= 10) {
                System.out.println(" * Maxwell é condecorado Lorde pela coroa\n               de Nargumun *\n");
            } else {
                System.out.println(" * Maxwell é condecorado Rei de Nargumun ao\n              chegar a cidade *\n");
            }
            criarLinhas();

            System.exit(0);
        }
    }

    public static void concluirMissao(boolean temMissao, Vertice missaoAtual, Vertice cidadeAtual, Maxwell max) { // Verifica se Maxwell chegou na cidade da missão
        if (temMissao) {
            if (missaoAtual.getCidade().getMissao().getTitulo() == "Botas do poder") {
                if (missaoAtual.getCidade().getMissao().getCidadeConclusao() == cidadeAtual.getCidade().getId()) {
                    criarLinhas();
                    System.out.println("                  Missão");
                    criarLinhas();
                    System.out.println("\n        ~ Você concluiu a missão ~\n");
                    System.out.println("");
                    max.setMoedas(max.getMoedas()+missaoAtual.getCidade().getMissao().getRecomCompletar());
                    max.setLimitador(max.getLimitador()+missaoAtual.getCidade().getMissao().getAlterarJoia());
                    missaoAtual = null;


                }
            } else if (missaoAtual.getCidade().getMissao().getTitulo() == "Luvas do poder") {

            } else if (missaoAtual.getCidade().getMissao().getTitulo() == "Glória dos Retornados") {

            }
        }
    }
}
