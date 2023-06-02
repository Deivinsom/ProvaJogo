package src.jogo;

public class ConstruirCidades {

//Construindo as cidades do mapa

    public static Cidade unbud() {
        Cidade unbud = new Cidade("Unbud", null, 0);
        return unbud;
    }

    public static Cidade kingdomOfLemod() {
        Cidade kingdoOfLemod = new Cidade("Kingdom Of Lemod", null, 2);
        return kingdoOfLemod;
    }

    public static Cidade principalityOfNekikh() {
        Cidade principalityOfNekikh = new Cidade("Principality Of Nekikh", null, 1);
        return principalityOfNekikh;
    }

    public static Cidade kingdomOfOldcalia() {
        Cidade kingdomOfOldcalia = new Cidade("Kingdom Of Oldcalia", null, 4);
        return kingdomOfOldcalia;
    }

    public static Cidade protectorateOfDogrove() {
        Cidade protectorateOfDogrove = new Cidade("Protectorate Of Dogrove", null, 3);
        return protectorateOfDogrove;
    }

    public static Cidade principalityOfGritesthr() {
        Cidade principalityOfGritesthr = new Cidade("Principality Of Gritesthr", null, 5);
        return principalityOfGritesthr;
    }

    public static Cidade kingdomOfLastwatch() {
        Cidade kingdomOfLastwatch = new Cidade("Kingdom Of Lastwatch", null, -2);
        return kingdomOfLastwatch;
    }

    public static Cidade grandDuchyOfSmalia() {
        Cidade grandDuchyOfSmalia = new Cidade("Grand Duchy Of Smalia", null, 1);
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
        Cidade aymarLeague = new Cidade("Aymar League", null, 1);
        return aymarLeague;
    }

    public static Cidade principalityOfKarhora() {
        Cidade principalityOfKarhora = new Cidade("Principality Of Karhora", null, -2);
        return principalityOfKarhora;
    }

    public static Cidade vuneseEmpire() {
        Cidade vuneseEmpire = new Cidade("Vunese Empire", null, 0);
        return vuneseEmpire;
    }

    public static Cidade bun() {
        Cidade bun = new Cidade("Bun", null, 5);
        return bun;
    }

    public static Cidade nargumun() {
        Cidade nargumun = new Cidade("Nargumun", null, 0);
        return nargumun;
    }

    public static Cidade chandirSultanate() {
        Cidade chandirSultanate = new Cidade("Chandir Sultanate", null, 1);
        return chandirSultanate;
    }

    public static Cidade principalityOfKasya() {
        Cidade principalityOfKasya = new Cidade("Principality Of Kasyanull", null, -7);
        return principalityOfKasya;
    }
}