package src.jogo;

public class MapaGrafo {
    static Grafo grafo = new Grafo();
//Adiconando os vertices com as cidades ao grafo
    public static void addCidades() {
        grafo.addVertice(ConstruirCidades.ubud());
        grafo.addVertice(ConstruirCidades.kingdomOfLegmod());
        grafo.addVertice(ConstruirCidades.principalityOfNekika());
        grafo.addVertice(ConstruirCidades.principalityOfGritestar());
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
        grafo.addAresta(0, ConstruirCidades.ubud(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(0, ConstruirCidades.ubud(), ConstruirCidades.principalityOfNekika());

        grafo.addAresta(1, ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.ubud());
        grafo.addAresta(1, ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.principalityOfNekika());
        grafo.addAresta(1, ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.principalityOfGritestar());
        grafo.addAresta(1, ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(1, ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.kingdomOfOldcalia());

        grafo.addAresta(2, ConstruirCidades.principalityOfNekika(), ConstruirCidades.ubud());
        grafo.addAresta(2, ConstruirCidades.principalityOfNekika(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(2, ConstruirCidades.principalityOfNekika(), ConstruirCidades.principalityOfGritestar());

        grafo.addAresta(3, ConstruirCidades.principalityOfGritestar(), ConstruirCidades.principalityOfNekika());
        grafo.addAresta(3, ConstruirCidades.principalityOfGritestar(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(3, ConstruirCidades.principalityOfGritestar(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(3, ConstruirCidades.principalityOfGritestar(), ConstruirCidades.kingdomOfLastwatch());

        grafo.addAresta(4, ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(4, ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.principalityOfGritestar());
        grafo.addAresta(4, ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.kingdomOfLastwatch());
        grafo.addAresta(4, ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.kingdomOfOldcalia());

        grafo.addAresta(5, ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.principalityOfGritestar());
        grafo.addAresta(5, ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(5, ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(5, ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.grandDuchyOfSmalia());

        grafo.addAresta(6, ConstruirCidades.grandDuchyOfSmalia(), ConstruirCidades.kingdomOfLastwatch());
        grafo.addAresta(6, ConstruirCidades.grandDuchyOfSmalia(), ConstruirCidades.kingdomOfOldcalia());

        grafo.addAresta(7, ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(7, ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(7, ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.kingdomOfLastwatch());
        grafo.addAresta(7, ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.grandDuchyOfSmalia());
        grafo.addAresta(7, ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.defalsia());
        grafo.addAresta(7, ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.aymarLeague());
        grafo.addAresta(7, ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.kingdomOfKalb());

        grafo.addAresta(8, ConstruirCidades.defalsia(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(8, ConstruirCidades.defalsia(), ConstruirCidades.aymarLeague());

        grafo.addAresta(9, ConstruirCidades.kingdomOfKalb(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(9, ConstruirCidades.kingdomOfKalb(), ConstruirCidades.aymarLeague());
        grafo.addAresta(9, ConstruirCidades.kingdomOfKalb(), ConstruirCidades.vuneseEmpire());

        grafo.addAresta(10, ConstruirCidades.aymarLeague(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(10, ConstruirCidades.aymarLeague(), ConstruirCidades.defalsia());
        grafo.addAresta(10, ConstruirCidades.aymarLeague(), ConstruirCidades.kingdomOfKalb());
        grafo.addAresta(10, ConstruirCidades.aymarLeague(), ConstruirCidades.vuneseEmpire());
        grafo.addAresta(10, ConstruirCidades.aymarLeague(), ConstruirCidades.principalityOfKarhora());
        grafo.addAresta(10, ConstruirCidades.aymarLeague(), ConstruirCidades.nargumun());
        grafo.addAresta(10, ConstruirCidades.aymarLeague(), ConstruirCidades.bun());
        grafo.addAresta(10, ConstruirCidades.aymarLeague(), ConstruirCidades.chandirSultanate());

        grafo.addAresta(11, ConstruirCidades.vuneseEmpire(), ConstruirCidades.kingdomOfKalb());
        grafo.addAresta(11, ConstruirCidades.vuneseEmpire(), ConstruirCidades.aymarLeague());
        grafo.addAresta(11, ConstruirCidades.vuneseEmpire(), ConstruirCidades.chandirSultanate());

        grafo.addAresta(12, ConstruirCidades.principalityOfKarhora(), ConstruirCidades.aymarLeague());
        grafo.addAresta(12, ConstruirCidades.principalityOfKarhora(), ConstruirCidades.nargumun());

        grafo.addAresta(13, ConstruirCidades.nargumun(), ConstruirCidades.principalityOfKarhora());
        grafo.addAresta(13, ConstruirCidades.nargumun(), ConstruirCidades.aymarLeague());
        grafo.addAresta(13, ConstruirCidades.nargumun(), ConstruirCidades.bun());

        grafo.addAresta(14, ConstruirCidades.bun(), ConstruirCidades.aymarLeague());
        grafo.addAresta(14, ConstruirCidades.bun(), ConstruirCidades.nargumun());
        grafo.addAresta(14, ConstruirCidades.bun(), ConstruirCidades.chandirSultanate());

        grafo.addAresta(15, ConstruirCidades.chandirSultanate(), ConstruirCidades.vuneseEmpire());
        grafo.addAresta(15, ConstruirCidades.chandirSultanate(), ConstruirCidades.aymarLeague());
        grafo.addAresta(15, ConstruirCidades.chandirSultanate(), ConstruirCidades.bun());
        grafo.addAresta(15, ConstruirCidades.chandirSultanate(), ConstruirCidades.principalityOfKasya());

        grafo.addAresta(16, ConstruirCidades.principalityOfKasya(), ConstruirCidades.chandirSultanate());       
    }
    
}