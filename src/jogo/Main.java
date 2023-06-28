package src.jogo;

public class Main {
    Maxwell max = new Maxwell(3, 7, 0);    
    Joia joia = new Joia();
    public static void main(String[] args) {
        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();
        Menu me = new Menu();

        me.menuPrincipal();
    }

}
