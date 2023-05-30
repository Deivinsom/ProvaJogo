package src.jogo;

public class Maxwell {
    private int moedas;
    private int limitador;
    private Joia joia;

    public Maxwell(int moedas, int limitador, Joia joia) {
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

    public Joia getJoia() {
        return joia;
    }

    public void setJoia(Joia joia) {
        this.joia = joia;
    }
    
}
