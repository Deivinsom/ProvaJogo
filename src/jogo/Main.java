package src.jogo;

public class Main {
    Maxwell max = new Maxwell(3, 7, 0);    
    Joia joia = new Joia(0);
    public static void main(String[] args) {
        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();
        Menu menu = new Menu();
        menu.dialogoInicial();
    }
}
