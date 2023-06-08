package src.jogo;

public class Joia {
    private int poderJoia;

    public Joia() {
        this.poderJoia = 0;
    }

    public int getPoderJoia() {
        return poderJoia;
    }

    public void setPoderJoia(int poderJoia) {
        this.poderJoia = poderJoia;
    }

    public void alterarJoia(int valor) {
        this.poderJoia = poderJoia + valor;
    }

}