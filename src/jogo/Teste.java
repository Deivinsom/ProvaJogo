package src.jogo;

public class Teste {
    public static void main(String[] args) {
        Vertice a = Viagem.mostrarDestinos(0);
        System.out.println(a.getCidade().getValorRota());
        Maxwell max = new Maxwell(0, 0, 0);
        Viagem.fazerViagem(max, a);
    }
}
