package src.jogo;

public class Maxwell {
    private int moedas;
    private int limitador;
    private int rota;

    public Maxwell() {
        this.moedas = 3;
        this.limitador = 7;
        this.rota = 0;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }

    public int getLimitador() {
        return limitador;
    }

    public void setLimitador(int limitador) {
        this.limitador = limitador;
    }

    public int getRota() {
        return rota;
    }

    public void setRota(int rota) {
        this.rota = rota;
    }

}