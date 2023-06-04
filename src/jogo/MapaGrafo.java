package src.jogo;

public class MapaGrafo {
    static Grafo grafo = new Grafo();
//Adiconando os vertices com as cidades ao grafo
    public static void addCidades() {
        grafo.addVertice(ConstruirCidades.unbud());
        grafo.addVertice(ConstruirCidades.kingdomOfLemod());
        grafo.addVertice(ConstruirCidades.principalityOfNekikh());
        grafo.addVertice(ConstruirCidades.principalityOfGritesthr());
        grafo.addVertice(ConstruirCidades.protectorateOfDogrove());
        grafo.addVertice(ConstruirCidades.kingdomOfOldcalia());
        grafo.addVertice(ConstruirCidades.kingdomOfLastwatch());
        grafo.addVertice(ConstruirCidades.grandDuchyOfSmalia());
        grafo.addVertice(ConstruirCidades.kingdomOfKalb());
        grafo.addVertice(ConstruirCidades.aymarLeague());
        grafo.addVertice(ConstruirCidades.vuneseEmpire());
        grafo.addVertice(ConstruirCidades.bun());
        grafo.addVertice(ConstruirCidades.nargumun());
        grafo.addVertice(ConstruirCidades.chandirSultanate());
        grafo.addVertice(ConstruirCidades.principalityOfKarhora());
        grafo.addVertice(ConstruirCidades.principalityOfKasya());
        
    }

    public static void addCaminhos() {
        grafo.addAresta(0, ConstruirCidades.unbud(), ConstruirCidades.kingdomOfLemod());
        grafo.addAresta(0, ConstruirCidades.unbud(), ConstruirCidades.principalityOfNekikh());
        grafo.addAresta(1, ConstruirCidades.kingdomOfLemod(), ConstruirCidades.unbud());
        grafo.addAresta(2, ConstruirCidades.kingdomOfLemod(), ConstruirCidades.principalityOfNekikh());
        grafo.addAresta(1, ConstruirCidades.principalityOfNekikh(), ConstruirCidades.unbud());
        grafo.addAresta(2, ConstruirCidades.principalityOfNekikh(), ConstruirCidades.kingdomOfLemod());
    }
}
