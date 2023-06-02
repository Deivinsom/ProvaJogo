package src.jogo;

public class Teste {
    public static void main(String[] args) {
        No novo = new No(ConstruirCidades.kingdomOfKalb());
        No prox = new No(ConstruirCidades.bun());
        novo.setNext(prox);
        prox.setPreveus(novo);
        System.out.println(novo.getNext().getCidade().getAlterarJoia());
    }
}
