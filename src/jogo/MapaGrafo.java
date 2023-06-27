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
        grafo.addVertice(ConstruirCidades.kingdomOfLastwatch());
        grafo.addVertice(ConstruirCidades.grandDuchyOfSmalia());
        grafo.addVertice(ConstruirCidades.kingdomOfOldcalia());
        grafo.addVertice(ConstruirCidades.defalsia());
        grafo.addVertice(ConstruirCidades.kingdomOfKalb());
        grafo.addVertice(ConstruirCidades.aymarLeague());
        grafo.addVertice(ConstruirCidades.vuneseEmpire());
        grafo.addVertice(ConstruirCidades.principalityOfKarhora());
        grafo.addVertice(ConstruirCidades.nargumun());
        grafo.addVertice(ConstruirCidades.bun());
        grafo.addVertice(ConstruirCidades.chandirSultanate());
        grafo.addVertice(ConstruirCidades.principalityOfKasya());
    }
// Adicionando as Fronteiras
    public static void addCaminhos() {
        grafo.addAresta(ConstruirCidades.ubud().getCidade().getId(), ConstruirCidades.ubud(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(ConstruirCidades.ubud().getCidade().getId(), ConstruirCidades.ubud(), ConstruirCidades.principalityOfNekika());

        grafo.addAresta(ConstruirCidades.kingdomOfLegmod().getCidade().getId(), ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.ubud());
        grafo.addAresta(ConstruirCidades.kingdomOfLegmod().getCidade().getId(), ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.principalityOfNekika());
        grafo.addAresta(ConstruirCidades.kingdomOfLegmod().getCidade().getId(), ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.principalityOfGritestar());
        grafo.addAresta(ConstruirCidades.kingdomOfLegmod().getCidade().getId(), ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(ConstruirCidades.kingdomOfLegmod().getCidade().getId(), ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.kingdomOfOldcalia());

        grafo.addAresta(ConstruirCidades.principalityOfNekika().getCidade().getId(), ConstruirCidades.principalityOfNekika(), ConstruirCidades.ubud());
        grafo.addAresta(ConstruirCidades.principalityOfNekika().getCidade().getId(), ConstruirCidades.principalityOfNekika(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(ConstruirCidades.principalityOfNekika().getCidade().getId(), ConstruirCidades.principalityOfNekika(), ConstruirCidades.principalityOfGritestar());

        grafo.addAresta(ConstruirCidades.principalityOfGritestar().getCidade().getId(), ConstruirCidades.principalityOfGritestar(), ConstruirCidades.principalityOfNekika());
        grafo.addAresta(ConstruirCidades.principalityOfGritestar().getCidade().getId(), ConstruirCidades.principalityOfGritestar(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(ConstruirCidades.principalityOfGritestar().getCidade().getId(), ConstruirCidades.principalityOfGritestar(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(ConstruirCidades.principalityOfGritestar().getCidade().getId(), ConstruirCidades.principalityOfGritestar(), ConstruirCidades.kingdomOfLastwatch());

        grafo.addAresta(ConstruirCidades.protectorateOfDogrove().getCidade().getId(), ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(ConstruirCidades.protectorateOfDogrove().getCidade().getId(), ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.principalityOfGritestar());
        grafo.addAresta(ConstruirCidades.protectorateOfDogrove().getCidade().getId(), ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.kingdomOfLastwatch());
        grafo.addAresta(ConstruirCidades.protectorateOfDogrove().getCidade().getId(), ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.kingdomOfOldcalia());

        grafo.addAresta(ConstruirCidades.kingdomOfLastwatch().getCidade().getId(), ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.principalityOfGritestar());
        grafo.addAresta(ConstruirCidades.kingdomOfLastwatch().getCidade().getId(), ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(ConstruirCidades.kingdomOfLastwatch().getCidade().getId(), ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(ConstruirCidades.kingdomOfLastwatch().getCidade().getId(), ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.grandDuchyOfSmalia());

        grafo.addAresta(ConstruirCidades.grandDuchyOfSmalia().getCidade().getId(), ConstruirCidades.grandDuchyOfSmalia(), ConstruirCidades.kingdomOfLastwatch());
        grafo.addAresta(ConstruirCidades.grandDuchyOfSmalia().getCidade().getId(), ConstruirCidades.grandDuchyOfSmalia(), ConstruirCidades.kingdomOfOldcalia());

        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getId(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getId(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getId(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.kingdomOfLastwatch());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getId(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.grandDuchyOfSmalia());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getId(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.defalsia());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getId(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getId(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.kingdomOfKalb());

        grafo.addAresta(ConstruirCidades.defalsia().getCidade().getId(), ConstruirCidades.defalsia(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(ConstruirCidades.defalsia().getCidade().getId(), ConstruirCidades.defalsia(), ConstruirCidades.aymarLeague());

        grafo.addAresta(ConstruirCidades.kingdomOfKalb().getCidade().getId(), ConstruirCidades.kingdomOfKalb(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(ConstruirCidades.kingdomOfKalb().getCidade().getId(), ConstruirCidades.kingdomOfKalb(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.kingdomOfKalb().getCidade().getId(), ConstruirCidades.kingdomOfKalb(), ConstruirCidades.vuneseEmpire());

        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getId(), ConstruirCidades.aymarLeague(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getId(), ConstruirCidades.aymarLeague(), ConstruirCidades.defalsia());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getId(), ConstruirCidades.aymarLeague(), ConstruirCidades.kingdomOfKalb());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getId(), ConstruirCidades.aymarLeague(), ConstruirCidades.vuneseEmpire());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getId(), ConstruirCidades.aymarLeague(), ConstruirCidades.principalityOfKarhora());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getId(), ConstruirCidades.aymarLeague(), ConstruirCidades.nargumun());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getId(), ConstruirCidades.aymarLeague(), ConstruirCidades.bun());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getId(), ConstruirCidades.aymarLeague(), ConstruirCidades.chandirSultanate());

        grafo.addAresta(ConstruirCidades.vuneseEmpire().getCidade().getId(), ConstruirCidades.vuneseEmpire(), ConstruirCidades.kingdomOfKalb());
        grafo.addAresta(ConstruirCidades.vuneseEmpire().getCidade().getId(), ConstruirCidades.vuneseEmpire(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.vuneseEmpire().getCidade().getId(), ConstruirCidades.vuneseEmpire(), ConstruirCidades.chandirSultanate());

        grafo.addAresta(ConstruirCidades.principalityOfKarhora().getCidade().getId(), ConstruirCidades.principalityOfKarhora(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.principalityOfKarhora().getCidade().getId(), ConstruirCidades.principalityOfKarhora(), ConstruirCidades.nargumun());

        grafo.addAresta(ConstruirCidades.nargumun().getCidade().getId(), ConstruirCidades.nargumun(), ConstruirCidades.principalityOfKarhora());
        grafo.addAresta(ConstruirCidades.nargumun().getCidade().getId(), ConstruirCidades.nargumun(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.nargumun().getCidade().getId(), ConstruirCidades.nargumun(), ConstruirCidades.bun());

        grafo.addAresta(ConstruirCidades.bun().getCidade().getId(), ConstruirCidades.bun(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.bun().getCidade().getId(), ConstruirCidades.bun(), ConstruirCidades.nargumun());
        grafo.addAresta(ConstruirCidades.bun().getCidade().getId(), ConstruirCidades.bun(), ConstruirCidades.chandirSultanate());

        grafo.addAresta(ConstruirCidades.chandirSultanate().getCidade().getId(), ConstruirCidades.chandirSultanate(), ConstruirCidades.vuneseEmpire());
        grafo.addAresta(ConstruirCidades.chandirSultanate().getCidade().getId(), ConstruirCidades.chandirSultanate(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.chandirSultanate().getCidade().getId(), ConstruirCidades.chandirSultanate(), ConstruirCidades.bun());
        grafo.addAresta(ConstruirCidades.chandirSultanate().getCidade().getId(), ConstruirCidades.chandirSultanate(), ConstruirCidades.principalityOfKasya());

        grafo.addAresta(ConstruirCidades.principalityOfKasya().getCidade().getId(), ConstruirCidades.principalityOfKasya(), ConstruirCidades.chandirSultanate());       
    }
    
}