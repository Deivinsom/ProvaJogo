package src.jogo;

import java.util.Scanner;

public class Mercador {
    Scanner scanner = new Scanner(System.in);

    private int moedas;
    private String origem;
    private String destino; 
    private String decisao;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDecisao() {
        return decisao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }
    
    public Mercador perguntasMercador() {
        Mercador respostas = new Mercador();
        
        System.out.println("\n* Maxwell chega na cidade e é abordado por um mercador *");

        System.out.println("\n~ Mercador ~\n 'Olá querido viajante, essas estradas pela quais vóis passas estão muito perigosas.\n" +
                "Quantas de suas moedas estão a salvo?'");
        respostas.moedas = scanner.nextInt();

        System.out.println("\n~ Mercador ~\n 'SHISHISHI! ... Deveras intrigante, seus pés parecem cansados, de onde vens?'");
        respostas.origem = scanner.nextLine();

        System.out.println("\n~ Mercador ~\n 'Definitivamente foi uma caminhada SHISHISHI!, mas para onde vosmecê pretendes ir?'");
        respostas.destino = scanner.nextLine();

        System.out.println("\n~ Mercador ~\n 'Uma última pergunta grande cavalheiro, vóis não tem interesse em trocar algumas de suas \n" +
                "moedas para aumentar o limiar da poderosa jóia em sua posse?' (S/N)");
        respostas.decisao = scanner.nextLine();

        return respostas;
    }
}