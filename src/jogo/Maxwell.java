package src.jogo;

public class Maxwell {
    private int moedas;
    private int limitador;
    private int joiaPoder;

    public Maxwell(int moedas, int limitador, int joiaPoder) {
        this.moedas = moedas;
        this.limitador = limitador;
        this.joiaPoder = joiaPoder;
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

    public int getJoiaPoder() {
        return joiaPoder;
    }

    public void setJoiaPoder(int joiaPoder) {
        this.joiaPoder = joiaPoder;
    }
}