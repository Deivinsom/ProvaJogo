package src.jogo;

public class ConstruirCidades {

    // Construindo as cidades do mapa

    public static Vertice ubud() {
        Cidade ubud = new Cidade("Ubud", null, 0, 0);
        Vertice novo = new Vertice(ubud);
        return novo;
    }

    public static Vertice kingdomOfLegmod() {
        Cidade kingdomOfLegmod = new Cidade("Kingdom Of Legmod", null, 2, 1);
        Vertice novo = new Vertice(kingdomOfLegmod);
        return novo;
    }

    public static Vertice principalityOfNekika() {
        Cidade principalityOfNekika = new Cidade("Principality Of Nekika", null, 1, 2);
        Vertice novo = new Vertice(principalityOfNekika);
        return novo;
    }

    public static Vertice principalityOfGritestar() {
        Cidade principalityOfGritestar = new Cidade("Principality Of Gritestar", null, 5, 3);
        Vertice novo = new Vertice(principalityOfGritestar);
        return novo;
    }

    public static Vertice protectorateOfDogrove() {
        Cidade protectorateOfDogrove = new Cidade("Protectorate Of Dogrove", null, 3, 4);
        Vertice novo = new Vertice(protectorateOfDogrove);
        return novo;
    }

    public static Vertice kingdomOfLastwatch() {
        Cidade kingdomOfLastwatch = new Cidade("Kingdom Of Lastwatch", null, -2, 5);
        Vertice novo = new Vertice(kingdomOfLastwatch);
        return novo;
    }

    public static Vertice grandDuchyOfSmalia() {
        Cidade grandDuchyOfSmalia = new Cidade("Grand Duchy Of Smalia", null, 1, 6);
        Vertice novo = new Vertice(grandDuchyOfSmalia);
        return novo;
    }

    public static Vertice kingdomOfOldcalia() {
        Cidade kingdomOfOldcalia = new Cidade("Kingdom Of Oldcalia", null, 4, 7);
        Vertice novo = new Vertice(kingdomOfOldcalia);
        return novo;
    }

    public static Vertice defalsia() {
        Missao missao = new Missao("Botas do poder",
                "Vá até a cidade de Principality of Kasya e receba as botas do poder",
                6, 3, 1);
        Cidade defalsia = new Cidade("Defalsia", missao, -3, 8);
        Vertice novo = new Vertice(defalsia);
        return novo;
    }

    public static Vertice kingdomOfKalb() {
        Missao missao = new Missao("Luvas do poder",
                "Vá até a cidade de Grand Duchy of Smalia e receba as luvas do poder",
                4, 2, 2);
        Cidade kindomofKalb = new Cidade("Kingdom Of Kalb", missao, 2, 9);
        Vertice novo = new Vertice(kindomofKalb);
        return novo;
    }

    public static Vertice aymarLeague() {
        Cidade aymarLeague = new Cidade("Aymar League", null, 1, 10);
        Vertice novo = new Vertice(aymarLeague);
        return novo;
    }

    public static Vertice vuneseEmpire() {
        Cidade vuneseEmpire = new Cidade("Vunese Empire", null, 0, 11);
        Vertice novo = new Vertice(vuneseEmpire);
        return novo;
    }

    public static Vertice principalityOfKarhora() {
        Cidade principalityOfKarhora = new Cidade("Principality Of Karhora", null, -2, 12);
        Vertice novo = new Vertice(principalityOfKarhora);
        return novo;
    }

    public static Vertice nargumun() {
        Cidade nargumun = new Cidade("Nargumun", null, 0, 13);
        Vertice novo = new Vertice(nargumun);
        return novo;
    }

    public static Vertice bun() {
        Cidade bun = new Cidade("Bun", null, 5, 14);
        Vertice novo = new Vertice(bun);
        return novo;
    }

    public static Vertice chandirSultanate() {
        Cidade chandirSultanate = new Cidade("Chandir Sultanate", null, 1, 15);
        Vertice novo = new Vertice(chandirSultanate);
        return novo;

    }

    public static Vertice principalityOfKasya() {
        Cidade principalityOfKasya = new Cidade("Principality Of Kasya", null, -7, 16);
        Vertice novo = new Vertice(principalityOfKasya);
        return novo;
    }
}