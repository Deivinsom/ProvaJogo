package src.jogo;

public class Maxwell {
    private int moedas;
    private int limitador;
    private int joia;

    public Maxwell(int moedas, int limitador, int joia) {
        this.moedas = moedas;
        this.limitador = limitador;
        this.joia = joia;
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

    public int getJoia() {
        return joia;
    }

    public void setJoia(int joia) {
        this.joia = joia;
    }
}
