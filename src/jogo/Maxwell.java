package src.jogo;

public class Maxwell {
    private static int moedas;
    private static int limitador;
    private static int rota;

    public Maxwell() {
        Maxwell.moedas = 3;
        Maxwell.limitador = 7;
        Maxwell.rota = 0;
    }

    public static int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        Maxwell.moedas = moedas;
    }

    public static int getLimitador() {
        return limitador;
    }

    public void setLimitador(int limitador) {
        Maxwell.limitador = limitador;
    }

    public static int getRota() {
        return rota;
    }

    public void setRota(int rota) {
        Maxwell.rota = rota;
    }

    public static Maxwell iniciarMax() {
        Maxwell max = new Maxwell();
        return max;
    }

}