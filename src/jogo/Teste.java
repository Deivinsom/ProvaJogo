package src.jogo;

public class Teste {
    public static void main(String[] args) {
        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();
        Menu me = new Menu();
        me.menuPrincipal();
    }
}
