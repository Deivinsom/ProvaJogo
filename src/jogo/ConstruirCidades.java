package src.jogo;

public class ConstruirCidades {

    public static Cidade unbud() {
        Cidade unbud = new Cidade(null, null, 0);
        return unbud;
    }

    public static Cidade kingdomOfLemod() {
        Cidade kingdoOfLemod = new Cidade(null, null, 2);
        return kingdoOfLemod;
    }

    public static Cidade principalityOfNekikh() {
        Cidade principalityOfNekikh = new Cidade(null, null, 1);
        return principalityOfNekikh;
    }

    public static Cidade kingdomOfOldcalia() {
        Cidade kingdomOfOldcalia = new Cidade(null, null, 4);
        return kingdomOfOldcalia;
    }

    public static Cidade protectorateOfDogrove() {
        Cidade protectorateOfDogrove = new Cidade(null, null, 3);
        return protectorateOfDogrove;
    }

    public static Cidade principalityOfGritesthr() {
        Cidade principalityOfGritesthr = new Cidade(null, null, 5);
        return principalityOfGritesthr;
    }

    public static Cidade kingdomOfLastwatch() {
        Cidade kingdomOfLastwatch = new Cidade(null, null, -2);
        return kingdomOfLastwatch;
    }

    public static Cidade grandDuchyOfSmalia() {
        Cidade grandDuchyOfSmalia = new Cidade(null, null, 1);
        return grandDuchyOfSmalia;
    }

    public static Cidade defalsia() {
        Missao missao = new Missao("Botas do poder",
                "Vá até a cidade de Principality of Kasya e receba as botas do poder",
                6, 3, 1);
        Cidade defalsia = new Cidade("Defalsia", missao, -3);
        return defalsia;
    }

    public static Cidade kingdomOfKalb() {
        Missao missao = new Missao("Luvas do poder",
                "Vá até a cidade de Grand Duchy of Smalia e receba as luvas do poder",
                4, 2, 2);
        Cidade kindomofKalb = new Cidade("Kingdom of Kalb", missao, 2);
        return kindomofKalb;
    }

    public static Cidade aymarLeague() {
        Cidade aymarLeague = new Cidade(null, null, 1);
        return aymarLeague;
    }

    public static Cidade principalityOfKarhora() {
        Cidade principalityOfKarhora = new Cidade(null, null, -2);
        return principalityOfKarhora;
    }

    public static Cidade vuneseEmpire() {
        Cidade vuneseEmpire = new Cidade(null, null, 0);
        return vuneseEmpire;
    }

    public static Cidade bun() {
        Cidade bun = new Cidade(null, null, 5);
        return bun;
    }

    public static Cidade nargumun() {
        Cidade nargumun = new Cidade(null, null, 0);
        return nargumun;
    }

    public static Cidade chandirSultanate() {
        Cidade chandirSultanate = new Cidade(null, null, 1);
        return chandirSultanate;
    }

    public static Cidade principalityOfKasya() {
        Cidade principalityOfKasya = new Cidade(null, null, -7);
        return principalityOfKasya;
    }
}