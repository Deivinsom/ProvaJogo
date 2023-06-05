 package src.jogo;

public class Teste {
    public static void main(String[] args) {
        ConstruirCidades.addLista();
        ListaEncadeafaCidades lista = ConstruirCidades.addLista();;
        System.out.println(lista.pesquisarCidade(1));
    }
}
