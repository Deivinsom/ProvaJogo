package src.jogo;

public class Maxwell {
    private int moedas;
    private int limitador;
    private int cidadeAtual;

    public Maxwell(int moedas, int limitador, int cidadeAtual) {
        this.moedas = moedas;
        this.limitador = limitador;
        this.cidadeAtual = cidadeAtual;
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

    public int getcidadeAtual() {
        return cidadeAtual;
    }

    public void setcidadeAtual(int cidadeAtual) {
        this.cidadeAtual = cidadeAtual;
    }

}