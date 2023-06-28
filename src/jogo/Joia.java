package src.jogo;

public class Joia {
    private int poderJoia;

    public Joia(int poderJoia) {
        this.poderJoia = poderJoia;
    }

    public int getPoderJoia() {
        return poderJoia;
    }

    public void setPoderJoia(int poderJoia) {
        this.poderJoia = poderJoia;
    }

    public void alterarJoia(Joia joia, int valor) {
        joia.setPoderJoia(getPoderJoia() + (valor));
    }

}