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
// Adicionando as Fronteiras
    public static void addCaminhos() {
        grafo.addAresta(ConstruirCidades.ubud().getCidade().getValorRota(), ConstruirCidades.ubud(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(ConstruirCidades.ubud().getCidade().getValorRota(), ConstruirCidades.ubud(), ConstruirCidades.principalityOfNekika());

        grafo.addAresta(ConstruirCidades.kingdomOfLegmod().getCidade().getValorRota(), ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.ubud());
        grafo.addAresta(ConstruirCidades.kingdomOfLegmod().getCidade().getValorRota(), ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.principalityOfNekika());
        grafo.addAresta(ConstruirCidades.kingdomOfLegmod().getCidade().getValorRota(), ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.principalityOfGritestar());
        grafo.addAresta(ConstruirCidades.kingdomOfLegmod().getCidade().getValorRota(), ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(ConstruirCidades.kingdomOfLegmod().getCidade().getValorRota(), ConstruirCidades.kingdomOfLegmod(), ConstruirCidades.kingdomOfOldcalia());

        grafo.addAresta(ConstruirCidades.principalityOfNekika().getCidade().getValorRota(), ConstruirCidades.principalityOfNekika(), ConstruirCidades.ubud());
        grafo.addAresta(ConstruirCidades.principalityOfNekika().getCidade().getValorRota(), ConstruirCidades.principalityOfNekika(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(ConstruirCidades.principalityOfNekika().getCidade().getValorRota(), ConstruirCidades.principalityOfNekika(), ConstruirCidades.principalityOfGritestar());

        grafo.addAresta(ConstruirCidades.principalityOfNekika().getCidade().getValorRota(), ConstruirCidades.principalityOfGritestar(), ConstruirCidades.principalityOfNekika());
        grafo.addAresta(ConstruirCidades.principalityOfNekika().getCidade().getValorRota(), ConstruirCidades.principalityOfGritestar(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(ConstruirCidades.principalityOfNekika().getCidade().getValorRota(), ConstruirCidades.principalityOfGritestar(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(ConstruirCidades.principalityOfNekika().getCidade().getValorRota(), ConstruirCidades.principalityOfGritestar(), ConstruirCidades.kingdomOfLastwatch());

        grafo.addAresta(ConstruirCidades.protectorateOfDogrove().getCidade().getValorRota(), ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(ConstruirCidades.protectorateOfDogrove().getCidade().getValorRota(), ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.principalityOfGritestar());
        grafo.addAresta(ConstruirCidades.protectorateOfDogrove().getCidade().getValorRota(), ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.kingdomOfLastwatch());
        grafo.addAresta(ConstruirCidades.protectorateOfDogrove().getCidade().getValorRota(), ConstruirCidades.protectorateOfDogrove(), ConstruirCidades.kingdomOfOldcalia());

        grafo.addAresta(ConstruirCidades.kingdomOfLastwatch().getCidade().getValorRota(), ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.principalityOfGritestar());
        grafo.addAresta(ConstruirCidades.kingdomOfLastwatch().getCidade().getValorRota(), ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(ConstruirCidades.kingdomOfLastwatch().getCidade().getValorRota(), ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(ConstruirCidades.kingdomOfLastwatch().getCidade().getValorRota(), ConstruirCidades.kingdomOfLastwatch(), ConstruirCidades.grandDuchyOfSmalia());

        grafo.addAresta(ConstruirCidades.grandDuchyOfSmalia().getCidade().getValorRota(), ConstruirCidades.grandDuchyOfSmalia(), ConstruirCidades.kingdomOfLastwatch());
        grafo.addAresta(ConstruirCidades.grandDuchyOfSmalia().getCidade().getValorRota(), ConstruirCidades.grandDuchyOfSmalia(), ConstruirCidades.kingdomOfOldcalia());

        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getValorRota(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.kingdomOfLegmod());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getValorRota(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.protectorateOfDogrove());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getValorRota(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.kingdomOfLastwatch());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getValorRota(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.grandDuchyOfSmalia());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getValorRota(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.defalsia());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getValorRota(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.kingdomOfOldcalia().getCidade().getValorRota(), ConstruirCidades.kingdomOfOldcalia(), ConstruirCidades.kingdomOfKalb());

        grafo.addAresta(ConstruirCidades.defalsia().getCidade().getValorRota(), ConstruirCidades.defalsia(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(ConstruirCidades.defalsia().getCidade().getValorRota(), ConstruirCidades.defalsia(), ConstruirCidades.aymarLeague());

        grafo.addAresta(ConstruirCidades.kingdomOfKalb().getCidade().getValorRota(), ConstruirCidades.kingdomOfKalb(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(ConstruirCidades.kingdomOfKalb().getCidade().getValorRota(), ConstruirCidades.kingdomOfKalb(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.kingdomOfKalb().getCidade().getValorRota(), ConstruirCidades.kingdomOfKalb(), ConstruirCidades.vuneseEmpire());

        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getValorRota(), ConstruirCidades.aymarLeague(), ConstruirCidades.kingdomOfOldcalia());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getValorRota(), ConstruirCidades.aymarLeague(), ConstruirCidades.defalsia());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getValorRota(), ConstruirCidades.aymarLeague(), ConstruirCidades.kingdomOfKalb());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getValorRota(), ConstruirCidades.aymarLeague(), ConstruirCidades.vuneseEmpire());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getValorRota(), ConstruirCidades.aymarLeague(), ConstruirCidades.principalityOfKarhora());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getValorRota(), ConstruirCidades.aymarLeague(), ConstruirCidades.nargumun());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getValorRota(), ConstruirCidades.aymarLeague(), ConstruirCidades.bun());
        grafo.addAresta(ConstruirCidades.aymarLeague().getCidade().getValorRota(), ConstruirCidades.aymarLeague(), ConstruirCidades.chandirSultanate());

        grafo.addAresta(ConstruirCidades.vuneseEmpire().getCidade().getValorRota(), ConstruirCidades.vuneseEmpire(), ConstruirCidades.kingdomOfKalb());
        grafo.addAresta(ConstruirCidades.vuneseEmpire().getCidade().getValorRota(), ConstruirCidades.vuneseEmpire(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.vuneseEmpire().getCidade().getValorRota(), ConstruirCidades.vuneseEmpire(), ConstruirCidades.chandirSultanate());

        grafo.addAresta(ConstruirCidades.principalityOfKarhora().getCidade().getValorRota(), ConstruirCidades.principalityOfKarhora(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.principalityOfKarhora().getCidade().getValorRota(), ConstruirCidades.principalityOfKarhora(), ConstruirCidades.nargumun());

        grafo.addAresta(ConstruirCidades.nargumun().getCidade().getValorRota(), ConstruirCidades.nargumun(), ConstruirCidades.principalityOfKarhora());
        grafo.addAresta(ConstruirCidades.nargumun().getCidade().getValorRota(), ConstruirCidades.nargumun(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.nargumun().getCidade().getValorRota(), ConstruirCidades.nargumun(), ConstruirCidades.bun());

        grafo.addAresta(ConstruirCidades.bun().getCidade().getValorRota(), ConstruirCidades.bun(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.bun().getCidade().getValorRota(), ConstruirCidades.bun(), ConstruirCidades.nargumun());
        grafo.addAresta(ConstruirCidades.bun().getCidade().getValorRota(), ConstruirCidades.bun(), ConstruirCidades.chandirSultanate());

        grafo.addAresta(ConstruirCidades.chandirSultanate().getCidade().getValorRota(), ConstruirCidades.chandirSultanate(), ConstruirCidades.vuneseEmpire());
        grafo.addAresta(ConstruirCidades.chandirSultanate().getCidade().getValorRota(), ConstruirCidades.chandirSultanate(), ConstruirCidades.aymarLeague());
        grafo.addAresta(ConstruirCidades.chandirSultanate().getCidade().getValorRota(), ConstruirCidades.chandirSultanate(), ConstruirCidades.bun());
        grafo.addAresta(ConstruirCidades.chandirSultanate().getCidade().getValorRota(), ConstruirCidades.chandirSultanate(), ConstruirCidades.principalityOfKasya());

        grafo.addAresta(ConstruirCidades.principalityOfKasya().getCidade().getValorRota(), ConstruirCidades.principalityOfKasya(), ConstruirCidades.chandirSultanate());       
    }
    
}